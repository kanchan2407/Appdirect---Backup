package com.appdirect.ResourcesPackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.appdirect.UtilsPackage.BrowserUtil;


public class BrowserSetup {
	
	static WebDriver driver;
    static BrowserUtil browser ;
	
public static WebDriver startBrowser(String browserName) throws IOException{
	
	if(browserName.equalsIgnoreCase("firefox")){
		driver =BrowserUtil.firefoxBrowser();	
	}
	else if(browserName.equalsIgnoreCase("chrome")){
		driver = BrowserUtil.chromeBrowser();
	}
	else if(browserName.equalsIgnoreCase("Safari")){
		driver =BrowserUtil.safariBrowser();
	}
	else {
		throw new IOException("Input error");
	}
	return driver;
	
}
}
