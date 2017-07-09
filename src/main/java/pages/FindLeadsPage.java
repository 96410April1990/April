package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers {
	
	public FindLeadsPage(){
		if(!verifyTitle("View Lead | opentaps CRM")) {
			Reporter.reportStep("You have landed in the wrong page. This is not Find Leads page", "FAIL");
		}
	}
	
	public FindLeadsPage enterLeadName(String data){
		enterByName("firstName", data);
		return this;
			}

	public FindLeadsPage clickFindLeadbutton(){
		clickByLink("Find Leads");
		return this;
			} 
	
	public ViewLeadPage clickSearchResult(){
		clickByLink("Rohith");
		return new ViewLeadPage();
    	}
	
	public EditLeadPage clickToEdit(){
		clickByLink("Edit");
		return new EditLeadPage();
	}
	
}
