package com.Facebook.Testcases;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.ForgotpasswordPage;

public class TC002_ForgotPasswordTestcase extends Baseclass {

	
	@Test
	public void ForgotPassword()
	{
		
		ForgotpasswordPage fp = new ForgotpasswordPage(driver);
		fp.linkforgotaccount();
	}
	
}
