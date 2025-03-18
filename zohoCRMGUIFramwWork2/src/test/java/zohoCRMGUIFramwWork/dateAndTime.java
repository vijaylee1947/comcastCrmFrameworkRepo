package zohoCRMGUIFramwWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class dateAndTime {
	
	@Test
	public void getSystemdate() {
		Date date= new Date();
		//System.out.println(date);
		
		SimpleDateFormat sim=new SimpleDateFormat("MM-dd-YYYY");
		System.out.println(sim.format(date));
		
		Calendar cal= sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, -30);
		String reqDate=sim.format(cal.getTime());
		System.out.println(reqDate);
	}

}
