package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{
	
	public CreateLeadPage(){
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			Reporter.reportStep("You have landed in the wrong page, this is not the create lead page", "FAIL");
		}
	}

	public CreateLeadPage enterCompanyName(String data){

		enterById("createLeadForm_companyName",data);
		return this; 
		
	}
	
		public CreateLeadPage enterFirstName(String data){

			enterById("createLeadForm_firstName",data);
			return this; 
	}
		
		public CreateLeadPage enterLastName(String data){

			enterById("createLeadForm_lastName",data);
			return this; 
	}
	
		public ViewLeadPage clickCreateLead(){

			clickByClassName("smallSubmit");
			return new ViewLeadPage(); 
	}
}