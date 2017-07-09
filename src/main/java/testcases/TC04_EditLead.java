package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC04_EditLead extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC004";
		testCaseName="EditLead";
		testDescription="Editing Lead in Opentaps";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String firstname,String FirstName,String LastName) throws InterruptedException{
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.crmsfaclick()
		.clicklead()
		.clickFindLead()
		.enterLeadName(firstname)
		.clickFindLeadbutton()
		.clickSearchResult()
		.clickToEdit()
		.enterNewFirstName(FirstName)
		.enterNewLastName(LastName)
		.clickUpdate();		
	
	}	
	
	
}
