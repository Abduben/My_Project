package Automation_code_jan_10th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		
		// simple synatx
		//for one attribute  the syntax is //html[@attribute = 'j']
		// for two attributes the syntax is //html[@attribute = 'j' and  @attribute = 'a']
		// for two attributes the syntax is //html[@attribute = 'j' or  @attribute = 'a']
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
		
		
		
	//	driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
//		driver.findElement(By.xpath("//input[@id='input-firstname' and @name='firstname']")).sendKeys("Abdu");
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Ben");
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Betwn@gmail.com");
//		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("1234567890");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Ben123#");
//		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Ben123#");
//		//driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input")).click();
//		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();		
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
		
		// meduim syntax
		//html[text() = 'valueofthetext']            // this kind of xpath only work for links
		//html[contains(text(),'valueofthetext')]     // this kind of xpath only work for links
		//html[contains(@attribute, 'value')]
	
		driver.findElement(By.xpath("//input[contains(@id,'input-firstname')]")).sendKeys("Abdu");
		driver.findElement(By.xpath("//input[contains(@id, 'input-lastname')]")).sendKeys("Ben");
		driver.findElement(By.xpath("//input[contains(@id, 'input-email')] ")).sendKeys("Betpotpn@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'input-telephone')] ")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("Ben123#");
		driver.findElement(By.xpath("//input[contains(@id, 'input-confirm')] ")).sendKeys("Ben123#");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();		
		driver.findElement(By.xpath("//input[contains(@name, 'agree')]")).click();
		driver.findElement(By.xpath("//input[contains(@class, 'btn btn-primary')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Brands')]")).click();
		driver.findElement(By.xpath("//a[text() = 'About Us']")).click();
		
	
		//Advanced Xpath
		
//		ancestor
//		parent
//		child
//		following-sibling
//		preceding-sibling
		
		
		
		
		
	
	
	
	
	}

}
