package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaTutorial_Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		Thread.sleep(2000);
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		String actualtitle = "Your Store";
		String expectedtitle = driver.getTitle();
		
		String actualurl = "http://www.tutorialsninja.com/demo/";
		String expectedurl = driver.getCurrentUrl();
		
		if(actualtitle.equals(expectedtitle) && actualurl.equals(expectedurl)) {
			driver.findElement(By.linkText("About Us")).click();
			
		}else {
			System.out.println("something is wrong");
		}
		 Thread.sleep(2000);
		 driver.navigate().back();
		 driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		 
//		 System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		String actualtitle2 = "Register Account"; 
		String expectedtitle2 = driver.getTitle();
		
		String actualurl2 = "http://tutorialsninja.com/demo/index.php?route=account/register" ;
		String expectedurl2 = driver.getCurrentUrl();
		
		
		WebElement first_name_text = driver.findElement(By.id("input-firstname"));
		WebElement last_name_text = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirm_password = driver.findElement(By.id("input-confirm"));
		WebElement checkbox = driver.findElement(By.name("agree"));
		
		
		if (actualtitle2.equals(expectedtitle2) && actualurl2.equals(expectedurl2)) {
				
			 if (first_name_text.isDisplayed() && first_name_text.isEnabled()) {
				 first_name_text.sendKeys("Abderrahim");
				 Thread.sleep(1000);
			 } else {
				 System.out.println("something is wring with the first name textbox");
			 }
			 
			 if (last_name_text.isDisplayed() || last_name_text.isEnabled() || last_name_text.isSelected()) {
				 last_name_text.sendKeys("Ben Moussa");
				 Thread.sleep(1000);
			 }else {
				 System.out.println("something is wring with the last name textbox");
			 }
			 
			 if (email.isDisplayed() && email.isEnabled()) {
				 email.sendKeys("Abb10@gmail.com");
				 Thread.sleep(1000);

			 }else {
				 System.out.println("something is wring with the email textbox");
			 }
			 
			 if (telephone.isDisplayed() && telephone.isEnabled() || telephone.isSelected()) {
				 telephone.sendKeys("5714526712");
				 Thread.sleep(1000);
			 }else {
				 System.out.println("something is wring with the telephone textbox");
			 }
				 
			 if (password.isDisplayed()) {
				 password.sendKeys("Abdu123#");
				 Thread.sleep(1000);
			 } else {
				 System.out.println("something is wring with the password textbox");
			 }
			 
			 if (confirm_password.isEnabled()) {
				 confirm_password.sendKeys("Abdu123#");
				 Thread.sleep(1000);
			 } else {
				 System.out.println("something is wring with the confirm password textbox");
			 }
			 
			 if (checkbox.isDisplayed() && checkbox.isEnabled()) {
				 checkbox.click();
				 Thread.sleep(1000);
			 }else {
				 System.out.println("something is wring with the check box");
			 } 			
		}

		if (checkbox.isSelected()) {
			 driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			 Thread.sleep(2000);
		} else {
			 System.out.println("Something is wrong with the continue button");
		 }
		 
		
		 String actualtitle3 = "Your Account Has Been Created!";
		 String expectedtitle3 = driver.getTitle();
		 
		 String actualurl3 = "http://tutorialsninja.com/demo/index.php?route=account/success";
		 String expectedurl3 = driver.getCurrentUrl();
		 
		 WebElement Continue_button = driver.findElement(By.linkText("Continue"));
		 
		 if (actualtitle3.equals(expectedtitle3) && actualurl3.equals(expectedurl3)) {
			 Continue_button.click();	
		 }
		 
		
		  
		  String actualurl4 = "http://tutorialsninja.com/demo/index.php?route=account/account";
	      String expectedurl4 = driver.getCurrentUrl();
	      
	      if (actualurl4.equals(expectedurl4)) {
	    	  driver.findElement(By.linkText("Logout")).click();
	    	 Thread.sleep(5000);	    
	    	 } else { 
	             System.out.println("Something is wrong with the logout");
	    	 }
	      
	      driver.quit();
		 
		 
	}

}

