package Automation_code_jan_10th_2023;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class screenshot {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void OpenBrwoser() throws InterruptedException {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jeevansathi.com"); Thread.sleep(2000);
    }
	
	@Test
	public void Ssreenshot() throws IOException {
		
		WebElement Pic =  driver.findElement(By.xpath("//div[@id = 'firstBlockContainer']/parent::article"));
		
		File Desti = new File("C:\\Users\\Abderrahim BenMoussa\\Desktop\\New folder (3)\\Image.png");
		File source = Pic.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(source, Desti);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
