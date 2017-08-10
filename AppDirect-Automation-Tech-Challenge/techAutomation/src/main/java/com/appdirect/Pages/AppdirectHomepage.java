package com.appdirect.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.InterfacesPackage.HomepageInterface;
import com.appdirect.ResourcesPackage.WaitClass;
import com.appdirect.UtilsPackage.UtilClass;
import com.appdirect.checkerPackage.HomepageChecker;

public class AppdirectHomepage implements HomepageInterface  {
	WebDriver driver;
	WaitClass waitObject =new WaitClass();
	UtilClass util =new UtilClass();
	HomepageChecker checker;

	public AppdirectHomepage(WebDriver driver) throws IOException{
	 this.driver= driver;	
	}
		
    public AppdirectHomepage homepageUrl() throws IOException {
   	    util.homepageUtil(); 
    	driver.get(UtilClass.pagename);	
     	return new AppdirectHomepage(driver);
    }
    
     public AppdirectHomepage verifyHomepage() throws NoSuchElementException, IOException{
    	 HomepageChecker checker =new HomepageChecker(driver);
    	 checker
          .checkHomepageTitle()
          .checkLoginButtonStatus();
		  return new AppdirectHomepage(driver);	
      }
     
	 public AppdirectLoginpage clickOnLoginButton() throws IOException {
		       driver.findElement(By.xpath(UtilClass.getLoginButtonPath)).click();
	           return new AppdirectLoginpage(driver);
	        }
	
}
