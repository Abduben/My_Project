package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {

	public static void main(String[] args) throws InterruptedException {
	
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com");
			Thread.sleep(5000); 
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			String actualtitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
			String exepectedtitle = driver.getTitle();
			
			String actualurl = "https://www.rediff.com/";
			String exepectedurl = driver.getCurrentUrl();
			
			if (actualtitle.equals(exepectedtitle) && actualurl.equals(exepectedurl)) {
				driver.findElement(By.className("signin")).click();
			}else {
				System.out.println("Something is wrong");
			}
			
			System.out.println("**********************************************************************");
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

			String actualtitle1 = "Rediffmail";
			String exepectedtile1 = driver.getTitle();
			
			String actualurl1 = "https://mail.rediff.com/cgi-bin/login.cgi";
			String exepectedurl1 = driver.getCurrentUrl();
			
			if (actualtitle1.equals(exepectedtile1) && actualurl1.equals(exepectedurl1) ) {
				driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
				driver.findElement(By.id("password")).sendKeys("Selenium@123");
				driver.findElement(By.className("signinbtn")).click();
			}else {
				System.out.println("something is wrong");
			}
			
			System.out.println("**********************************************************************");
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			String actualtitle2 = "Rediffmail";
			String exepectedtitle2 = driver.getTitle();
			
			String actualurl2 = "https://f5mail.rediff.com/ajaxprism/container?angular=1&els=d714f018e110ae17049d9dfb5f98c65f&user_size=1";
			String exepectedurl2 = driver.getCurrentUrl(); 
			
			if (actualtitle2.equals(exepectedtitle2) && actualurl2.equals(exepectedurl2)) {
				driver.findElement(By.className("rd_logout")).click();
			}else {
				System.out.println("something went wrong");
			}
			
			System.out.println("**********************************************************************");	
			
			

	}

}
