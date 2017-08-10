package com.appdirect.InterfacesPackage;

import java.io.IOException;
import com.appdirect.Pages.AppdirectHomepage;
import com.appdirect.checkerPackage.HomepageChecker;


public interface HomePageCheckerInterface {
	public HomepageChecker checkHomepageTitle() throws NullPointerException;
	public AppdirectHomepage checkLoginButtonStatus() throws IOException;
}
	   
