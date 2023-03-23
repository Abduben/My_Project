package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Data_Provider {
	
	public static WebDriver driver;
	public static SoftAssert soft;
	
	
	@BeforeMethod
	public void openBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		
		driver = new ChromeDriver(option);
		driver.get("https://rediff.com");
		
	}

    @Test(dataProvider = "data") // or (dataProvider = "dataSupply")
public void logintoRediff(String username, String password) {

	soft = new SoftAssert();
		
    driver.findElement(By.className("signin")).click();
    
    String Actualurl = "https://mail.rediff.com/cgi-bin/login.cgi";
    String expectedurl = driver.getCurrentUrl();
	soft.assertEquals(Actualurl, expectedurl);
	
	driver.findElement(By.id("login1")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	soft.assertTrue(driver.findElement(By.id("remember")).isEnabled());
	
	driver.findElement(By.className("signinbtn")).click();
	
	}
    
    @DataProvider // (name= "dataSupply")
    public String[][] data() {
    	
    	String [][] data = {{"seleniumpanda@rediffmail.com","Selenium@123"},
    						{"seleniumpanda1@rediffmail.com","Selenium@123"},
    						{"seleniumpanda2@rediffmail.com","Selenium@123"},
    						{"seleniumpanda3@rediffmail.com","Selenium@1234"},
    						};
    	return data;
    }
    
    
    @AfterMethod
    public void closeBrowser() {
    	driver.quit();
    }

}
