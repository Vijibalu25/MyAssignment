package testcases;

import org.testng.annotations.Test;

import base.BaseClass;

import pages.LoginPage;

public class RunCreateLead extends BaseClass{

	@Test
	public void runCreateLead() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName()
		.enterPassword()
		.ClickLoginButton()
		.ClickCRMSFALink()
		.ClickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickOnSubmit()
		.verifyViewPage();
	

	}

}
