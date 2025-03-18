package com.zoho.CRM.FileUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {

	public String getDataFromPropertyFile(String key) throws Throwable {

		FileInputStream fis = new FileInputStream("./TestData/appCommondata.properties");

		Properties pObj = new Properties();

		pObj.load(fis);

		String data=pObj.getProperty(key);

		return data;
	}

}
