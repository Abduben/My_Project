package Automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows {
	
	public static WebDriver driver;
	
	@Test(invocationCount = 2)
	public void openTabs() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
		
		// opem a new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
		
		// open a window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("http://tutorialsninja.com/demo");
	
	}

}
