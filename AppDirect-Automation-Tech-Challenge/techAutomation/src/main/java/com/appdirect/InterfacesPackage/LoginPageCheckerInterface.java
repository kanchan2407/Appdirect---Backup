package com.appdirect.InterfacesPackage;

import com.appdirect.ExceptionPackage.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.ExceptionPackage.NullPointerException;
import com.appdirect.Pages.AppdirectLoginpage;
import com.appdirect.checkerPackage.LoginpageChecker;


public interface LoginPageCheckerInterface {
	public LoginpageChecker checkLoginpage() throws NullPointerException ;
	public AppdirectLoginpage checkSignupButton() throws NoSuchElementException,IOException, Exception ;
	 
}
