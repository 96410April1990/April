//	*********************************************************************************************
//	* //Testcase #4: Merge Accounts					 											*
//	* //Browser: Chrome 																		*
//	* //Class Name: MergeAccounts																*
//	*********************************************************************************************

package week3;

import org.junit.Test;

public class MergeAccounts extends WrapperProject {

	@Test
	public void main() {
		// TODO Auto-generated method stub
		
		//Launch firefox browser and navigate to URL "demo1.opentaps.org"
		
		launchBrowser("chrome", "http://demo1.opentaps.org");
				
		//Enter the user name
				
		enterValueById("username", "DemoSalesManager");
				
		//Enter the password
				
		enterValueById("password", "crmsfa");
				
		//Click the Login button
				
		clickByClassName("decorativeSubmit");
				
		//Click CRM/SFA
				
		clickByXpath("//*[@id='label']/a");
		
		//Click contacts tab 
		clickByXpath("//a[contains(text(),'Contacts')]");

		//Click Merge Contacts tab
		clickByXpath("//a[contains(text(),'Merge Contacts')]");
		
		//Enter the contact ID in the from tab
		enterValueById("ComboBox_partyIdFrom", "10083");
		
		//Enter the contact ID in the To tab
		enterValueById("ComboBox_partyIdTo", "10079");
		
		//Click the Merge button
		clickByClassName("buttonDangerous");
		
		//Accept the alert
		useAlert();
		
		//Get the text
		getTextById("viewContact_fullName_sp");
		
	}

}
