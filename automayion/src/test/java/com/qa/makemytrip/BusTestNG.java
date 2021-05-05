package com.qa.makemytrip;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.testscript.TestBase;
import com.qa.utility.ExcelUtility;

public class BusTestNG  extends TestBase
{
	
	//@Parameters({"input1","input2"})
	@Test
	public void BusMultipleWindow() throws InterruptedException
	{
		System.out.println("hi");
		  BusPages buspages;
		//if(!Mumbai Maharashtra.equalsIgnoreCase(Delhi Delhi ))
		//{
		   buspages = new BusPages(driver);
		    driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]")).click();
		   buspages.clickbuses();
		   System.out.println("one");
		   Thread.sleep(2000);
           buspages.clickfrom();
           System.out.println("two");
           buspages.clickfromLoc();
		   System.out.println("three");
           buspages.Toloc();
		   System.out.println("four");
	   	   buspages.Selectdate();
	   	   System.out.println("five");
	       buspages.Search();
	       System.out.println("six");
	       Thread.sleep(2000);
	       //buspages .BusTypes();
	       
	     	//buspages.selectSeats();
	     	System.out.println("seven");
			buspages.selectSeats();
			System.out.println("eight");
			buspages.PickUpPoint();
			System.out.println("nine");
				Thread.sleep(2000);
				buspages.DropPoint();
				System.out.println("ten");
					Thread.sleep(2000);
				buspages.Seatno();
				System.out.println("11");
				Thread.sleep(2000);
				buspages.BookSeat();
				//Reporter.log("Seat is booked");	
				System.out.println("12");
		  	
				
				buspages.getNameTextField().sendKeys("Rajeshwari");
				System.out.println("13");
				
				buspages.getAgeTextField().sendKeys("22");
				System.out.println("14");
				
				//buspages.getGenderTextField().sendKeys("Female");
				System.out.println("15");
				
				
				
				buspages.geEailIDTextField().sendKeys("bussarajeshwari@gmail.com");
				System.out.println("16");
				buspages.getMobileNumberTextField().sendKeys("9059933586");
				System.out.println("17");
				
				//buspages.Condition();
				
				
				//buspages.ContinueToBookNow();
				
				
	}
				@DataProvider
				public String[][] getData() throws IOException
				{
					String xlpath="D:\\Automation\\src\\test\\java\\com\\qa\\testdata";
					String Xlsheet="Sheet2";
					
					int rowCount=ExcelUtility.getRowCount(xlpath, Xlsheet);
					int cellCount=ExcelUtility.getCellCount(xlpath, Xlsheet, rowCount);
					
					String[][] data =new String[rowCount][cellCount];
					
					for(int i=1;i<=rowCount;i++)
					{
						for(int j=0;j<cellCount;j++)
						{
							data[i-1][j]=ExcelUtility.getCellData(xlpath,Xlsheet, i, j);
						}
					}
					return data;
				}
		
		//}
		 /*else
		  {	  
			  buspages=new BusPages(driver);
				buspages.clickbuses();
				   buspages.clickfrom();
				    buspages.Fromloc("Mumbai Maharashtra");
				    buspages.Toloc(); 
				    buspages.errorMsg();
				    Reporter.log(" The Departure City and Destination City cannot be same. Please re-type ");
				  //  buspages.ErrorMsg();
					// buspages.Selectdate();
					 //Reporter.log("Date is selected ",true);
					 //buspages.Search();
					// Reporter.log("clicked on Search",true);
				   // String ActualError=buspages.ErrorMsg();
					// Reporter.log("Departure city and Departure destination cannot be same",true);
					// String ExpectedError="Departure city and Departure destination cannot be same" ;        
			         //Assert.assertEquals(ActualError,ExpectedError); 
		  }*/
	}
	/*//@DataProvider(name="inputfields")
	public Object[][] getData() throws InterruptedException {
		Object[][] myData= new Object[2][2];
		myData[0][0] ="hyderabad" ;
		myData[0][1] ="Mumbai" ;   
		myData[1][0] =  "Hyderabad,Telangana";
		myData[1][1] =  "Hyderabad,Telangana" ;          			
		return myData;
		
	}*/
	
	/*@Test(priority=2,dataProvider = "getData")
	  public void NegativeFlow(String from,String to) throws InterruptedException
	  {
		  
		  
		  BusPages buspages = new BusPages(driver);
			buspages.clickbuses();
			 Reporter.log("Buses is clicked..",true);
		
			   buspages.clickfrom();
			   Reporter.log("From is clicked.. ",true);
			    buspages.Fromloc(from);
			    Reporter.log("Kashipur, Uttarakhand ",true);
			    buspages.Toloc(to); 
			    Reporter.log("Hyderabad, Telangana ",true);
				 buspages.Selectdate();
				 Reporter.log("Date is selected ",true);
				 buspages.Search();
				 Reporter.log("clicked on Search",true);
				 Reporter.log("No buses for the route..",true);
			    
			    
			    
			    
	
	  }*/


