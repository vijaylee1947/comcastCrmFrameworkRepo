package com.zoho.CRM.generic.ListenerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.zoho.CRM.generic.BaseTest.BaseTest;

public class ListenerImplementation implements ITestListener,ISuiteListener{
	
	public ExtentSparkReporter spark;
	public static ExtentReports report;
	public WebDriver driver=null;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("========"+result.getMethod().getMethodName()+"=======");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("========"+result.getMethod().getMethodName()+"=========");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("take screen shot");
		
		ExtentTest test=report.createTest("OnTest Failure");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String filePath=ts.getScreenshotAs(OutputType.BASE64);
		
		test.addScreenCaptureFromBase64String(filePath, "Error Failure");
		test.log(Status.FAIL,"Error Failure"+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("========"+result.getMethod().getMethodName()+"=========");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("=============="+"Report Configuration"+"==============");	
		
		String datAndTime= new Date().toString().replace(" ", "_").replace(":", "_");
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReport/report"+datAndTime+".html");
		spark.config().setDocumentTitle("Zoho CRM GUI Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("campaign Test Report");
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome-90");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("==============="+"Report Backup"+"==================");
		report.flush();
	}

	
}
