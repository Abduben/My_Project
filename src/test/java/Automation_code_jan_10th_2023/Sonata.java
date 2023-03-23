package Automation_code_jan_10th_2023;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sonata {


	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("http://103.54.58.89/Auth/Login");
	   }
}

