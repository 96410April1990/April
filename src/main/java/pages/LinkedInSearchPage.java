package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LinkedInSearchPage extends OpentapsWrappers {
	
	public LinkedInSearchPage() {
		
		if(!verifyTitle("Search | LinkedIn")) {
			Reporter.reportStep("Sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the search page mate!", "PASS");
		}
	}
	
	public DisplayResultPage clickResult() {
		
		clickByXpath("/html/body/div[3]/div/div[2]/div[1]/div[5]/div[4]/ol/li[2]/div/h3/a/b");
		return new DisplayResultPage();
		
	}

}
