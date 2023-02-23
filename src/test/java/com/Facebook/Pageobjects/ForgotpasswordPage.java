package com.Facebook.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotpasswordPage {

	public WebDriver driver;
	
	 public ForgotpasswordPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 
	 
	 @FindBy(xpath="//a[contains(.,'Forgot account?')]")
	 WebElement linkforgotaccount;
	 
	 
	 public void linkforgotaccount()
	 {
		 linkforgotaccount.click();
	 }
	 
	 
	 
}
