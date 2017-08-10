package com.appdirect.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.SignuppageChecker;


public class AppdirectSignUppage {
	WebDriver driver;
	String successMessage;
    WaitClass waitObject =new WaitClass();
	UtilClass util =new UtilClass();

	public AppdirectSignUppage(WebDriver driver) throws IOException{
		this.driver= driver;			
	}
	
	public AppdirectSignUppage verifySignuppage() throws NullPointerException, IOException{		
		SignuppageChecker checker = new SignuppageChecker(driver);
		util.signuppageUtil();	
		 checker
		 .checkSignupPage()
		 .checkEmailBox();
		 return new AppdirectSignUppage(driver);
	}
		
	public AppdirectSignUppage clicksignUp() throws  IOException {
		 waitObject.waitCalling(driver,UtilClass.EmailPath);
		 WebElement element =driver.findElement(By.xpath(UtilClass.EmailPath));
		 element.sendKeys(UtilClass.EmailId);
	         waitObject.waitCalling(driver,UtilClass.getSignUpPath);
		     driver.findElement(By.xpath(UtilClass.getSignUpPath)).click(); 
		     return new AppdirectSignUppage(driver);
}
	
	public AppdirectSignUppage verifySuccessPage() throws IOException{
         waitObject.waitForSuccess(driver,".signupConfirmationPanel");
		 WebElement element =driver.findElement(By.cssSelector(".signupConfirmationPanel"));
		 successMessage = element.getText(); 
		 Reporter.log("Sign Up Successfully",true);
		 return new AppdirectSignUppage(driver);
	}	
		 
   public AppdirectSignUppage verifyFailurePage() throws NoSuchElementException, Exception{
	  if(successMessage!=null) {
		  driver.navigate().back();
		  SignuppageChecker checker = new SignuppageChecker(driver);
		  checker
			 .checkSameEmailId();
		   }
	     return new AppdirectSignUppage(driver);
	 }
   
   
   }





