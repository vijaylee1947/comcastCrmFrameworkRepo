package com.zoho.CRM.CampaignsModule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.zoho.CRM.ExelUtility.ExcelUtility;
import com.zoho.CRM.ExelUtility.gettingRowCount;
import com.zoho.CRM.generic.BaseTest.BaseTest;
import com.zoho.CRM.generic.ObjectRepository.CampaignDetailsPage;
import com.zoho.CRM.generic.ObjectRepository.CampaignListPage;
import com.zoho.CRM.generic.ObjectRepository.CreateCampaignPage;
import com.zoho.CRM.generic.ObjectRepository.HomePage;
import com.zoho.CRM.generic.webDriverUtility.JavaUtility;

@Listeners(com.zoho.CRM.generic.ListenerUtility.ListenerImplementation.class)
public class CreateCampaign extends BaseTest  {
	
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		
	@Test(groups = {"smoke","regression"})
	public void createcampaignTest() throws Throwable {
		
		
		HomePage hp=new HomePage(driver);
		hp.getCampaignsLink().click();
		Reporter.log("click on campaigns link",true);
		
		CampaignListPage clp=new CampaignListPage(driver);
		clp.getNewCampaignButton().click();
		Reporter.log("click on NewCampaignButton",true);
		
		int randomNum=jLib.getrandomNumber();
		
		CreateCampaignPage ccp=new CreateCampaignPage(driver);
		
		String campaignName=eLib.getDataFromExcelTest("Sheet1", 1, 0);
		
		ccp.getCampaignNameTextField().sendKeys(campaignName+randomNum);
		Reporter.log("enter campaiagn name into campaign name text field",true);
		
		ccp.getSaveButton().click();
		Reporter.log("click on Save Button",true);		
					
	}
	
	@Test(groups = {"smoke","regression"}) 
	public void createcampaignwithtypeTest() throws Throwable {
		
		HomePage hp=new HomePage(driver);
		hp.getCampaignsLink().click();
		Reporter.log("click on campaigns link",true);
		
		CampaignListPage clp=new CampaignListPage(driver);
		clp.getNewCampaignButton().click();
		Reporter.log("click on NewCampaignButton",true);
		
		int randomNum=jLib.getrandomNumber();
		
		CreateCampaignPage ccp=new CreateCampaignPage(driver);
		
		String campaignName=eLib.getDataFromExcelTest("Sheet1", 1, 0);
		
		ccp.getCampaignNameTextField().sendKeys(campaignName+randomNum);
		Reporter.log("enter campaiagn name into campaign name text field",true);
				
		Select select=new Select(ccp.getTypeDropdownList());
		
		select.selectByValue("Admin");
		Reporter.log("select value from Type drop down",true);
		
		ccp.getSaveButton().click();
		Reporter.log("click on save button",true);
	}
	
//	@DataProvider
//	public Object[][] getdata() throws Throwable{
//		
//		ExcelUtility eLib=new ExcelUtility();
//		gettingRowCount rLib=new gettingRowCount();
//		int rowCount1=rLib.getRowCount("Sheet1");
//		Object[][] objArr=new Object[rowCount1][0];
//				
//		for(int i=0;i<rowCount1;i++) {
//			objArr[i][0]=eLib.getDataFromExcelTest("Sheet1", i+1, i);
//		}
//			
//		return objArr;
//	}
}
