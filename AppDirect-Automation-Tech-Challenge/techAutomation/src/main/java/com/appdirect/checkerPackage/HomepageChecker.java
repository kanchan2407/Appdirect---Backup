package com.appdirect.checkerPackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.appdirect.InterfacesPackage.HomePageCheckerInterface;
import com.appdirect.Pages.AppdirectHomepage;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class HomepageChecker implements HomePageCheckerInterface{
	WebDriver driver;
	UtilClass util =new UtilClass();
	WaitClass waitObject =new WaitClass();
	
	public HomepageChecker(WebDriver driver) {
		this.driver =driver;
	}

	public HomepageChecker checkHomepageTitle() throws NullPointerException {
		    String title  = driver.getTitle();
	        Assert.assertEquals(title, "AppDirect");
	        Reporter.log("AppDirect HomePage Verified",true);  
		    return new HomepageChecker(driver);		
	}
	
	public AppdirectHomepage checkLoginButtonStatus() throws IOException {
		    boolean status = driver.findElement(By.xpath(UtilClass.getLoginButtonPath)).isDisplayed();
	        if(status==true) {
		      Assert.assertTrue("Login button Exist", status);
		      Reporter.log("Login Button Exist",true); 
		     waitObject.waitCalling(driver,UtilClass.getLoginButtonPath);
		}    	            
	       else {
	       Assert.assertTrue("Login button doesn't Exist", status);
		   Reporter.log("Login Button Doesnt exist",true);
		}
	       return new AppdirectHomepage(driver);
	     }

}
