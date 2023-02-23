package com.Facebook.Testcases;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.Createanewaccountpage;

public class TC003_Createanewaccount extends Baseclass {

	@Test
	public void createanewaccountTest()
	{
	Createanewaccountpage cap = new Createanewaccountpage(driver);
	cap.Createnewaccountpage();
	cap.enterfirstname("namrata");
	cap.enterlastname("test123");
	cap.enteremail("namrata.skang@gmail.com");
	cap.enterpassword("test123");
	cap.selectdropdownday("22");
	cap.selectdropdownmonth("Jan");
	//cap.selectdropdownyear("2022");
	
	}
	
	
	
}
