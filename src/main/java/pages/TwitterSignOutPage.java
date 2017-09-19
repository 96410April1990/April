package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class TwitterSignOutPage extends OpentapsWrappers {

	public void TwitterSignOutPage()  {
		if(!verifyTitle("Rohith Nandakumar (@rohith_nk) | Twitter")) {			
			Reporter.reportStep("I am sorry mate, looks like you have landed in the wrong page!", "FAIL");
		}
		else {
			Reporter.reportStep("This is the signout page of twitter.com, mate!", "PASS");
		}		
	}
	
}
