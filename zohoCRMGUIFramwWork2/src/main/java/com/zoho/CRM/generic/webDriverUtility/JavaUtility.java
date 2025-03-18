package com.zoho.CRM.generic.webDriverUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getrandomNumber() {
		Random ranNum = new Random();
		int randomNumber = ranNum.nextInt();
		return randomNumber;
	}

	public String getSystemdate() {
		
		Date date = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("MM-dd-YYYY");
		String systemDate = sim.format(date);
		return systemDate;
	}

	public String getRequiredDate(int days) {
		SimpleDateFormat sim = new SimpleDateFormat("MM-dd-YYYY");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate = sim.format(cal.getTime());
		return reqDate;
	}

}
