package com.orangeHRM.allPages.Leaves.applyLeaves;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.internal.Arguments;

import com.Facebook.Base.Baseclass;

public class LoginPage extends Baseclass{

	
	
@FindBy(xpath="//input[@name='username']")
WebElement textUsername;

@FindBy(xpath="//input[@name='password']")
WebElement textpassword;

@FindBy(xpath="//button[contains(.,'Login')]")
WebElement loginbutton;


@FindBy(xpath="//p[contains(.,'Forgot Your Password?')] ")
WebElement linkforgetPassword;

@FindBy(xpath="//h6[contains(.,'Dashboard')]")
WebElement txttopDasboard;

@FindBy(xpath="//p[contains(.,'@&# Collings')]")
WebElement Username;


public LoginPage() {
	PageFactory.initElements(driver,this);
}

public void username()
{
	
	try {
		Thread.sleep(20000);
	textUsername.clear();
	textUsername.sendKeys("Admin");
	} catch (Exception e) {
		e.printStackTrace();
	}
		
}


public void password()
{
	try {
	textpassword.clear();
	textpassword.sendKeys("admin123");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void login(){
	loginbutton.click();
	
}

public void verifyforgetpasswordlink()
{
	String linkname=linkforgetPassword.getText();
	System.out.println(linkname);
	if(linkname.equalsIgnoreCase("Forgot Your Password?")) {
		System.out.println("Forgot Your Password? link is existing");
	}else {
		System.out.println("Forgot Your Password?link is not existing");
	}
}


public void clickforgetpasswordlink() throws InterruptedException
{
	Thread.sleep(15000);
	((JavascriptExecutor)driver).executeScript("arguments[0].click();",linkforgetPassword);
	linkforgetPassword.click();
//Actions ac= new Actions(driver);
//ac.click().build().perform();

	}


public void verifyDasboardPage()
{
	
	String actual=txttopDasboard.getText();
	System.out.println(actual);
Assert.assertEquals(actual,"Dashboard");


}

public void verifyuser()
{
String actual =Username.getText();
System.out.println(actual);
Assert.assertEquals(actual,"@&# Collings");
	}







}


