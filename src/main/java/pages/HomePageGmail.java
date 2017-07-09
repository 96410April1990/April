package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePageGmail extends OpentapsWrappers {

	public HomePageGmail() {
		
		if(!verifyTitle("Gmail")) {
			
			Reporter.reportStep("Landed in the wrong page mate! This is not the login page", "FAIL");
			
		}
		
	}
	
	public HomePageGmail enterId(String id) {
		
		enterById("Email", id);
		return this;
		
	}
	
	public HomePageGmail clickNext() {
		
		clickById("next");
		return this;
		
	}
	
	public HomePageGmail enterPassword(String password) {
		
		enterById("Passwd", password);
		return this;
		
	}
	
	public GmailInbox clickSignIn() {
		
		clickById("signIn");
		return new GmailInbox();
						
	}

	
}
