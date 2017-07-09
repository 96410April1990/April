package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class SignedOutPage extends OpentapsWrappers {
	
	public SignedOutPage() {
		
		if (!verifyTitle("Signed Out | LinkedIn")) {
			Reporter.reportStep("Sorry mate, looks like you have landed in the wrong page!", "PASS");			
		} else {
			Reporter.reportStep("This is the right page, mate!", "FAIL");
		}
					
	}

}
