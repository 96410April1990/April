package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import wrappers.OpentapsWrappers;

public class TC01_Linkedin extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="firefox";
		dataSheetName="TC01_Linkedin";
		testCaseName="Login";
		testDescription="Login to LinkedIn(Positive)";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String company){
		
		new LinkedInLoginPage()
		.enterUserId(username)
		.enterPassword(password)
		.clickSignInButton()
		.enterCompanyName(company)
		.clickSearchButton()
		.clickResult();			
		
	}

}
