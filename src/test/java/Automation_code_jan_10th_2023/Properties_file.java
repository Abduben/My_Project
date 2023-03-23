package Automation_code_jan_10th_2023;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Properties_file {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties pro = new Properties();
		//C:\Users\Abderrahim BenMoussa\eclipse-workspace\ADVENCED-MAVEN-PROJECT
		System.out.println(System.getProperty("user.dir"));
		FileInputStream  file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Automation_code_jan_10th_2023\\Text_file");
		pro.load(file);
		
	
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");
		chrome.addArguments("--incognito");
		
		driver = new ChromeDriver(chrome);
		
		driver.get(pro.getProperty("url"));
		 driver.findElement(By.xpath(pro.getProperty("myaccount"))).click();
		driver.findElement(By.linkText(pro.getProperty("lg"))).click();
		driver.findElement(By.xpath(pro.getProperty("com"))).sendKeys(pro.getProperty("email"));
		driver.findElement(By.xpath(pro.getProperty("path"))).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath(pro.getProperty("button"))).click();
		
		
		
		
		
		
		

	}

}
