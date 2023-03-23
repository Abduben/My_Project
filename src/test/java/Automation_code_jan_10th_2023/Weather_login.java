package Automation_code_jan_10th_2023;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weather_login {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li[@class= 'user-li']/child::a")).click();
		Thread.sleep(1000);
		
		String actualtitle = "Members";
		String expectedtitle = driver.getTitle();
		
		String actualurl = "https://home.openweathermap.org/users/sign_in";
		String expectedurl = driver.getCurrentUrl();
		
		
		if (actualtitle.equals(expectedtitle) && actualurl.equals(expectedurl)) {
			
			driver.findElement(By.xpath("//input[contains(@id, 'user_email')]")).sendKeys("Benmoussamalika73@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id = 'user_password']")).sendKeys("malika123#");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id = 'user_remember_me' and @name = 'user[remember_me]']")).click();
			
		} else {
			System.out.println("The login page is incorrect");
		}
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id = 'user_remember_me' and @name = 'user[remember_me]']"));
		
		if(checkbox.isSelected()) {
			driver.findElement(By.xpath("//input[@name = 'commit']")).click();
			Thread.sleep(2000);
		}else {
			System.out.println("teh credentials are wrong");
		}
		
		driver.findElement(By.xpath("//div[contains(@id, 'user-dropdown')]/child::div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class = 'logout']")).click();
		
		
	}

}



