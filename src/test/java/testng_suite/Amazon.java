package testng_suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
			
	}
	
	@Test
	public void amazon() {
		System.out.println("Amazon");
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

	
}
