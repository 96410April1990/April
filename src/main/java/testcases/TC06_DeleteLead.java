package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC06_DeleteLead extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC006";
		testCaseName="DeleteLead";
		testDescription="Deleting Lead in Opentaps";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String leadid){
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.crmsfaclick()
		.clicklead()
		.clickFindLead()
		.enterLeadId(leadid)
		.clickFindLeadbutton()
		.clickSearchResult()
		.clickDeletebutton();
	}
}