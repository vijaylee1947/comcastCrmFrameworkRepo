package com.zoho.CRM.ExelUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
				
	public String getDataFromExcelTest(String sheet,int row,int cell) throws Throwable {

		FileInputStream fis = new FileInputStream("./TestData/appTestScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(sheet);

		Row rw = sh.getRow(row);

		Cell cel = rw.getCell(cell);

		String data = cel.getStringCellValue().toString();
		
		wb.close();
		
		return data;

	}
		
}
