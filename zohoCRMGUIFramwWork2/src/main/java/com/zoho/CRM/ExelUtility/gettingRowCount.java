package com.zoho.CRM.ExelUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class gettingRowCount {

	public int getRowCount(String sheet) throws Throwable {
		FileInputStream fis = new FileInputStream("./TestData/appTestScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(sheet);

		int rowCount = sh.getLastRowNum();
		
		return rowCount;
	}
}
