package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ninja {
	
	public static WebDriver driver;
	public SoftAssert soft = new SoftAssert();
	
	
	@Test
	@Parameters ({"U","P"})
	
	public void ninjaPara(@Optional("Abdu873900111@gmail.com")String email, String U, String P ) {
		
	ChromeOptions option = new ChromeOptions();
	option.setPageLoadStrategy(PageLoadStrategy.EAGER);
	option.addArguments("--start-maximized");
	option.addArguments("--incognito");
	 driver= new ChromeDriver(option);

	  driver.get(U);
	  
	  driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span")).click();
	   driver.findElement(By.linkText("Login")).click();
	
	   
	   String ActualTitle = "Account Login";
	   String ExpectedTitle = driver.getTitle();
	   Assert.assertEquals(ActualTitle, ExpectedTitle);
	   
	   driver.findElement(By.id("input-email")).sendKeys(email);
	   driver.findElement(By.id("input-password")).sendKeys(P); 
	   driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	  
	   soft.assertTrue(driver.findElement(By.cssSelector("div#content h2")).isDisplayed());
	   driver.findElement(By.linkText("Logout")).click();	
		
	}

}
