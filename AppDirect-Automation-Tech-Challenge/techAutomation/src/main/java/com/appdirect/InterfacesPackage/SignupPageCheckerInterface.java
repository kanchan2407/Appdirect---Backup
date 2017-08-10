package com.appdirect.InterfacesPackage;

import java.io.IOException;
import com.appdirect.ExceptionPackage.NoSuchElementException;
import com.appdirect.Pages.AppdirectSignUppage;
import com.appdirect.checkerPackage.SignuppageChecker;


public interface SignupPageCheckerInterface {

   public SignuppageChecker checkSignupPage() throws IOException;
   public AppdirectSignUppage checkEmailBox() throws NullPointerException, IOException; 
   public SignuppageChecker checkSameEmailId() throws IOException, NoSuchElementException; 
   public SignuppageChecker verifyErrorbox();

}
