package com.Facebook.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Facebook.Base.Baseclass;

public class Createanewaccountpage extends Baseclass {

	public static WebDriver driver;
	
	public Createanewaccountpage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[contains(.,'Create new account')]")
	WebElement linkcreateanewaccount;
	
	@FindBy(name="firstname")
	WebElement txtfirstname;
	
	@FindBy(name="lastname")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement txtemail;
	
	@FindBy(xpath="//div[contains(text(),'New password')]")
	WebElement txtpassword;
	
	@FindBy(name="birthday_month")
	WebElement dropdwnmonth;
	
	@FindBy(name="birthday_day")
	WebElement dropdwnday;
	
	@FindBy(name="birthday_year")
	WebElement dropdwnyear;

	
	
	
	public void Createnewaccountpage() {
		linkcreateanewaccount.click();
	}
				
		 
		 public void enterfirstname(String Val)
		 {
			 txtfirstname.clear();
			 txtfirstname.sendKeys(Val);
			 String Valentered =txtfirstname.getAttribute("value");
			 System.out.println("value entered in username field is " +Valentered);
		 }

		 
		 public void enterlastname(String Val)
		 {
			 txtlastname.clear();
			 txtlastname.sendKeys(Val);
			 String Valentered =txtlastname.getAttribute("value");
			 System.out.println("value entered in username field is " +Valentered);
		 }

		 
		 public void enteremail(String Val)
		 {
			 txtemail.clear();
			 txtemail.sendKeys(Val);
			 String Valentered =txtemail.getAttribute("value");
			 System.out.println("value entered in username field is " +Valentered);
		 }

       public void enterpassword(String Val)
       {
    	   txtpassword.clear();
    	   txtpassword.sendKeys(Val);
    	   String Valentered=txtpassword.getAttribute("value");
    	   System.out.println("value entered in password field is "+Valentered);
       }

	public void selectdropdownmonth(String Value)
	{
		Select s= new Select(dropdwnmonth);
				s.selectByVisibleText("Value");
	}
	
	public void selectdropdownday(String Value)
	{
		Select s= new Select(dropdwnday);
				s.selectByVisibleText("Value");
	}
	/*public int selectdropdownyear(int Value)
	{
		Select s= new Select(dropdwnyear);
	int	Valueentered= s.selectByVisibleText("Value");
	return Valueentered;
	}*/
	
}
