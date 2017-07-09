package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {
	
	public ViewLeadPage(){
		if(!verifyTitle("View Lead | opentaps CRM")){
			Reporter.reportStep("You have landed in the wrong page, this is not the view lead page", "FAIL");
		}
	}
	
	public EditLeadPage clickToEdit(){
		clickByLink("Edit");
		return new EditLeadPage();
		
	}
	
	//public MyLeadspage clickDeletebutton(){
		//clickByClassName("subMenuButtonDangerous");
		//return new MyLeadspage();
	//}

}
