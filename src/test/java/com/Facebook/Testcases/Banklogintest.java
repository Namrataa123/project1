package com.Facebook.Testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.Bankloginpage;

public class Banklogintest extends Baseclass {

	@Test
	public void Banklogintestcase()
	{
		Bankloginpage blp =new Bankloginpage(driver);
	   
		blp.btnbankmanagerlogin();
		blp.btnaddcustomer1();
		blp.txtboxfirstname("namrata");
		blp.txtboxlastname("kang");
		blp.txtpostalcode("v2b1n4");
		blp.btnaddcustomer2();
		//switching to alert
		Alert alert =driver.switchTo().alert();
		String txt =alert.getText();
		System.out.println(txt);
		alert.accept();
		
	}
}
