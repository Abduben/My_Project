package date_03_14_2023;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Chromedriver111 {
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {
	
      options = new ChromeOptions();
      options.addArguments("--size-maximized");
      options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
      
     // WebElement refPoint = driver.findElement(By.id("input-email"));
      
      //driver.findElement(with(By.tagName("input")).below(refPoint)).sendKeys("Abdu");
      
      
      //driver.findElement(with(By.tagName("a")).toRightOf(refPoint)).click();
    		  
    		  
      WebElement refPoint = driver.findElement(By.id("input-password"));
      
      
      driver.findElement(with(By.tagName("a")).toLeftOf(refPoint)).click();
      
      
      
      
		
		

	}

}
