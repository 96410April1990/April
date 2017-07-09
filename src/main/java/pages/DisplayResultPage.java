package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class DisplayResultPage extends OpentapsWrappers {
	
	public DisplayResultPage() {
		
		if(!verifyTitle("Cognizant: Overview | LinkedIn")) {
			Reporter.reportStep("Sorry mate, looks like you have landed in the wrong page", "FAIL");
		}
		else {
			Reporter.reportStep("This is the right page!", "PASS");
		}
	}
	
	public LinkedInHomePageOne clickHome() {
		
		clickByXpath("/html/body/div[3]/header/div[2]/div[2]/div/nav[1]/ul/li[1]/a");
		return new LinkedInHomePageOne();
		
	}

}
