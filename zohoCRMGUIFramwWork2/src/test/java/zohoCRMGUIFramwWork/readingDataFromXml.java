package zohoCRMGUIFramwWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class readingDataFromXml {
	
	@Test(parameters = "browser")
	public void dataFromxmalTest(String Browser) {
		String BROWSER=Browser;
		System.out.println(BROWSER);
		WebDriver driver=null;
		
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new EdgeDriver();
		}
	}

}
