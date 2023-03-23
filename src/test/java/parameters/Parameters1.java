package parameters;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	
public static WebDriver driver;
	
	
	@Test
	@Parameters ({"browser", "url", "username", "password"})
	
	public void Testngparameters(String browser, String url, String username, String password ) throws InterruptedException {
		
		Assert.assertEquals(browser,"chrome");
	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);	
		
		
		driver.findElement(By.className("signin")).click();Thread.sleep(1000);
	
		driver.findElement(By.id("login1")).sendKeys(username); Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(password);  Thread.sleep(1000);
		driver.findElement(By.className("signinbtn")).click(); Thread.sleep(1000);

		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click(); 
	}

}
