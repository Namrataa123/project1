package com.Facebook.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Facebook.Base.Baseclass;
import com.Facebook.Pageobjects.PrivacyPolicypage;

public class TC004_Privacypolicy extends Baseclass{

	@Test
	public void linkprivacypolicyTestcase()
	{
	
	try {
		PrivacyPolicypage pp = new PrivacyPolicypage(driver);
		pp.getAllLinks();
		pp.clickoncreatenewAccount();
		String oldwindow=pp.getInstanceBeforePrivactPloicy();
		
  pp.clickcookiespolicylink();
  
pp.movenewPagePrivacy();
pp.veriftTitleofPrivacyPage();
pp.moveToOldPage(oldwindow);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
  
	}		
}



/*where to implement assert option
where to use for loops
where to verify actual title
how to determine all the links and names and where to dispaly it
how to see logs and xml
window handle code
where to write drag and drop*/

