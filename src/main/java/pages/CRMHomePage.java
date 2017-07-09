package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{
	
	public CRMHomePage(){
		if(!verifyTitle("My Home | opentaps CRM") ){
			Reporter.reportStep("Landed in Wrong Page.This is not the Homepage","FAIL");
		}
	}

	public MyLeadspage clicklead() throws InterruptedException{
		clickByLink("Leads");
		Thread.sleep(3000);
		return new MyLeadspage();
	}
}