package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {
	
	public EditLeadPage(){
		if(!verifyTitle("opentaps CRM")) {
			Reporter.reportStep("This is not the edit lead page", "FAIL");
		}
	}

	public EditLeadPage enterNewFirstName(String data){
		enterById("updateLeadForm_firstName", data);
		return this;
	}
	
	public EditLeadPage enterNewLastName(String data){
		enterById("updateLeadForm_lastName", data);
		return this;
	}
	
	public ViewLeadPage clickUpdate(){
		clickByName("submitButton");
		return new ViewLeadPage();
	}
}
