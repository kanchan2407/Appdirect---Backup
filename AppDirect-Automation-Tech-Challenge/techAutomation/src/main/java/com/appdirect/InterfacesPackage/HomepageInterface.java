package com.appdirect.InterfacesPackage;

import java.io.IOException;

import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.Pages.AppdirectHomepage;
import com.appdirect.Pages.AppdirectLoginpage;

public interface HomepageInterface {
	
	     public AppdirectHomepage homepageUrl() throws IOException;
	     public AppdirectHomepage verifyHomepage() throws NoSuchElementException, IOException ;
		 public AppdirectLoginpage clickOnLoginButton() throws IOException ;
			      
}
