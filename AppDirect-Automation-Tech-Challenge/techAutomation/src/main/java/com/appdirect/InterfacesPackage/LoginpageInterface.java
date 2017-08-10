package com.appdirect.InterfacesPackage;

import java.io.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ExceptionPackage.NullPointerException;
import com.appdirect.Pages.AppdirectLoginpage;
import com.appdirect.Pages.AppdirectSignUppage;


public interface LoginpageInterface {
	
	public AppdirectLoginpage verifyLoginpage() throws NoSuchElementException, IOException, NullPointerException, Exception;
    public AppdirectSignUppage clickOnSignupButton() throws IOException, Exception;
		  

}
