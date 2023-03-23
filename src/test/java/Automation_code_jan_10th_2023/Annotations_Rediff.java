package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Rediff {
	public WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		Thread.sleep (1000);
	}
		
	@Test (priority = 1)
	public void clickonSignIn() {
		driver.findElement(By.className("signin")).click();
		}
	
	@Test (priority = 2)
	public void enterUsenameandPassowrd() throws InterruptedException {
		driver.findElement(By.className("signin")).click();
		Thread.sleep (1000);
		driver.findElement(By.id("login1")).sendKeys("Abduben12@gmail.com");
		Thread.sleep (1000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep (1000);
		driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test (priority = 3)
	public void clickonVideos() throws InterruptedException {
		Thread.sleep (1000);
		driver.findElement(By.xpath("//div[@class = 'cell topicons']/a[text()= 'Videos']")).click();
		
	}

	@Test (priority = 4)
    public void srchbox() throws InterruptedException {
		Thread.sleep (1000);
		driver.findElement(By.id("srchword")).sendKeys("India");
		
	}
	
	@Test(priority = 5)
	public void clickimage() {
		driver.findElement(By.cssSelector("h5.relative a img")).click();
	}
	
   @Test (priority = 6)
   public void uploadvideo() {
	   driver.findElement(By.xpath("//div[@class = 'cell topicons']/a[text()= 'Videos']")).click();
	   driver.findElement(By.id("srchword")).sendKeys("nature");
	   driver.findElement(By.className("submit")).click();
	   
   }
   
   @Test (priority =7)
   
  public void clickonLogo() {
	   driver.findElement(By.xpath("//div[@class = 'cell topicons']/a[text()= 'Videos']")).click();
	   driver.findElement(By.linkText("rediff.com")).click();
   }
   
   @AfterMethod
   public void quie() {
	   driver.quit();
   }
   

}
