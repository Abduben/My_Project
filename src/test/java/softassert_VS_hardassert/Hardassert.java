package softassert_VS_hardassert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hardassert {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
	}
	
	
	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.cssSelector("i.fa.fa-user +span")).click(); Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()= 'Login']")).click();Thread.sleep(1000);
		
	
	String actualurl = "http://tutorialsninja.com/demo/index.php?route=account/login";
	String expectedurl = driver.getCurrentUrl();
	
     Assert.assertEquals(actualurl, expectedurl);
		
		driver.findElement(By.id("input-email")).sendKeys("abdu123@gmail.com"); Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("123456789"); Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); Thread.sleep(1000);
		
		
		WebElement validate = driver.findElement(By.cssSelector("div#content h2"));
		Assert.assertTrue(validate.isDisplayed());
		driver.findElement(By.linkText("Logout")).click();Thread.sleep(1000);
		
		String Title1 = "Account Logout";
		WebElement val = driver.findElement(By.xpath("//div[@id='content']/child::h1"));
		
		Assert.assertEquals(val.getText(), Title1);
		
		driver.findElement(By.linkText("Continue")).click(); Thread.sleep(1000);
		 
		


		
	}
	
	@AfterMethod
	
	public void quit() {
		driver.quit();
	}

}
