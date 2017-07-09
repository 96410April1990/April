package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedInLoginPage extends OpentapsWrappers {
	
	public LinkedInLoginPage() {
		
		if(!verifyTitle("World’s Largest Professional Network | LinkedIn")) {			
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the login page, mate!", "PASS");
		}
		
	}
	
	public LinkedInLoginPage enterUserId(String data) {
		
		enterById("login-email", data);
		return this;
		
	}
	
	public LinkedInLoginPage enterPassword(String data) {
		
		enterById("login-password", data);
		return this;
		
	}
	
	public LinkedInHomePage clickSignInButton() {
		
		clickByName("submit");
		return new LinkedInHomePage();		
		
	}

}
