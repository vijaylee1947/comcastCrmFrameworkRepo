package com.zoho.CRM.ContactsModule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.CRM.ExelUtility.ExcelUtility;
import com.zoho.CRM.FileUtility.PropertyFileUtility;
import com.zoho.CRM.generic.BaseTest.BaseTest;
import com.zoho.CRM.generic.ObjectRepository.ContactListPage;
import com.zoho.CRM.generic.ObjectRepository.CreateContactPage;
import com.zoho.CRM.generic.ObjectRepository.HomePage;
import com.zoho.CRM.generic.webDriverUtility.JavaUtility;

public class CreateContactTest extends BaseTest{
	
		ExcelUtility eLib=new ExcelUtility();
		PropertyFileUtility pLib=new PropertyFileUtility();
		JavaUtility jLib=new JavaUtility();
	
	@Test(groups = {"smoke","regression"})
	public void createcontactTest() throws Throwable {
		HomePage hp=new HomePage(driver);
		hp.getContactsLink().click();
		Reporter.log("click on contacts module",true);
		
		ContactListPage clp=new ContactListPage(driver);
		clp.getNewContactButton().click();
		Reporter.log("click on New contacts button",true);
		
		String lastName=eLib.getDataFromExcelTest("Sheet1", 1, 1);
		
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.getLastNameTextField().sendKeys(lastName+jLib.getrandomNumber());
		Reporter.log("Enter last name into last name text field",true);
		
		ccp.getSaveButton().click();
		Reporter.log("click on save button",true);
		
	}

}
