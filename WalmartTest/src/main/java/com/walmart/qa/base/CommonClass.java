package com.walmart.qa.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonClass {
	
	protected WebDriver driver;
	public CommonClass(WebDriver driver) {
		this.driver = driver;
	}
	
	public String search(String searchData) {
		driver.findElement(By.id("global-search-input")).sendKeys(searchData);
		driver.findElement(By.cssSelector("#global-search-submit .g_f")).click();
		return driver.getTitle();
	}
	public void headernavLinks() {
		 driver.findElement(By.xpath("//div[@id='vh-spark-main-menu']/div[3]/a[@title='Gift Cards']//div[@class='v_a v_f']")).click();
		 return;
	}
	public void headerModerDropdown() {
		//Selected all headernavLinks 3 menus from 'grocery pick up' to 'Track orders' at a time.
		List<WebElement>elements = driver.findElements(By.cssSelector("[data-tl-id*='header-GlobalHeaderSparkMenu-optionalTopLinks']"));
		
	}

}






// how to select two headernavlink at a time. refer whitebox video part -1

/*xpath---grocery pickup
//div[@id='vh-spark-menu']

weekly Add
//a[@data-tl-id*='header-GlobalHeaderSparkMenu-optionalBottomLinks-4']
 * 

 //Selected all headernavLinks 7 menus from 'Ellen's list' to 'Help' at a time with cssSelector
 [data-tl-id*='header-GlobalHeaderSparkMenu-optionalBottomLinks']
 * 
 * 
 //Selected all headernavLinks 3 menus from 'grocery pick up' to 'Track orders' at a time.
 * [data-tl-id*='header-GlobalHeaderSparkMenu-optionalTopLinks']
 * 
 * 
 //Selected all header Departments all 15 menus "saving centre" to "Art,crafrt.." at a time.
 * [data-tl-id*=GlobalHeaderDepartmentsMenu-deptButtonFlyout]

 * //a[@data-tl-id='header-GlobalHeaderSparkMenu-optionalBottomLinks']
 * 
 //Departments xpath
  * //h2[@class='n_a ab_b']
  * 
  //Departments css
  * [class='n_a ab_b']
 * */
 