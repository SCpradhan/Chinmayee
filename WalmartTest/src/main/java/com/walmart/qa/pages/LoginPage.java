package com.walmart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walmart.qa.base.TestBase;

public class LoginPage extends TestBase{  //LoginPage class is child class of TestBase parent class.
	
	//Page Factory -OR (Object Repository)
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//*[@id=\"sign-in-form\"]/button[1]")
	WebElement loginBtn;

    //@FindBy(xpath = "//*[@id='vh-account-menu-root']/div[2]/div/a[1]/div/span/div")
	@FindBy(xpath = "//div[contains@class,'v_a v_f']")
    WebElement signInBtn;
   
	@FindBy(xpath = "//*[@id='sign-in-widget']/a/img")
	//driver.findElement(By.xpath("//*[@id='sign-in-widget']/a/img"));
	WebElement walmartLogo;	
    
    
	//Intializing the Page objects
    public LoginPage() {
    	PageFactory.initElements(driver, this);
    }
        /*Here intializing method in Page factory...initElements means intialize elements 
    	with driver (is coming from TestBase(parent class))......'this' means current class objects 
    	(all the variables,webelements  above).*/
    
    
    //Actions:
    public static String validateLoginPageTitle() {
    	return driver.getTitle(); 	
    }
    
    public boolean validateWalmartImage()  {
    	return walmartLogo.isDisplayed();
    }
    
    public HomePage login(String un, String pwd) {
    username.sendKeys(un);
    password.sendKeys(pwd);
    loginBtn.click();
    
    return new HomePage();
    }












}

