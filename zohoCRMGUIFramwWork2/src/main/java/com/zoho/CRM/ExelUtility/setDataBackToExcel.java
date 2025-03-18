package com.zoho.CRM.ExelUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class setDataBackToExcel {

	public void SetDataBackToExcelTest(String sheet,int row,int cell,String data) throws Throwable {

		FileInputStream fis = new FileInputStream("./TestData/appTestScriptData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet(sheet);

		Row rw = sh.getRow(row);

		Cell cel = rw.createCell(cell, CellType.STRING);
		
		cel.setCellValue(data);
		
		FileOutputStream fos= new FileOutputStream("./TestData/appTestScriptData.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
	}
}
