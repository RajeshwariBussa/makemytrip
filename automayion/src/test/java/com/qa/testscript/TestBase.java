package com.qa.testscript;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.makemytrip.BusPages;
	


	public class TestBase
	{
		  protected WebDriver driver;
		 //RediffPages RediffOR;
		 BusPages buspages; 
	    
		 @Parameters({"Url"})
		 
		 
		 @BeforeClass
		 
		 public void setUp(String Url)
		 {
				 System.setProperty("webdriver.chrome.driver", "v:\\chromedriver.exe");
				 driver =new ChromeDriver();
				 
				BusPages buspages = new BusPages (driver);
			  
				 driver.get(Url);
				 
		 }
		 @AfterClass
		 public void tearDown()
		 {
			// driver.close();
		 }
	}



