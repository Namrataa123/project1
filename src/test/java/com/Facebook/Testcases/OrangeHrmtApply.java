package com.Facebook.Testcases;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.Loginpage;
import com.Facebook.Pageobjects.OranangeHrmLeaveapage;

public class OrangeHrmtApply extends Baseclass {

	
	@Test
	public void Applytest()
	{
		
		Loginpage lp = new Loginpage();
		
		
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
		/*OranangeHrmLeaveapage op =new OranangeHrmLeaveapage();
		op.linkleave();
		op.clickapplylink();
		op.clickdropdownbutton();
		op.selectdropdwnoption("CAN - Bereavement");
		op.FromDate("2022-9-1");*/
	}
	
}