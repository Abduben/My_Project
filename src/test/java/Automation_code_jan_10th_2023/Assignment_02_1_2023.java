package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_02_1_2023 {
	public WebDriver driver;
	
	
	
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.tutorialsninja.com/demo/");
		 Thread.sleep(1000);
	}
	
	
	@Test 
	public void registerPage() throws InterruptedException {
		Assert.fail();
		 driver.findElement(By.cssSelector("i.fa.fa-user+span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Register")).click();
	}
	
	@Test (dependsOnMethods = "registerPage")
	public void rgisteraccProvideallfields() throws InterruptedException {
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	
			WebElement CheckBox = driver.findElement(By.name("agree"));
			
			driver.findElement(By.id("input-firstname")).sendKeys("Abderrahim"); Thread.sleep(1000);
			driver.findElement(By.id("input-lastname")).sendKeys("Ben Moussa"); Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Abdu1116@gmail.com"); Thread.sleep(1000);
			driver.findElement(By.id("input-telephone")).sendKeys("1234567890"); Thread.sleep(1000);
			driver.findElement(By.id("input-password")).sendKeys("Abdu123#"); Thread.sleep(1000);
			driver.findElement(By.id("input-confirm")).sendKeys("Abdu123#"); Thread.sleep(1000);
		    CheckBox.click(); 
		    driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); Thread.sleep(1000);
		    	  

	}
	
	@Test (dependsOnMethods = {"registerPage" , "rgisteraccProvideallfields"}, alwaysRun = true, invocationCount =2 )
	public void Login() throws InterruptedException {
		
		 driver.findElement(By.cssSelector("i.fa.fa-user+span")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()= 'Login']")).click();Thread.sleep(1000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	

}
