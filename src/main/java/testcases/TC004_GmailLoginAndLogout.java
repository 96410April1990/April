package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePageGmail;
import pages.GmailInbox;
import wrappers.OpentapsWrappers;


public class TC004_GmailLoginAndLogout extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="firefox";
		dataSheetName="TC004";
		testCaseName="LoginGmail";
		testDescription="Login and Logout of gmail";
	}
	
	
	@Test(dataProvider="fetchData")
	public void loginGmail(String username,String password) {
		
		new HomePageGmail()
		.enterId(username)
		.clickNext()
		.enterPassword(password)
		.clickSignIn()
		.clickSignOut();
		
	}

}
