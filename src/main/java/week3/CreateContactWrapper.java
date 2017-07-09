//	*********************************************************************************************
//	* //Testcase #1: Create a contact in Firefox 												*
//	* //Browser: Firefox 																		*
//	* //Class Name: CreateContactWrapper														*
//	*********************************************************************************************

package week3;

import org.junit.Test;

public class CreateContactWrapper extends WrapperProject {


	@Test
	public void createcontact() {
		// TODO Auto-generated method stub

		//Launch firefox browser and navigate to URL "demo1.opentaps.org"
		
		launchBrowser("firefox", "http://demo1.opentaps.org");
		
		//Enter the user name
		
		enterValueById("username", "DemoSalesManager");
		
		//Enter the password
		
		enterValueById("password", "crmsfa");
		
		//Click the Login button
		
		clickByClassName("decorativeSubmit");
		
		//Click CRM/SFA
		
		clickByXpath("//*[@id='label']/a");
		
		//Click Create Contact
		
		clickByLinkText("Create Contact");
		
		//Enter the first name
		
		enterValueById("firstNameField", "adnan");
		
		//Enter the last name
		
		enterValueById("lastNameField", "ramuk");
		
		//Enter the Phone Number
		
		enterValueById("createContactForm_primaryPhoneNumber", "9840099400");
		
		//Enter the e-mail
		
		enterValueById("createContactForm_primaryEmail", "abcxyz@gmail.com");
		
		//Click the Create Contact button
		
		clickByClassName("smallSubmit");
		
		//Get the contact Id
		
		contactInfo("tabletext");
		
	}

}
