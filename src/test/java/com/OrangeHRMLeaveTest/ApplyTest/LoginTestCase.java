package com.OrangeHRMLeaveTest.ApplyTest;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.orangeHRM.allPages.Leaves.applyLeaves.LoginPage;

public class LoginTestCase extends Baseclass {

	@Test
	public void Login() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		//lp.clickforgetpasswordlink();
		lp.username();
		lp.password();
		lp.login();
		lp.verifyMyinfolink();
		lp.verifyDasboardPage();
		lp.verifyuser();
		
		
	}
}
