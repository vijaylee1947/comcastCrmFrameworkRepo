package zohoCRMGUIFramwWork;

import org.testng.annotations.Test;

public class readingDataFromCommandLineTest {
	@Test
	public void readdatafromCMD() {
		
		String Url=System.getProperty("url");
		System.out.println("Env Url=====>"+Url);
		String Browser=System.getProperty("browser");
		System.out.println("Env Browser=====>"+Browser);
		String Username=System.getProperty("username");
		System.out.println("Env Username=====>"+Username);
		String Password=System.getProperty("password");
		System.out.println("Env Password=====>"+Password);
	}
}
