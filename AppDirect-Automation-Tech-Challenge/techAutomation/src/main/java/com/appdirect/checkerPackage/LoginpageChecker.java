package com.appdirect.checkerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.appdirect.ExceptionPackage.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ExceptionPackage.NullPointerException;
import com.appdirect.InterfacesPackage.LoginPageCheckerInterface;
import com.appdirect.Pages.AppdirectLoginpage;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;


import junit.framework.Assert;

public class LoginpageChecker implements LoginPageCheckerInterface{
	WebDriver driver;
	UtilClass util =new UtilClass();
	WaitClass waitObject =new WaitClass();
		
	public LoginpageChecker(WebDriver driver) {
		this.driver =driver;
	}
	
	public LoginpageChecker checkLoginpage() throws NullPointerException { 
		    String currentUrl  = driver.getCurrentUrl();
		    if(currentUrl==null)
		    	throw new NullPointerException("Page Not Found");
		    else 
		    {
		    Assert.assertEquals(currentUrl, "https://www.appdirect.com/");	
		    Reporter.log("AppDirect LoginPage Verified",true);
		    waitObject.waitCalling( driver,UtilClass.getGetSignupButtonPath);
			return new LoginpageChecker(driver);
		    }
	}
	

	public AppdirectLoginpage checkSignupButton() throws NoSuchElementException,IOException, Exception {
		   boolean status = (driver.findElement(By.xpath(UtilClass.getGetSignupButtonPath))).isDisplayed();
		   if(status==true)
		  {
			Assert.assertTrue("Sign Up button Exist", status);
			Reporter.log("Sign Up Button Exist",true); 
			}    	            
		 else
		   {
			Assert.assertTrue("Sign Up button doesn't Exist", status);
			Reporter.log("Sign Up  Button Doesnt exist",true);
			}
		return new AppdirectLoginpage(driver);
	}


}
