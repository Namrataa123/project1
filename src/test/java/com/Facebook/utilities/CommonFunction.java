package com.Facebook.utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Facebook.Base.Baseclass;

public class CommonFunction extends Baseclass {
	
	
	
	
	public void click(WebElement element)
	{
		
		element.click();
	}
	
	
	public void enterData(WebElement element,String data)
	{
		element.sendKeys(data);
		
	}
	
	
	public void validateUIElement(WebElement element)
	{
		
		boolean flag=element.isDisplayed();
		
		
		
		if(flag)
		{
			
			System.out.println("Element is displaying");
		}
		
		else
		{
			
			System.out.println("Element is not displaying");
		}
	}
	
	
     public String getOldWindow()
     {
    	 
    	 String oldwindow=driver.getWindowHandle();
    	 return oldwindow;
    	 
     }
	
	
	public void handleNeWindow()
	{
		
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		
		driver.switchTo().window(itr.next());
	}
	
	
	public void switcholdwindowFromNewWindow(String oldwindow)
	{
		
		driver.switchTo().window(oldwindow);
		
	}
	
	public void dropdown(WebElement element)
	{
		Select s = new Select(element);
		s.selectByIndex(0);
		s.selectByVisibleText("");
		//s.selectByValue();
	}
}
