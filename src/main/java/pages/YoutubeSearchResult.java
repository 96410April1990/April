package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class YoutubeSearchResult extends OpentapsWrappers {
	
	public YoutubeSearchResult() {
		
		if (!(verifyTitle("PM Narendra Modi Gets Emotional Several Times In Goa Speech | Black Money | Corruption | Media | - YouTube"))) {
			Reporter.reportStep("Sorry mate, looks like you have landed in the wrong page", "FAIL");
		}
		else {
			Reporter.reportStep("Yes, this is the right page", "PASS");
		}
	}
	
	public YoutubeNewHomePage clickHome() {
		
		clickByXpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/span/a/span[1]");
		return new YoutubeNewHomePage();
		
	}

}
