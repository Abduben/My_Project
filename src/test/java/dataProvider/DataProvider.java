package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class DataProvider {
	public static WebDriver driver;
	public static SoftAssert soft = new SoftAssert();
	
	
	@BeforeMethod
	public void openBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		
		driver = new ChromeDriver(option);
		driver.get("https://rediff.com");
		
	}

    @Test(priority =1, dataProvider = "data", dataProviderClass = dataProvider_File.class) // or (dataProvider = "dataSupply")
public static void logintoRediff(String username, String password) {

    driver.findElement(By.className("signin")).click();
    
    String Actualurl = "https://mail.rediff.com/cgi-bin/login.cgi";
    String expectedurl = driver.getCurrentUrl();
	soft.assertEquals(Actualurl, expectedurl);
	
	driver.findElement(By.id("login1")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	soft.assertTrue(driver.findElement(By.id("remember")).isEnabled());
	
	driver.findElement(By.className("signinbtn")).click();
	
	}
    
    @Test(priority = 2)
    public static void registertoNinja() throws IOException, InterruptedException {
    	
    	driver.switchTo().newWindow(WindowType.TAB);
    	driver.navigate().to("http://www.tutorialsninja.com/demo/");
    	 Assert.assertTrue(driver.findElement(By.linkText("Your Store")).isDisplayed());
    	 
    	 driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span")).click();
    	 driver.findElement(By.xpath("//div[contains(@id, 'top-links')]/descendant::li[2]/child::ul/descendant::a")).click();
    	 
    	 Properties pro = new Properties();
    	 FileInputStream  file = new FileInputStream ("C:\\Users\\Abderrahim BenMoussa\\eclipse-workspace\\ADVENCED-MAVEN-PROJECT\\src\\test\\java\\dataProvider\\Propertie_file");
    	 pro.load(file);
    	 
    	 WebElement first_name_text = driver.findElement(By.xpath(pro.getProperty("F_name")));
 		WebElement last_name_text = driver.findElement(By.xpath(pro.getProperty("L_name")));
 		WebElement email = driver.findElement(By.xpath(pro.getProperty("email")));
 		WebElement telephone = driver.findElement(By.xpath(pro.getProperty("phone")));
 		WebElement password = driver.findElement(By.xpath(pro.getProperty("password")));
 		WebElement confirm_password = driver.findElement(By.xpath(pro.getProperty("confirm_password")));
 		WebElement Radio_button = driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']"));
 		WebElement checkbox = driver.findElement(By.xpath("//input[@name = 'agree']"));
 		
 		String actualurl = "http://tutorialsninja.com/demo/index.php?route=account/register";
		String expectedurl = driver.getCurrentUrl();
 		
 		Assert.assertEquals(actualurl, expectedurl);
 	
 				first_name_text.sendKeys("Abderrahim");
 				last_name_text.sendKeys("Ben Moussa");
 				email.sendKeys("Benmoussa9812326@gmail.com");
 				telephone.sendKeys("5712341642");
 				password.sendKeys("12345");
 				confirm_password.sendKeys("12345");
 				Radio_button.click();
 				checkbox.click();
 		soft.assertTrue(checkbox.isSelected());
 		soft.assertTrue(Radio_button.isSelected());
 		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
 	    Thread.sleep(3000);
 		 if (driver.findElement(By.cssSelector("div#content h1")).isDisplayed()) {
 			 driver.findElement(By.linkText("Logout")).click();
 		 }
 }

    
    @Test (priority = 3 , dataProvider = "data1", dataProviderClass = dataProvider_File.class)
	 public static void logintoNinja(String username, String password) {
    	
    	driver.switchTo().newWindow(WindowType.TAB);
    	driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=account/login");
    	
    	driver.findElement(By.id("input-email")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

    	
    }
    
    @AfterMethod
    public void closeBrowser() {
    	driver.quit();
    }

}
