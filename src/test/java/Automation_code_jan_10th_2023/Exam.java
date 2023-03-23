package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Exam {
	public WebDriver driver;
	public SoftAssert Soft;
	
	@BeforeMethod
	public void Openbrowser() {
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");	
	}
	
	@Test
	public void login() throws InterruptedException {
		Soft = new SoftAssert();
		
		
	driver.findElement(By.cssSelector("i.fa.fa-user")).click();
	driver.findElement(By.linkText("Login")).click();
	
	String ActualTitle = "Account Login";
	String  ExpectedTitle = driver.getTitle();
	Soft.assertEquals(ActualTitle, ExpectedTitle);
	
	driver.findElement(By.id("input-email")).sendKeys("abdu123@gmail.com");Thread.sleep(1000);
	driver.findElement(By.id("input-password")).sendKeys("123456789");Thread.sleep(1000);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();Thread.sleep(1000);
	
	WebElement Validate = driver.findElement(By.xpath("//div[@id = 'content']/child::h2"));
	
	Soft.assertTrue(Validate.isDisplayed());
		
	driver.findElement(By.xpath("//a[text() = 'Laptops & Notebooks']")).click();Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text() = 'Show All Laptops & Notebooks']")).click();Thread.sleep(1000);
	
	WebElement Val = driver.findElement(By.xpath("//div[@id = 'content']/child::h2"));
	String Text = "Laptops & Notebooks";
	Soft.assertEquals(Val, Text);
	
	driver.findElement(By.xpath("//span[text() = 'Add to Cart']")).click();Thread.sleep(1000);
	driver.findElement(By.id("button-cart")).click();Thread.sleep(1000);
	driver.findElement(By.linkText("Shopping Cart")).click();Thread.sleep(1000);
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}
	
		
		
	
	

}
