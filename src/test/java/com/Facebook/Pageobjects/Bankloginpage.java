package com.Facebook.Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.Arguments;

import com.Facebook.Base.Baseclass;

public class Bankloginpage extends Baseclass{
 
public static WebDriver driver;
	
 public Bankloginpage(WebDriver driver) {
	{
	this.driver = driver;
	
	PageFactory.initElements(driver,this);
}

 }
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	WebElement  bankmanagerloginbutton;
	
	@FindBy(xpath="(//div/button[@class='btn btn-lg tab'])[1]")
	WebElement Addcustomerbutton;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstnametxtbox;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lastnametxtbox;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement postcodetxtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement addcustomerbtn;
	
	@FindBy(xpath="(//div/button[@class='btn btn-lg tab'])[2]")
	WebElement openaccountbtn;
	
	@FindBy(xpath="//select[@name ='userSelect']")
	WebElement selectcustomername;
	
	
	@FindBy(xpath="//select[@name ='userSelect']/option")
	List<WebElement> countcustomername;
	
	@FindBy(xpath="//select[@name ='currency']")
	WebElement selectcurrency;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnprocess;
	
	
	public void btnbankmanagerlogin()
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bankmanagerloginbutton.click();
	}
	
	public void btnaddcustomer1()
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	//	Actions ac= new Actions(driver);
		//ac.click(Addcustomerbutton).build().perform();
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Addcustomerbutton);
		Addcustomerbutton.click();
	}
	
	public void txtboxfirstname(String Value)
	{ try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		firstnametxtbox.clear();
		firstnametxtbox.sendKeys(Value);
		String Valueentered = firstnametxtbox.getAttribute("Value");
		System.out.println(""  +Valueentered);
	}
		public void txtboxlastname(String Value)
	{
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		Lastnametxtbox.clear();
		Lastnametxtbox.sendKeys(Value);
		String Valueentered= Lastnametxtbox.getAttribute("Value");
		System.out.println("" +Valueentered);
		
	}
	
	
	public void txtpostalcode(String Value)
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		postcodetxtbox.clear();
		postcodetxtbox.sendKeys(Value);
		String Valuentered = postcodetxtbox.getAttribute("Value");
		System.out.println("" +Valuentered);
	}
	
	
	public void btnaddcustomer2() {
		addcustomerbtn.click();
	}
	
	
	public void btnopenaccount()
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((JavascriptExecutor)driver).executeScript("arguments[0].click;",openaccountbtn);
		openaccountbtn.click();
	}
	
	
	public void selectcustomer(String name)
	{
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s= new Select(selectcustomername);
		s.selectByVisibleText(name);
		
	}
	
	public void selectcurrency(String Value)
	{try {
		Thread.sleep(20000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		Select s = new Select(selectcurrency);
		s.selectByValue(Value);
	}
	
	
	
	public void btnprocess()
	{
       btnprocess.click();
	
	}
	
 
public void countofcoustomers()
{
    List<WebElement>li = countcustomername;
 int noofcustomers =  li.size();
  System.out.println(noofcustomers);
    
}

@FindBy(xpath = "(//tr/td[1])")
public List<WebElement> data;
public void getAllDataFromTable()
{
	

List<WebElement> firstrowList=data;

for(int i=0;i<firstrowList.size();i++)
{
	String text=firstrowList.get(i).getText();
    System.out.println(text);
}


}


}
