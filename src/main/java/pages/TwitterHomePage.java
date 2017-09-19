package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class TwitterHomePage extends OpentapsWrappers {

	public void TwitterHomePage() {
		if(!verifyTitle("Twitter")) {			
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the home page of twitter.com, mate!", "PASS");
		}
	}
	
	public TwitterProfilePage clickProfile() {
		clickByXpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div/div[1]/div/a");
		return new TwitterProfilePage();
	}
	
	
}
