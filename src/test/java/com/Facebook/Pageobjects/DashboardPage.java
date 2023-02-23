package com.Facebook.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Facebook.Base.Baseclass;

public class DashboardPage extends Baseclass {

	public static WebDriver driver;
	
	
	public DashboardPage(WebDriver driver)
	{
		
		DashboardPage.driver=driver;
		PageFactory.initElements(driver,this );
	}
		@FindBy(xpath="(//a/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]")
		WebElement dashboardlinkclick;
		
	//	@FindBy(xpath="//p[contains(.,' (10) Leave Requests to Approve')]")
	//	WebElement linkleaverequesttoapprove;
		
		@FindBy(linkText =" (10) Leave Requests to Approve")
		WebElement linkrequesttoapprove;
		
		public void clickonDashboard()
		{
			dashboardlinkclick.click();
		}
		
		public void verifyDasboardtitle()
		{
			String acttitle = driver.getTitle();
			 System.out.println(""+acttitle);
			/* Assert.assertEquals(acttitle,"Dashboard");
			 if(acttitle.equalsIgnoreCase("Dashboard"))
			 {
			 System.out.println("title is displayed");
			 }
			 else
			 {
				 System.out.println("title is not displayed");
			 }*/
			 
		}
		
		public void clickonleaverequeststoappove()
		{
			Actions ac= new Actions(driver);
		ac.moveToElement(linkrequesttoapprove).click().build().perform();
		}
	}
	
	

