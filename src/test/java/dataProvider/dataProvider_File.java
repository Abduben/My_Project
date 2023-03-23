package dataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider_File {

	@DataProvider 
    public static String[][] data() {
    	
    	String [][] data =  {{"seleniumpanda@rediffmail.com","Selenium@123"},
    						 {"seleniumpanda1@rediffmail.com","Selenium@123"},
    						 {"seleniumpanda2@rediffmail.com","Selenium@123"},
    						 {"seleniumpanda3@rediffmail.com","Selenium@1234"},
							 };
    	return data;
    }
	
	@DataProvider
	public static String[][] data1(){
		
		String [][] data = {{"Boss176@gmail.com","12345"},
			                {"Boss1761@gmail.com","12345"},
			                {"Boss1762@gmail.com","12345"},
			                {"Benmoussa98126@gmail.com","12345"}
		};
	
			return data;
	
		
		
	}
}
