package com.appdirect.UtilsPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

public class BrowserUtil  {
	
	static Properties browserProperties = new Properties();
	static FileInputStream input =null;
	static WebDriver driver=null;
	
	
	public  String browserName() throws IOException{
		  File fl = new File("browserName.properties");
		   input = new FileInputStream(fl);
		   browserProperties.load(input);
		   return browserProperties.getProperty("browserName1");		
	}
	
	public static WebDriver chromeBrowser() throws IOException
	{
		try {
		   Reporter.log("Chrome Browser",true);
		   File fl = new File("browserDetails.properties");
		   input = new FileInputStream(fl);
		   browserProperties.load(input);
		   System.setProperty(browserProperties.getProperty("chromeDrivername"),browserProperties.getProperty("chromePath"));
		   driver=new ChromeDriver();
	}
	   catch(IOException e){
		   e.printStackTrace();
	}
		return driver;
}
	
	public static WebDriver firefoxBrowser() throws IOException
	{
	 try{
		Reporter.log("Firefox Browser",true);
		File fl = new File("browserDetails.properties");
		input = new FileInputStream(fl);
		browserProperties.load(input);
		System.setProperty(browserProperties.getProperty("firefoxDrivername"),browserProperties.getProperty("firefoxpath"));
        driver = new FirefoxDriver();
        }	 
	catch(IOException e) 
	 {
	   e.printStackTrace();
	}
        return driver;      		 
}
	
	public static WebDriver safariBrowser() throws IOException
	{
		Reporter.log("safari Browser",true);	
        driver = new SafariDriver();
		return driver;
}
	
}
