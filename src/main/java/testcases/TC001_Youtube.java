package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import pages.YoutubeHomepage;
import wrappers.OpentapsWrappers;

public class TC001_Youtube extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="firefox";
		dataSheetName="TC001_Youtube";
		testCaseName="Youtube";
		testDescription="Use Youtube(Positive)";
	}
	
	@Test(dataProvider="fetchData")
	public void login(String search){
		
		new YoutubeHomepage()
		.enterKeyword(search)
		.clickSearch()
		.clickResult()
		.clickHome();
		
	}

}
