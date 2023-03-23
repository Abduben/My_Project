package Automation_code_jan_10th_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println(" This is before Suite annotation");
		
	}
	
	@BeforeTest
	public void beforeTest() { 
		System.out.println(" This is before Test annotation");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println(" This is before Class annotation");
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println(" This is before Method annotation");
		
	}
	
	@Test
	public void testCase1() {
		System.out.println(" This is mt test case");
		
	}
	
	@Test
	public void testCase2() {
		System.out.println(" This is the second test case ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println(" This is after Method annotation");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println(" This is after Class annotation");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(" This is after Test annotation");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println(" This is after Suite annotation");
		
	}
}
