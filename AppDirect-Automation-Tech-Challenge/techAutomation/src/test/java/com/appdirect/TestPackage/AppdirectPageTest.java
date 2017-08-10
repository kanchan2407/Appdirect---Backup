package com.appdirect.TestPackage;

import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.InterfacesPackage.PageTestInterface;
import com.appdirect.Pages.AppdirectHomepage;
import com.appdirect.Pages.AppdirectLoginpage;
import com.appdirect.Pages.AppdirectSignUppage;
import com.appdirect.ResourcesPackage.BrowserSetup;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.BrowserUtil;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.HomepageChecker;

public class AppdirectPageTest implements PageTestInterface {
	WebDriver driver;
	UtilClass util =new UtilClass();
	WaitClass wait =new WaitClass();
	AppdirectLoginpage loginpageObject;
	AppdirectSignUppage signuppageObject;
	HomepageChecker checker;
	BrowserUtil browser = new BrowserUtil();
	
	@BeforeClass
	public void setupBrowser() throws IOException {
		String browserName =browser.browserName();	
		driver = BrowserSetup.startBrowser(browserName);
		driver.manage().window().maximize(); 		
	}

	  @Test(priority = 1)
	  public void openHomePageTest() throws IOException, NoSuchElementException {	
		  AppdirectHomepage homepageObject = new AppdirectHomepage(driver);
		  loginpageObject =  homepageObject
		     .homepageUrl()
		     .verifyHomepage()
		     .clickOnLoginButton();     	   
	  }
	  
	  @Test(priority = 2)
	  public void openLoginPageTest() throws IOException, Exception{
		  signuppageObject = loginpageObject
		   .verifyLoginpage()	  
		   .clickOnSignupButton();      
	 }
		  
       @Test(priority = 3)
       public void opensignupPageTest() throws NullPointerException, IOException {
     	 signuppageObject 
		   .verifySignuppage()
		   .clicksignUp();  	 
     }
     
	 @Test(priority = 4)
	 public void successPageTest() throws IOException {
		  signuppageObject.verifySuccessPage();
	}
	 
	 @Test(priority = 5)
	 public void failurePageTest() throws NoSuchElementException, Exception {
		signuppageObject.verifyFailurePage();
	}
 
    @AfterClass  
     public void closeDriver() throws Exception{
	 Reporter.log("Browser closed");
    		 driver.close();
     }	  
}