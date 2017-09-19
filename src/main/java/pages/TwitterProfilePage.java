package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class TwitterProfilePage extends OpentapsWrappers {
	
	public void TwitterProfilePage() {
		if(!verifyTitle("Rohith Nandakumar (@rohith_nk) | Twitter")) {			
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the profile page of twitter.com, mate!", "PASS");
		}
	}
	
	public TwitterProfilePage clickProfileSettingsButton() {
		clickByXpath("/html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/a");
		return this;
	}
	
	public TwitterSignOutPage clickSignoutButton() {
		clickByXpath("/html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/div/ul/li[13]/button");
		return new TwitterSignOutPage();
	}
	

}
