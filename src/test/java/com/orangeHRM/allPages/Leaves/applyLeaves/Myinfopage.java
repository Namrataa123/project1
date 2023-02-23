package com.orangeHRM.allPages.Leaves.applyLeaves;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Facebook.Base.Baseclass;

public class Myinfopage extends Baseclass {


@FindBy(xpath="//span[contains(.,'My Info')]")
WebElement Myinfolink;
	
@FindBy(xpath="//span/h6[contains(.,'PIM')]")
WebElement PIMlink;



@FindBy(xpath="//h6[contains(.,'Personal Details')]")
WebElement textpersonaldetails;


@FindBy(xpath="//input[@name='firstName']")
WebElement txtfirstname;

@FindBy(xpath="//input[@name='middleName']")
WebElement txtmiddlename;


@FindBy(xpath="//input[@name='lastName']")
WebElement txtlstname;


@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
WebElement txtNickname;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
WebElement employeeid;



@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4])")
WebElement otherid;


@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[5]")
WebElement DriverlicenseNumber;

@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")
WebElement datelicenseexpiry;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[7]")
WebElement enterSSNnumber;

@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[8]")
WebElement enterSiNnumber;


@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
WebElement drpdwnNationality;


@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
WebElement drpdwnmaritalstatus;

@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
WebElement dateofbirth;


@FindBy(xpath="(//label[contains(.,'Male')])[1]")
WebElement gendermale;


@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[10]")
WebElement txtmilteryservice;

@FindBy(xpath="//label[contains(.,'Yes')]")
WebElement clicksmoker;


@FindBy(xpath="//button[contains(.,' Add ')]")
WebElement btnattchment;






//(//input[@class='oxd-input oxd-input--active'])[2]
		
		
				
								


public Myinfopage()
{
PageFactory.initElements(driver,this );	
}

public void verifyMyinfolink()
{
	Myinfolink.click();
}

//verify pim link is displayed

public void checkpimlinkisdisplayed()
{
boolean status = PIMlink.isDisplayed();
if(status== true)
{
	System.out.println("PIM link is displayed");
	
}
else
{
	System.out.println("pim link is missing");
}

// get the name of link

String linkname= PIMlink.getText();
System.out.println("" +linkname);
if(linkname.equalsIgnoreCase("PIM"))
{
	System.out.println("link is existing");
}
else 
{
	System.out.println("link is not existing");
}

// to check the actual equal to expected

String actual =PIMlink.getText();
System.out.println(actual);
Assert.assertEquals(actual,"PIM");

// verify that persoanldetails is displayed or not

boolean status1 = textpersonaldetails.isDisplayed();
 if(status1==true)
 {
	 System.out.println("it is displayed");
 }
 else 
 {
	 System.out.println("it is missing");
 }

}
  public void licenseexpirydate()
  {
	  datelicenseexpiry.sendKeys("2023-01-25");
  }

public void nationalitydropdown()
{
	drpdwnNationality.sendKeys("Ghanaian");}

}










