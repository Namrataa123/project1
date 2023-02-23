package com.Facebook.Testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.Bankloginpage;

public class Bank_testcase3 extends Baseclass {
	
	@Test
	public void banktestcase3()
	{
Bankloginpage blp3 = new Bankloginpage(driver);
  
	blp3.btnbankmanagerlogin();
	blp3.btnopenaccount();
	blp3.selectcustomer("Harry Potter");
	blp3.selectcurrency("Pound");
	blp3.btnprocess();
	//multiple customers
	blp3.countofcoustomers();
	
	
Alert alert=driver.switchTo().alert();
String alertmessage= alert.getText();
System.out.println(alertmessage);
 alert.accept();
 if(alert.equals(alertmessage))
 {
	 System.out.println("message is displayed");
 }
 else
 {
	 System.out.println("message is not displayed");
 }

}
}
