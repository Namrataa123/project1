package com.Facebook.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Facebook.Base.Baseclass;

public class Loginpage extends Baseclass{

	
	 public Loginpage()
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(name="email")
	 WebElement txtemail;
	 
	 @FindBy(name="pass")
	 WebElement txtpass;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement btnlogin;
	 
	 @FindBy(xpath = "//img[@alt='Facebook']")
	  WebElement facebookheadertxt;
	 
	 
	 
	 //orangehrm
	 
	 @FindBy(xpath="//input[@name='username']")
	 WebElement textusername;
	 
	 @FindBy(xpath="//input[@name='password']")
     WebElement textpassword;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement loginbtn;
	 
	 
	//locate element
	 //perform action on it (click)
	 //verify the result   (assert)
	 
	 //for eg .//input[@name='firstname'] locating a html element of type input [htmltag=input element]with the help of xpath
	// where attribute =name and value is equal to firstname
	 
	 //version control system , (github)
	 
	 
	 
	 
	 public void enteremail(String Val)
	 {
		 txtemail.clear();
		 txtemail.sendKeys(Val);
		 String Valentered =txtemail.getAttribute("value");
		
		 System.out.println("value entered in username field is " +Valentered);
	 }
	 
	 
	 
	 
	 public void validateFacebookPage()
	 {
		 String header=facebookheadertxt.getAttribute("alt");
		 
		 Assert.assertEquals(header, "Facebook");
		 
	 }
	 
	 
	 public void enterpass(String Val)
	 {
		 txtpass.clear();
		 txtpass.sendKeys(Val);
		 String Valentered =txtpass.getAttribute("value");
		 System.out.println("value entered in Password field is"+Valentered);
		 
	 }
	 public void clickloginbutton()
	 {
		btnlogin.click();
		System.out.println("clicked on login button");
	 }
	 
	 
	 public void enterusername(String Val )
	 {
		 try {
			 Thread.sleep(7000);
			textusername.click();
			textusername.sendKeys(Val);
			String Valentered = textusername.getAttribute("value");
			System.out.println("value entered in Username is "+Valentered);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public void enterpassword(String Val ) throws InterruptedException
	 {
		textpassword.sendKeys(Val);
		 Thread.sleep(7000);
		String Valentered = textpassword.getAttribute("value");
		System.out.println("value entered in password is "+Valentered);
	 }
	 
	 public void clickloginbutton1() throws InterruptedException
	 {
		 loginbtn.click();
		 Thread.sleep(7000);
		System.out.println("clicked on login button");
	 }
	 
	 
}
