package com.appdirect.UtilsPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;


public class UtilClass {
	
	Properties properties = new Properties();
	InputStream input = null;
	static Random rand = new Random(); 
	
	public static String pagename;
	public static String getLoginButtonPath;
	public static String getGetSignupButtonPath;
	public static String EmailPath;
	public static String EmailId;
	public static String getSignUpPath;
	public static String confirmPath;
    public static String  reverseSignUppath;
    public static String reverseEmailPath;
    public static String errorBoxPath;
    public static String emailId;
    
    
	public void homepageUtil() throws IOException{
			FileInputStream file = new FileInputStream(new File("homepage.properties"));
			properties.load(file);	
            pagename =properties.getProperty("pagename");
            getLoginButtonPath = properties.getProperty("loginButtonXpath");	
	}
	
	public void loginpageUtil() throws IOException {
		FileInputStream file = new FileInputStream(new File("loginpage.properties"));
			properties.load(file);	
			getGetSignupButtonPath=properties.getProperty("signUpButtonXpath");				
   }
	
   public void signuppageUtil() throws IOException {
	      FileInputStream file = new FileInputStream(new File("signuppage.properties"));
		     properties.load(file);
               EmailPath= properties.getProperty("emailXpath");
               EmailId = "kanchan"+rand.nextInt()+properties.getProperty("emailId");
               emailId=EmailId;
               getSignUpPath= properties.getProperty("signUpId");
               reverseSignUppath=properties.getProperty("reverseSignUppath");
               reverseEmailPath = properties.getProperty("reverseEmailPath");
               errorBoxPath =properties.getProperty("errorBoxPath");
      }  
   
	public static  String incorrectEmailId = "kanchan"+rand.nextInt(200)+"com";


}
