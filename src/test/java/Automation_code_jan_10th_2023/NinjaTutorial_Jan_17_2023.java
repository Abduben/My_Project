package Automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaTutorial_Jan_17_2023 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Abderrahim");
		driver.findElement(By.id("input-lastname")).sendKeys("Benmoussa");
		driver.findElement(By.id("input-email")).sendKeys("Abdn12@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("5715982933");
		driver.findElement(By.id("input-password")).sendKeys("Naruto123#");
		driver.findElement(By.id("input-confirm")).sendKeys("Naruto123#");
		
		
		
		WebElement checkbox = driver.findElement(By.name("agree"));
		
	
		
		if (checkbox.isDisplayed() && checkbox.isEnabled() && checkbox.isSelected()) {
			
			driver.findElement(By.name("agree")).click();
		}
			
		
	
		

	}

}
