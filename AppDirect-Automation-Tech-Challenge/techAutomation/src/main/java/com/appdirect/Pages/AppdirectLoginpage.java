package com.appdirect.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ExceptionPackage.NullPointerException;
import com.appdirect.InterfacesPackage.LoginpageInterface;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.LoginpageChecker;

public class AppdirectLoginpage implements LoginpageInterface{
		WebDriver driver;
		WaitClass waitObject =new WaitClass();
		UtilClass util =new UtilClass();
		LoginpageChecker checker;

	public AppdirectLoginpage (WebDriver driver) throws IOException {
		util.loginpageUtil();
	    this.driver= driver;
		}
	
	public AppdirectLoginpage verifyLoginpage() throws NoSuchElementException,NullPointerException, Exception
	{  
		LoginpageChecker checker = new LoginpageChecker(driver);
		checker
			.checkLoginpage()
			.checkSignupButton();
		return new AppdirectLoginpage(driver);
	}
	
	public AppdirectSignUppage clickOnSignupButton() throws IOException {
		   waitObject.waitCalling(driver,UtilClass.getGetSignupButtonPath);
 		   driver.findElement(By.xpath(UtilClass.getGetSignupButtonPath)).click();
           return new AppdirectSignUppage(driver); 
		
	}

}
