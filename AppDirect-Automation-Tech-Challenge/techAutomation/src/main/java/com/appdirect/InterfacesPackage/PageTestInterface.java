package com.appdirect.InterfacesPackage;

import java.io.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;


public interface PageTestInterface {
	 public void setupBrowser() throws IOException;
     public void openHomePageTest() throws IOException, NoSuchElementException; 
	 public void openLoginPageTest() throws IOException, Exception;
     public void opensignupPageTest() throws NullPointerException, IOException;
     public void successPageTest() throws IOException;
	 public void failurePageTest() throws NoSuchElementException, Exception;  
     public void closeDriver() throws Exception;

}
