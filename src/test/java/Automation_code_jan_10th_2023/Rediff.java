package Automation_code_jan_10th_2023;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://Rediff.com");
//		driver.findElement(By.className("signin")).click();
//		driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
//		driver.findElement(By.id("password")).sendKeys("Selenium@123");
//		driver.findElement(By.className("signinbtn")).click();
		
		driver.findElement(By.linkText("Rediffmail")).click();
	    driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Money")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Business Email")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Videos")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Shopping")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		

	}

}
