package com.zoho.CRM.FileUtility;

import java.io.FileInputStream;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class JsonFileUtility {
	
	@Test
	public String readDataFromJsonTest(String key) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./TestData/appCommonData1.json");
		
		JSONParser parser=new JSONParser();
		
		Object obj =parser.parse(new FileReader("./TestData/appCommonData1.json"));
		
		JSONObject jObj=(JSONObject)obj;
		
		String data=(String) jObj.get(key);
		
		return data;
	}

	
}
