package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.TwitterLoginPage;
import wrappers.OpentapsWrappers;

public class TC001_TwitterLogin extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="firefox";
		dataSheetName="TC001_Twitter";
		testCaseName="Login";
		testDescription="Login to Twitter(Positive)";
	}
	
	@Test(dataProvider="fetchData")
	public void twitterLogin(String username, String password) {		
		new TwitterLoginPage()
		.clickLoginButton()
		.enterUsername(username)
		.enterPassword(password)
		.clickSigninButton()
		.clickProfile()
		.clickProfileSettingsButton()
		.clickSignoutButton();		
	}

}
