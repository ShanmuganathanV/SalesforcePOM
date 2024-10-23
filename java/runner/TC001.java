package runner;

import org.testng.annotations.Test;

import base.Base;
import pages.SfLoginpage;

public class TC001 extends Base {

	@Test
	public void login() throws InterruptedException  {
		SfLoginpage lp = new SfLoginpage(driver);
		lp.enterTheUsername()
		.enterThePassword()
		.clickLogin()
		.clickOnToggle()
		.clickOnViewAll()
		.clickOnSales()
		.clickOnOpportunity()
		.clickOnNew()
		.clickOpportunityName()
		.enterAmount()
		.enterDate()
		.chooseToday()
		.clickStage()
		.selectNeedAnalysis()
		.clickSave();
		
	}

	
}
