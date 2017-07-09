package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class YoutubeHomepage extends OpentapsWrappers {

	public YoutubeHomepage() {

		if (!verifyTitle("YouTube")) {
			Reporter.reportStep("Sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the right page!", "PASS");			
		}			
		
	}
	
	public YoutubeHomepage enterKeyword(String data) {
		
		enterById("masthead-search-term", data);
		return this;
		
	}
	
	public YoutubeNarendraModi clickSearch() {
		
		clickById("search-btn");
		return new YoutubeNarendraModi();
	}

}
