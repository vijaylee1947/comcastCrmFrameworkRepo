package com.zoho.CRM.CampaignsModule;

import org.testng.annotations.Test;

import com.zoho.CRM.ExelUtility.ExcelUtility;
import com.zoho.CRM.generic.BaseTest.BaseTest;
import com.zoho.CRM.generic.ObjectRepository.CampaignListPage;
import com.zoho.CRM.generic.ObjectRepository.CreateCampaignPage;
import com.zoho.CRM.generic.ObjectRepository.HomePage;
import com.zoho.CRM.generic.webDriverUtility.JavaUtility;

public class CreateCampaignWithReqDateTest extends BaseTest {

	ExcelUtility eLib = new ExcelUtility();
	JavaUtility jLib = new JavaUtility();

	@Test
	public void createcampaignwithreqdateTest() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.getCampaignsLink().click();

		CampaignListPage clp = new CampaignListPage(driver);
		clp.getNewCampaignButton().click();

		int randomNum = jLib.getrandomNumber();

		CreateCampaignPage ccp = new CreateCampaignPage(driver);

		String campaignName = eLib.getDataFromExcelTest("Sheet1", 1, 0);

		ccp.getCampaignNameTextField().sendKeys(campaignName + randomNum);
		String sysDate=jLib.getSystemdate();
		String reqDate=jLib.getRequiredDate(30);
		ccp.getStartDateTextField().sendKeys(sysDate);
		ccp.getEndDateTextField().sendKeys(reqDate);

		ccp.getSaveButton().click();

	}
}
