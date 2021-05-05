package com.qa.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusPages  {
	WebDriver Driver;
	public BusPages(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}
	@FindBy(className="menu_Buses")
	
	 WebElement buses;
	public void clickbuses()
	{
		//Actions act=new Actions(Driver);
		//act.moveToElement(buses).click().build().perform();
		buses.click();
	}	
	@FindBy(xpath="//input[@id='fromCity']")
	 @CacheLookup
	 WebElement from;
	public void clickfrom()
	{
		
		//Actions act=new Actions(Driver);
		//act.moveToElement(from).click().build().perform();
		from.click();
	}	
	
	//ramya code
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-0']")
	 @CacheLookup
	 WebElement fromLoc;
	public void clickfromLoc()
	{
		fromLoc.click();
	}	
	
	/* @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/p[1]/span[1]")
	 @CacheLookup   
	 WebElement From;
	public void  Fromloc(String input) throws InterruptedException
	{
		From.sendKeys(input);
		From.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		From.sendKeys(Keys.ENTER);
	} 
	@FindBy(xpath="//span[contains(text(),'To')]") 
	 @CacheLookup
	 WebElement Tolo;
	public void Toloc(String input) throws InterruptedException
	{
    	Tolo.sendKeys(input);
		Tolo.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		Tolo.sendKeys(Keys.ENTER);
	}*/
	@FindBy(xpath="//li[@id='react-autowhatever-1-section-0-item-1']")
	 @CacheLookup
	 WebElement Tolo;
	public void Toloc()
	{
		Tolo.click();
	}	
	@FindBy(xpath="//div[contains(text(),'31')]")
	@CacheLookup
	WebElement selectdate;
	public void Selectdate()
	{
		selectdate.click();
	}
	@FindBy(xpath="//button[contains(text(),'Search')]")
	@CacheLookup
	WebElement search;
	public void Search()
	{
		search.click();
	}
	@FindBy(xpath="(//a[contains(text(),'Select Seats')])[1]")
	@CacheLookup
	WebElement selectSeats;
	public void selectSeats()
	{
		selectSeats.click();	
	}
//	@FindBy(id="toggle_buses")
	//@CacheLookup
	//WebElement view;
	//public void viewBuses()
	//{
	//	view.click();	
	//}
	
	//@FindBy(xpath="//div[contains(text(),'Bus Types')]") 
	//@CacheLookup
	//WebElement types;
	//public void BusTypes()
	//{
	//	view.click();	
	//}
	//@findBy(xpath="//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/ul[1]/li[9]/ul[1]/li[1]/div[1]/div[1]/span[1]")
	//WebElement ACBus;
	//public void ACBus()
	//{
	//	view.click();	
	//}
	
	
	@FindBy(xpath = "//*[@id=\"bus_39_MMTCC1599_MMTCC1199_31-05-2021_1001866138035530999\"]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[5]/img" )			
	@CacheLookup
	WebElement seat;
	public void SelectSeat()
	{
		seat.click();
	}
	@FindBy(xpath="//*[@id=\"bus_39_MMTCC1599_MMTCC1199_31-05-2021_1001866138035530999\"]/div[2]/div/div/div[1]/div/div[1]/ul/li[4]/span/span[2]")
	@CacheLookup
	WebElement pick;
	public void PickUpPoint()
	{
		pick.click();
	}
	@FindBy(xpath="//*[@id=\"bus_39_MMTCC1599_MMTCC1199_31-05-2021_1001866138035530999\"]/div[2]/div/div/div[1]/div/div[2]/ul/li/span/span[1]/span[1]")
	@CacheLookup
	WebElement drop;
	public void DropPoint()
	{
		drop.click();
	}
	@FindBy(xpath="//*[@id=\"bus_39_MMTCC1599_MMTCC1199_31-05-2021_1001866138035530999\"]/div[2]/div/div/div[2]/div[2]/div/div[2]/div[5]/img")
	@CacheLookup
	WebElement seatno;		
	public void Seatno()
	{	
		seatno.click();	
	}
	@FindBy(xpath="//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']")
	@CacheLookup
	WebElement bookseat;
	public void BookSeat()
	{
		bookseat.click();
	}
	//@FindBy(id ="errorMessage")
	//@CacheLookup
	//WebElement error;
	//public void errorMsg()
	//{
		//return  Actualerror.getText();
		//String erromsg= error.getText();
		//System.out.println(erromsg);
	//}
	
	
	@FindBy(xpath="//*[@id=\"fname\"]")  
	
	 WebElement NameTextField;
	
	public WebElement getNameTextField() {
		return NameTextField;
	}
	
	@FindBy(id="age")
	
	WebElement AgeTextField;
	public WebElement getAgeTextField()
	{
		return AgeTextField;
	}

	//@FindBy(className ="GenderOptionSelection")
	//@CacheLookup
	//WebElement gender;
	//public void Gender()
	//{
		//gender.click();
				
//	}
	
	
	//@FindBy(xpath="//[@id=\"trv_form_13\"]/form/div[3]/div/ul/li[2]") ////[@id="trv_form_13"]/form/div[3]/div/p/span[1]
	////*[@id="trv_form_13"]/form/div[3]/div
	
	//WebElement getGenderTextField;
	//public WebElement getGenderTextField()
	//{
	//	return getGenderTextField;
	//}
	
	
	
	@FindBy(id="contactEmail")
	
	WebElement geEailIDTextField;
	public WebElement geEailIDTextField()
	{
		return geEailIDTextField;
	}
	
	
	@FindBy(id="mobileNumber")
	
	WebElement getMobileNumberTextField;
	public WebElement getMobileNumberTextField()
	{
		return getMobileNumberTextField;
	}
	
	@FindBy(xpath="//span[contains(@class,'sc-cbkKFq dlbrof')]")
	@CacheLookup
	WebElement condition;
	public void Condition()
	{
		condition.click();
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Continue to Book Now']")
	@CacheLookup
	WebElement continueto;
	public void ContinueToBookNow()
	{
		continueto.click();
	}
	
	
	
	
	
}