package com.walmart.qa.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.walmart.qa.util.TestUtil;

/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.walmart.qa.util.TestUtil;
*/
public class TestBase {
	protected WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = TestUtil.getDriver("chrome");
		driver.get("https://www.walmart.com");
		}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
	
























/*public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()  {   //TestBase class constructor
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/malaybiswal/eclipse-workspace-1/WalmartTest/src/main/java/com/walmart/"
					+ "qa/config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","/Users/malaybiswal/Downloads/chromedriver");
			System.setProperty("webdriver.chrome.driver","/Resources/Drivers/chromedriver");
			driver = new ChromeDriver();		
		}
		else if(browserName.equals("FireFox")) 
		{
			//System.setProperty("webdriver.gecko.driver", "/Users/malaybiswal/Downloads/geckodriver");
			System.setProperty("webdriver.gecko.driver", "/Resources/Drivers/geckodriver");
			driver = new FirefoxDriver();    
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}

*/