package com.Facebook.Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Facebook.utilities.CommonFunction;

public class PrivacyPolicypage {

	 public WebDriver driver;
	 
	public PrivacyPolicypage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(xpath="//a[contains(.,'Cookies Policy')]")
	WebElement cookespolicy;;
	
	@FindBy(xpath="(//span[contains(.,'Privacy Policy')])[3]")
	WebElement titleprivacypolicy;
	
	@FindBy(xpath="//a[contains(.,'Create new account')]")
	WebElement linkcreateanewaccount;
	
	
	CommonFunction function=new CommonFunction();
	
	public void clickcookiespolicylink()
	{
	cookespolicy.click();		
	}
	
	public void clickoncreatenewAccount()
	{
	function.click(linkcreateanewaccount);		
	}
	//verify the link is displayed
	
	
	public String getInstanceBeforePrivactPloicy()
	{
		
		String oldwindow=function.getOldWindow();
		
		return oldwindow;
		
	}
	public void moveToOldPage(String oldwindow)
	{
		
		function.switcholdwindowFromNewWindow(oldwindow);
	}
	
	public void movenewPagePrivacy()
	{
		
		function.handleNeWindow();
		
	}
	
	
	
	public void veriftTitleofPrivacyPage()
	{
		
		
		function.validateUIElement(titleprivacypolicy);
	}
	
	
	public void getAllLinks()
	{
		
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<alllinks.size();i++)
		{
			
			String url=alllinks.get(i).getAttribute("href");
			System.out.println(""+(i+1)+" ==> "+url);
		}
	}
	
	
	
}
