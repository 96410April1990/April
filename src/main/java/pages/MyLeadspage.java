package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadspage extends OpentapsWrappers{
	
	public MyLeadspage(){
		if(!verifyTitle("My Leads | opentaps CRM")){
			Reporter.reportStep("Landed in the wrong page, this is not the Lead page", "FAIL");
		}
	}

	public CreateLeadPage clickleadtab() throws InterruptedException{
		clickByLink("Create Lead");
		Thread.sleep(3000);
		return new CreateLeadPage();
	}
	
	public FindLeadsPage clickFindLead(){
		clickByLink("Find Leads");
		return new FindLeadsPage();
	}

}