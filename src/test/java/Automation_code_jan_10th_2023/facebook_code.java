package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_code {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		driver.findElement(By.linkText("Create new account" )).click();
		driver.findElement(By.id("u_9_b_Ja")).sendKeys("Abderahim");
		driver.findElement(By.id("u_9_d_I5")).sendKeys("Ben Moussa");
		driver.findElement(By.id("u_9_g_B/")).sendKeys("Moshdvs@gmail.com");
		driver.findElement(By.id("u_9_j_P7")).sendKeys("Moshdvs@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Maufhah123@");
		
		

	
		
	}

}


// create three objects of dropdown




