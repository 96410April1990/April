package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedInHomePage extends OpentapsWrappers {
	
	public LinkedInHomePage() {
		
		if(!verifyTitle("Welcome! | LinkedIn")) {
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the home page, mate!", "PASS");			
		}
		
	}
	
	public LinkedInHomePage enterCompanyName(String data) {
		
		enterById("main-search-box", data);
		return this;		
		
	}
	
	public LinkedInSearchPage clickSearchButton() {
		
		clickByClassName("search-button");
		return new LinkedInSearchPage();
		
	}
	

}
