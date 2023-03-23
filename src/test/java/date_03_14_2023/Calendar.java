package date_03_14_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	

	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
	options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

	WebElement calendarToBeClicked = driver.findElement(By.id("datepicker"));
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
	calendarToBeClicked.click();


	selectDateCalendar("29", "September", "2025");
	}

	public static void selectDateCalendar(String calendarDay, String calendarMonth, String calendarYear) {
	if (Integer.parseInt(calendarDay) > 31) {
	System.out.println("Invalid Date");
	return;
	}

	if (calendarMonth.equals("February") && Integer.parseInt(calendarDay) > 29) {
	System.out.println("Invalid Date");
	return;
	}

	String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	System.out.println(monthYear);

	// String[] my = monthYear.split("");

	String month = monthYear.split(" ")[0];
	String year = monthYear.split(" ")[1];

	while (!(month.equals(calendarMonth) && year.equals(calendarYear))) {
	driver.findElement(By.xpath("//a[@title = 'Next']")).click();
	monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
	month = monthYear.split(" ")[0];
	year = monthYear.split(" ")[1];
	}

	String dynamicXpath = "//td[@data-handler = 'selectDay']/a[text() = \'" + calendarDay + "\']";

	try {
	driver.findElement(By.xpath(dynamicXpath)).click();
	} catch (Exception e) {
	System.out.println("Invalid Date");
	}
	
	
	      
	      
	      

	}

}
