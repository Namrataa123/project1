package com.OrangeHRMLeaveTest.ApplyTest;

import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.orangeHRM.allPages.Leaves.applyLeaves.OrangeHRMApplyLeavePage;

public class ApplyleaveTest extends Baseclass {
 
	@Test
	public void OrangeHRM_leave()
	{
		OrangeHRMApplyLeavePage lp = new OrangeHRMApplyLeavePage();
		lp.Leave();
		lp.applyLeave();
		lp.LeaveType();
		lp.SelectLeaveType();
		lp.fromDate();
		lp.ToDate();
		lp.txtComment();
		lp.Applybutton();

		
	}
	
	
}
