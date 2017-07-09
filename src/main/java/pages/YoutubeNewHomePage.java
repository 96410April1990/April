package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class YoutubeNewHomePage extends OpentapsWrappers {

	public YoutubeNewHomePage() {
		
		if (!(verifyTitle("YouTube"))) {
			Reporter.reportStep("Sorry mate, you have landed in the wrong page", "FAIL");			
		}
		else {
			Reporter.reportStep("Yes, this is the right page", "PASS");
		}
		
	}
	
	
}
