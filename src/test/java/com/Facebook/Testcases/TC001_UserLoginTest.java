package com.Facebook.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.Loginpage;

public class TC001_UserLoginTest extends Baseclass{

	public WebDriver driver;
	
	
	
	@Test
	public void loginTest()
	{
		//call enterusername method
		//call passwordname method
		//call clickloginbutton method
		
		
		Loginpage lp = new Loginpage();
		/*lp.enteremail(prop.getProperty("email"));
		lp.enterpass(prop.getProperty("password"));
		lp.clickloginbutton();
		lp.validateFacebookPage();*/
		
		lp.enterusername("Admin");
		try {
			lp.enterpassword("admin123");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lp.clickloginbutton1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}