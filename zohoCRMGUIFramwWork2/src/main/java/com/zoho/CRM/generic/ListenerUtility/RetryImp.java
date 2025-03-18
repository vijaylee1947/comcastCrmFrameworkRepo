package com.zoho.CRM.generic.ListenerUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImp implements IRetryAnalyzer {

	
	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int limitCount=5;
		
		if(count<limitCount) {
			count++;
			return true;
		}
		return false;
	}

}
