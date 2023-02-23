package com.orangeHRM.allPages.Leaves.applyLeaves;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.Base.Baseclass;

public class OrangeHRMApplyLeavePage extends Baseclass{
	
	@FindBy(xpath="(//span[contains(.,'Leave')])[1]")
	public WebElement LeaveLink;
	
	
	@FindBy(xpath="	(//a[contains(.,'Apply')])[1]")
	public WebElement ApplyLink;
	

	@FindBy(xpath="(//div[contains(text(),'Select')])")
	public WebElement LeaveDropdownArrowLink;
	
	
	@FindBy(xpath="(//div[contains(.,'CAN - Bereavement')])[14]")
	public WebElement SelectleaveType;
	
	//from date 
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")	
	public WebElement FromDateDropdown;
	
		

   @FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
   public WebElement ToDateDropdown;
   
  
	 
    @FindBy(xpath="textarea")
    public WebElement Comment;

	@FindBy(xpath="//button[@type='submit']")	
	public WebElement Applybutton;


	public OrangeHRMApplyLeavePage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void Leave()
	{
		try {
			Thread.sleep(15000);
			LeaveLink.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void applyLeave()
	{
	
	try {
		Thread.sleep(15000);
	ApplyLink.click();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public void LeaveType()
	{
		try {
			Thread.sleep(15000);
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", LeaveDropdownArrowLink);
			LeaveDropdownArrowLink.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


public void SelectLeaveType()
{
	try {
		Thread.sleep(15000);
		//SelectleaveType.click();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", SelectleaveType);
			SelectleaveType.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}



public void fromDate()
{
try {
	Thread.sleep(15000);
	FromDateDropdown.sendKeys("2023/01/20");
} catch (Exception e) {
  e.printStackTrace();
}	
}

	

public void ToDate()
{
try {
	Thread.sleep(15000);
	ToDateDropdown.sendKeys("2023/02/21");
} catch (Exception e) {
  e.printStackTrace();
}	

}

public void txtComment()
{
	try {
		Comment.sendKeys("I am learning selenium");
	} catch (Exception e) {
		// TODO: handle exception
	}}


public void Applybutton()
{
	try {
		Applybutton.click();
	} catch (Exception e) {
		// TODO: handle exception
	}}



}
