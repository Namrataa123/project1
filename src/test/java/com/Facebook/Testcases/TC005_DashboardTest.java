package com.Facebook.Testcases;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.DashboardPage;
import com.Facebook.Pageobjects.Loginpage;
import com.Facebook.Pageobjects.OranangeHrmLeaveapage;

public class TC005_DashboardTest extends Baseclass{
	
	@Test
	public void DashboardTest() throws Exception 
	{
	
		
Loginpage lp = new Loginpage();
			
			
			lp.enterusername("Admin");
			lp.enterpassword("admin123");
			lp.clickloginbutton1();
			System.out.println("Debug line1");
			/*OranangeHrmLeaveapage op =new OranangeHrmLeaveapage();
			op.linkleave();
			op.clickapplylink();
			op.clickdropdownbutton();
			op.selectdropdwnoption("CAN - Bereavement");*/
			
			
					
			
			DashboardPage dp = new DashboardPage(driver);
			dp.clickonDashboard();
			dp.verifyDasboardtitle();
			dp.clickonleaverequeststoappove();
			
		}

	
}

