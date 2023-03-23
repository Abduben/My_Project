package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		WebElement checkbox = driver.findElement(By.id("remember"));
		
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		
		
		if (checkbox.isDisplayed() && checkbox.isEnabled() && checkbox.isSelected()) {
			
			driver.findElement(By.className("signinbtn")).click();
		}
		

	}

}
