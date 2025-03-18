package zohoCRMGUIFramwWork;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.zoho.CRM.FileUtility.JsonFileUtility;
import com.zoho.CRM.FileUtility.PropertyFileUtility;


public class readingDataFromPropertyFile {

	
		@Test
		
		public void createCampaignTest() throws Throwable {
			
			//PropertyFileUtility pLib=new PropertyFileUtility();
			JsonFileUtility jLib=new JsonFileUtility();
			
			String BROWSER=jLib.readDataFromJsonTest("browser");
			String URL=jLib.readDataFromJsonTest("url");
			String Username=jLib.readDataFromJsonTest("username");
			String Password=jLib.readDataFromJsonTest("password");
						
			WebDriver driver=null;
			
			if (BROWSER.equals("chrome")) {
				
				driver=new ChromeDriver();
				
			}else if (BROWSER.equals("firefox")) {
				
				driver=new FirefoxDriver();
				
			}else {
				
				driver=new EdgeDriver();
				
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(URL);
			driver.findElement(By.id("userName")).sendKeys(Username);
			driver.findElement(By.id("passWord")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@alt=\"Sign In\"]")).click();
		}
			
}
