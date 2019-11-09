package com.walmart.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.*;


public class TestUtil {
	
	public static WebDriver getDriver(String browserName) {
		WebDriver driver = null;
		//factory design pattern
		try {
			switch(browserName) {
	 case"firefox":
			System.setProperty("WebDriver.gecko.driver","/Resources/Drivers/geckodriver");
		    driver = new FirefoxDriver();
	        break;		
		
	 case"opera": 
		System.setProperty("WebDriver.opera.driver","/Resoureces/Drivers/operadriver");
		driver = new OperaDriver();
		break;
		default:
	
			System.setProperty("WebDriver.chrome.driver","/Resoureces/Drivers/chromedriver");
			driver = new ChromeDriver();
			break;
			}
		}
		catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		return driver;
	
	
	
	
	
	
	/*public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	String url ="www.walmart.com";*/
}
		}
