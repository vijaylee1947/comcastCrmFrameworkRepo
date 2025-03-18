package zohoCRMGUIFramwWork;

import org.testng.annotations.Test;

import com.zoho.CRM.ExelUtility.ExcelUtility;
import com.zoho.CRM.ExelUtility.setDataBackToExcel;

public class readingDataFromExcel {

	@Test

	public void getdatafromExcelTest() throws Throwable {
		
		ExcelUtility eLib=new ExcelUtility();

		setDataBackToExcel sLib=new setDataBackToExcel();

		String data = eLib.getDataFromExcelTest("Sheet1", 1, 1);

		System.out.println(data);

		sLib.SetDataBackToExcelTest("Sheet1", 1, 1, "ShabiraKhan");

	}

}
