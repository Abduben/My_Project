package date_03_14_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
	      options = new ChromeOptions();
	      options.addArguments("--start-maximized");
	      options.addArguments("--remote-allow-origins=*");
	      driver = new ChromeDriver(options);
	      driver.get("https://www.makemytrip.com/?ccde=us");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//span[contains(@class, 'tabsCircle appendRight5')]/parent::li[@data-cy ='roundTrip']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.cssSelector("div.fsw_inputBox.searchCity.inactiveWidget label")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/preceding-sibling::input")).sendKeys("Morocco");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//p[contains(text(), 'Marrakesh, Morocco')]")).click();
	      
	      
	      
	      driver.findElement(By.xpath("//input[@id='toCity']/parent::label[@for='toCity']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/preceding-sibling::input")).sendKeys("France");
	      Thread.sleep(2000);
	      
	      WebElement Paris =  driver.findElement(By.cssSelector("li#react-autowhatever-1-section-0-item-0"));
	      
	      wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	      wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li#react-autowhatever-1-section-0-item-0")));
	      Paris.click();
	      
	      selectDateCalendarDeparture("15","June2023");
	      selectDateCalendarReturn("29","January2024");
	  
	      
	      
	}
	      
	      public static void selectDateCalendarDeparture (String calendarDay, String calenderMonthYear) {
	    	 
	    	
	    		if (Integer.parseInt(calendarDay) > 31) {
	    		System.out.println("Invalid Date");
	    		return;
	    		}
	    		String calendarMonth = "February";
	    		if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
	    		System.out.println("Invalid Date");
	    		return;
	    		}

	    		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption div")).getText();
	    		System.out.println(monthYear);

	    		while (!(monthYear.equals(calenderMonthYear))) {
	    		driver.findElement(By.cssSelector("div.DayPicker-NavBar span+span")).click();
	    		}

	    		String dynamicXpath = "//div[@class= 'dateInnerCell']/child::p[text()= '"+ calendarDay +"']";
	    		
	    		try {
	    		driver.findElement(By.xpath(dynamicXpath)).click();
	    	    Thread.sleep(1000);
	    		} catch (Exception e) {
	    		System.out.println("Invalid Date");
	    		}
	    }
	      
	      
	      public static void selectDateCalendarReturn (String calendarDay, String calenderMonthYear) {
	    	 
	    	  
	    		if (Integer.parseInt(calendarDay) > 31) {
	    		System.out.println("Invalid Date");
	    		return;
	    		}
	    		String calendarMonth = "February";
	    		if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
	    		System.out.println("Invalid Date");
	    		return;
	    		}

	    		String monthYear = driver.findElement(By.cssSelector("div.DayPicker-Caption div")).getText();
	    		System.out.println(monthYear);

	    		while (!(monthYear.equals(calenderMonthYear))) {
	    		driver.findElement(By.cssSelector("div.DayPicker-NavBar span+span")).click();
	    	
	    		}

	    		String dynamicXpath = "//div[@class= 'dateInnerCell']/child::p[text()= '"+ calendarDay +"']";
	    		try {
	    		driver.findElement(By.xpath(dynamicXpath)).click();
	    	    Thread.sleep(1000);
	    		} catch (Exception e) {
	    		System.out.println("Invalid Date");
	    		}
	      }

	}


