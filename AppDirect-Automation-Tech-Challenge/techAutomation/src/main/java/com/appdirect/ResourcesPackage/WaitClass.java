package com.appdirect.ResourcesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	WebDriverWait wait;
	WebDriver driver;
	
	public void waitCalling(WebDriver driver,String XpathOfButton)
	{
		    wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XpathOfButton)));
		
	}
	
	public void waitForSuccess(WebDriver driver,String cssSelector){
		 wait = new WebDriverWait(driver,10);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
		
	}
}

