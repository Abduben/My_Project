package Automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screen_recording_ninja {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	

	public static void main(String[] args) throws Exception {
		
		
		ScreenRecorderUtil.startRecord("main");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.tutorialsninja.com/demo/");
		
		
		WebElement Myaccount = driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span"));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Myaccount));
		Myaccount.click();
		
		 
		WebElement Mylogin = driver.findElement(By.linkText("Login"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Mylogin));
		Mylogin.click();
		
		
		
			
		
		WebElement emailText = driver.findElement(By.xpath("//input[@id= 'input-email']"));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(emailText));
		emailText.sendKeys("Boss176@gmail.com");
		
		
		 driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("12345");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//aside[@id= 'column-right']/descendant::a[@class= 'list-group-item'][13]")).click();
		 
		ScreenRecorderUtil.stopRecord();
		
	}

}
