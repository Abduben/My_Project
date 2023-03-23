package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ninjatutorial_xpath_homework {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		 Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@id, 'top-links')]/descendant::li[2]/child::ul/descendant::a")).click();
		Thread.sleep(1000);
		
		String actualurl = "http://tutorialsninja.com/demo/index.php?route=account/register";
		String expectedurl = driver.getCurrentUrl();
		
		WebElement first_name_text = driver.findElement(By.xpath("//input[@id = 'input-firstname']"));
		WebElement last_name_text = driver.findElement(By.xpath("//input[contains(@id, 'input-lastname')]"));
		WebElement email = driver.findElement(By.xpath("//input[@id = 'input-email']"));
		WebElement telephone = driver.findElement(By.xpath("//input[contains(@id, 'input-telephone')]"));
		WebElement password = driver.findElement(By.xpath("//input[@id = 'input-password']"));
		WebElement confirm_password = driver.findElement(By.xpath("//input[contains(@id, 'input-confirm')]"));
		WebElement Radio_button = driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@name = 'agree']"));
		
		
		if (actualurl.equals(expectedurl)) {
	
				first_name_text.sendKeys("Abdu");
				Thread.sleep(1000);
				last_name_text.sendKeys("Ben");
				Thread.sleep(1000);
				email.sendKeys("Boss176@gmail.com");
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
		 
		driver.findElement(By.xpath("//aside[@id= 'column-right']/descendant::a[@class= 'list-group-item'][13]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class = 'caret']/preceding-sibling::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class = 'list-inline']/child::li[2]/child::ul/descendant::a[2]")).click();
		Thread.sleep(1000);
		 
		 String actualtitle = "Account Login" ;
		 String expectedtitle = driver.getTitle();
		 
		 if (actualtitle.equals(expectedtitle)) {
			 
			 driver.findElement(By.xpath("//input[@id= 'input-email']")).sendKeys("Benmoussa@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("12345");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//aside[@id= 'column-right']/descendant::a[@class= 'list-group-item'][13]")).click();
		 }
		 
		 Thread.sleep(3000); 
		


	}

}
