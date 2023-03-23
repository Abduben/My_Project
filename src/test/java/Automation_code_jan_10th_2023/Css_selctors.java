package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selctors {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		 Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li.dropdown a i + span")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right > li > a")).click();
		Thread.sleep(1000);
		
		String actualurl = "http://tutorialsninja.com/demo/index.php?route=account/register";
		String expectedurl = driver.getCurrentUrl();
		
		WebElement first_name_text = driver.findElement(By.cssSelector("input#input-firstname"));
		WebElement last_name_text = driver.findElement(By.cssSelector("input#input-lastname"));
		WebElement email = driver.findElement(By.cssSelector("input#input-email"));
		WebElement telephone = driver.findElement(By.cssSelector("input#input-telephone"));
		WebElement password = driver.findElement(By.cssSelector("input#input-password"));
		WebElement confirm_password = driver.findElement(By.cssSelector("input#input-confirm"));
		WebElement Radio_button = driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@name = 'agree']"));
		
		
		if (actualurl.equals(expectedurl)) {
	
				first_name_text.sendKeys("Abdu");
				Thread.sleep(1000);
				last_name_text.sendKeys("Ben");
				Thread.sleep(1000);
				email.sendKeys("Boss562187@gmail.com");
				Thread.sleep(1000);
				telephone.sendKeys("5712341642");
				Thread.sleep(1000);
				password.sendKeys("12345");
				Thread.sleep(1000);
				confirm_password.sendKeys("12345");
				Thread.sleep(1000);
				Radio_button.click();
				Thread.sleep(1000);
				checkbox.click();
				Thread.sleep(1000);
		}else {
			System.out.println("the page is not corerct");
		}
		
		if (Radio_button.isSelected() && checkbox.isSelected() ) {
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		} else {
		 System.out.println("the Newsletter radiobutton and Privacy Checkbox are checked");
		}
		
		 Thread.sleep(2000);
		 
		 String actualurl3 = "http://tutorialsninja.com/demo/index.php?route=account/success";
		 String expectedurl3 = driver.getCurrentUrl();
		 
		 if (actualurl3.equals(expectedurl3)) {
			 
			 driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		 }
		 
	
		driver.findElement(By.xpath("//div[@class = 'list-group']/child::a[text()= 'Logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("li.dropdown a i + span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right li+ li a")).click();
		Thread.sleep(1000);
		
		 
		 String actualtitle = "Account Login" ;
		 String expectedtitle = driver.getTitle();
		 
		 if (actualtitle.equals(expectedtitle)) {
			 
			 driver.findElement(By.cssSelector("input[id = input-email]")).sendKeys("Boss562187@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input#input-password.form-control")).sendKeys("12345");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		 }
		 
		 Thread.sleep(3000); 
	}

}
