package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class rediff_recording {
	
	
	

	public static WebDriver driver;
	

	
	@Test
	public void enterCredentialsTest() throws Exception {
		ScreenRecorderUtil.startRecord ("launch");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	driver.findElement(By.className("signin")).click();
	 driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com"); Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Selenium@123"); Thread.sleep(1000);
	driver.findElement(By.className("signinbtn")).click(); Thread.sleep(1000);
	
	ScreenRecorderUtil.stopRecord(); 
	}
	
	
}
