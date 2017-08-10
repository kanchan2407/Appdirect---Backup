package com.appdirect.InterfacesPackage;

import java.io.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.Pages.AppdirectSignUppage;


public interface SignUppageInterface {

	public AppdirectSignUppage verifySignuppage() throws NullPointerException, IOException;		
	public AppdirectSignUppage clicksignUp() throws  IOException ;
	public AppdirectSignUppage verifySuccessPage() throws IOException;
    public AppdirectSignUppage verifyFailurePage() throws NoSuchElementException, Exception;
}
	  