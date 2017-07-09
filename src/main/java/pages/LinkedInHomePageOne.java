package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedInHomePageOne extends OpentapsWrappers {
	
	public LinkedInHomePageOne() {
		
		if (!verifyTitle("(1) Welcome! | LinkedIn")) {
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page", "FAIL");						
		} else {
			Reporter.reportStep("You have landed in the right page, mate!", "PASS");
		}
		
	}
	
	public SignedOutPage clickLogOut() {
		
		clickByXpath("/html/body/div[3]/header/div[2]/div[1]/div/nav/ul/li[4]/a/img");
		clickByXpath("/html/body/div[3]/header/div[2]/div[1]/div/nav/ul/li[4]/div/div/div[2]/ul/li[1]/div/span/span[3]/a");
		return new SignedOutPage();
		
	}
	
	

}
