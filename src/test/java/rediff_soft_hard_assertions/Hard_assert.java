package rediff_soft_hard_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Hard_assert {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	
	

	@BeforeMethod
	public void launch() {
		
		options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	
		
	driver = new ChromeDriver(options);
	driver.get("https://rediff.com");
	}

	@Test
	public void clickOnLoginTest() {
		
		String url = "https://www.rediff.com/";
		String expectedurl = driver.getCurrentUrl(); 
		 Assert.assertEquals(url, expectedurl);

		
	driver.findElement(By.className("signin")).click();
	

	
	}

	@Test
	public void enterCredentialsTest() throws InterruptedException {
		
	driver.findElement(By.className("signin")).click(); Thread.sleep(1000);
	
	String Title = "Rediffmail";
	String expectedtitle = driver.getTitle(); 
	Assert.assertEquals(Title, expectedtitle);
     
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Selenium@123");Thread.sleep(1000);
	driver.findElement(By.className("signinbtn")).click();Thread.sleep(1000);
	}

	@Test
	public void logOutTest() throws Exception {
		
	driver.findElement(By.className("signin")).click(); Thread.sleep(1000);
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com"); Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Selenium@123"); Thread.sleep(1000);
	driver.findElement(By.className("signinbtn")).click(); 
	Thread.sleep(5000);
	
	WebElement val = driver.findElement(By.className("rd_active"));
	Assert.assertTrue(val.isDisplayed());
			
	driver.findElement(By.className("rd_logout")).click(); Thread.sleep(1000);
	}

	@Test
	public void validateLogOutPageTest() throws Exception {
	
	driver.findElement(By.className("signin")).click(); Thread.sleep(1000);
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com"); Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Selenium@123"); Thread.sleep(1000);
	driver.findElement(By.className("signinbtn")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.className("rd_logout")).click(); Thread.sleep(3000);
	
	
	WebElement validate = driver.findElement(By.cssSelector("div.panel p"));
	String logout = "You have successfully signed out of Rediffmail.";
	Assert.assertEquals(validate.getText(), logout);
	
	
	driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
	}


	@AfterMethod
	public void teardown() {
	driver.quit();
	}

}
