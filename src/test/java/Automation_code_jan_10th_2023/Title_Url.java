package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Url {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com");
	System.out.println("the title of the page: " + driver.getTitle());
	System.out.println("the URL of the page is " + driver.getCurrentUrl());
	System.out.println("-------------------------------------------------------");
	Thread.sleep(5000); 
	
	driver.findElement(By.className("signin")).click();
	System.out.println("the title of the page: " + driver.getTitle());
	System.out.println("the URL of the page is " + driver.getCurrentUrl());
	System.out.println("-------------------------------------------------------");
	
	driver.findElement(By.id("login1")).sendKeys("Seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	System.out.println("the title of the page: " + driver.getTitle());
	System.out.println("the URL of the page is " + driver.getCurrentUrl());
	System.out.println("-------------------------------------------------------");
	
	driver.findElement(By.className("rd_logout")).click();
	System.out.println("the title of the page: " + driver.getTitle());
	System.out.println("the URL of the page is " + driver.getCurrentUrl());
	System.out.println("-------------------------------------------------------");
	
	// how to validate I have to validate using getTtitle. and getCurrenturl
	
	

	}

}
