package com.appdirect.checkerPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.InterfacesPackage.SignupPageCheckerInterface;
import com.appdirect.Pages.AppdirectLoginpage;
import com.appdirect.Pages.AppdirectSignUppage;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;

import junit.framework.Assert;

public class SignuppageChecker implements SignupPageCheckerInterface {
	WebDriver driver;
	UtilClass util =new UtilClass();
	WaitClass waitObject =new WaitClass();
	AppdirectSignUppage signuppage;
	
	public SignuppageChecker(WebDriver driver) {
		this.driver =driver;
	}

	public SignuppageChecker checkSignupPage() throws IOException{	
		    String title  = driver.getTitle();
	        Assert.assertEquals(title, "Sign Up for AppDirect");
	        Reporter.log("AppDirect SignUp Page Verified",true);
			return new SignuppageChecker(driver);  
}
	
   public AppdirectSignUppage checkEmailBox() throws NullPointerException, IOException {
	   boolean status = driver.findElement(By.xpath(UtilClass.EmailPath)).isDisplayed();
		 if(status==true){
				Assert.assertTrue("Email Path Confirm", status);
				Reporter.log("Email Path Confirm",true); 
				}    	            
			else
			{
				Assert.assertTrue("Email Path not Confirm", status);
				Reporter.log("Email Path not Confirm",true);
				}
		return new AppdirectSignUppage(driver);	
   }
   
   public SignuppageChecker checkSameEmailId() throws IOException, NoSuchElementException {
	    AppdirectLoginpage loginObject = new AppdirectLoginpage(driver);
	      loginObject.clickOnSignupButton();
	     
	      waitObject.waitCalling(driver,UtilClass.reverseEmailPath);
		    WebElement element =driver.findElement(By.xpath(UtilClass.reverseEmailPath));
			element.sendKeys(UtilClass.emailId);
		    waitObject.waitCalling(driver,UtilClass.reverseSignUppath);
		    driver.findElement(By.xpath(UtilClass.reverseSignUppath)).click();
		    verifyErrorbox();  
		    return new SignuppageChecker(driver); 
   }

   public SignuppageChecker verifyErrorbox(){
   waitObject.waitCalling(driver,UtilClass.errorBoxPath); 
     WebElement element =driver.findElement(By.xpath(UtilClass.errorBoxPath));
		 String  failureMessage = element.getText(); 
		 Reporter.log("This email id is already registered",true);
		return new SignuppageChecker(driver);
   }
    
 } 
