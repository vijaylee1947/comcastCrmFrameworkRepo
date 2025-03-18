package com.zoho.CRM.generic.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.zoho.CRM.FileUtility.PropertyFileUtility;
import com.zoho.CRM.generic.ObjectRepository.HomePage;
import com.zoho.CRM.generic.ObjectRepository.LoginPage;
import com.zoho.CRM.generic.dbUtility.ReadDataFromDB;
import com.zoho.CRM.generic.webDriverUtility.webDriverUtility;

public class BaseTest {
	
	ReadDataFromDB dLib=new ReadDataFromDB();
	PropertyFileUtility pLib=new PropertyFileUtility();
	
	public WebDriver driver=null;
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void configBS() throws Throwable {
		System.out.println("======Connect to DB======");
		dLib.getConnectiontoDBwithCredentials();
	}
	
	
	@Parameters("Browser")
	@BeforeClass(groups = {"smoke","regression"})
	public void configBC(String browser) throws Throwable {
		System.out.println("======Launch Browser======");
		String BROWSER=browser;
				//pLib.getDataFromPropertyFile("browser");
		
		if (BROWSER.equals("chrome")) {
			
			driver=new ChromeDriver();
			
		}else if (BROWSER.equals("firefox")) {
			
			driver=new FirefoxDriver();
			
		}else {
			
			driver=new EdgeDriver();
			
		}
	}

	@BeforeMethod(groups = {"smoke","regression"})
	public void configBM() throws Throwable {
		System.out.println("======Login to application======");
		String url=pLib.getDataFromPropertyFile("url");
		String username=pLib.getDataFromPropertyFile("username");
		String password=pLib.getDataFromPropertyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(url, username, password);
	}

	@AfterMethod(groups = {"smoke","regression"})
	public void configAM() {
		System.out.println("======Logout======");
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
	}

	@AfterClass(groups = {"smoke","regression"})
	public void configAC() {
		System.out.println("======Quite Browser======");
		driver.quit();
	}

	@AfterSuite(groups = {"smoke","regression"})
	public void configAS() throws Throwable {
		System.out.println("======Close DB Connection======");
		dLib.closeDB();
	}

}
