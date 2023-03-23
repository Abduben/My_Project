package Automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Multiple_browser_code {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	driver.get("https://Rediff.com");

	
	
		

	}

}
