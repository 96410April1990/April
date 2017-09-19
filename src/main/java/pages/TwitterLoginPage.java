package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class TwitterLoginPage extends OpentapsWrappers {

	public void TwitterLoginPage() {		
		if(!verifyTitle("Twitter. It's what's happening.")) {			
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the login page of twitter.com, mate!", "PASS");
		}		
	}
	
	public TwitterLoginPage clickLoginButton() {
		clickByXpath("/html/body/div[2]/div[1]/div/div[1]/div[2]/a[3]");		
		return this;		
	}
	
	public TwitterLoginPage enterUsername(String data) {		
		enterByXPath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[1]/input", data);
		return this;		
	}
	
	public TwitterLoginPage enterPassword(String data) {
		enterByXPath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[2]/input", data);
		return this;
	}
	
	public TwitterHomePage clickSigninButton() {
		clickByXpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/input[1]");
		return new TwitterHomePage();
	}
}
