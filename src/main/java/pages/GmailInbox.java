package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class GmailInbox extends OpentapsWrappers {

	public GmailInbox() {
		
		if(!verifyTitle("Inbox (395) - rohithkumar1990@gmail.com - Gmail")) {
			
			Reporter.reportStep("You have landed in the wrong page dude!", "FAIL");
			
		}
		
	}

	public HomePageGmail clickSignOut() {
		
		clickByXpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span");
		clickByLink("Sign out");
		return new HomePageGmail();
		
	}
	
	
}
