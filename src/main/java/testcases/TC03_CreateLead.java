package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC03_CreateLead extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="TC003";
		testCaseName="CreateLead";
		testDescription="Creating Lead in Opentaps";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String CompanyName,String FirstName,String LastName) throws InterruptedException{
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.crmsfaclick()
		.clicklead()
		.clickleadtab()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickCreateLead();
		
	
	}	
	
	
}
