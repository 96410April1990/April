//	*********************************************************************************************
//	* //Testcase #2: Find and Edit a contact in Chrome 											*
//	* //Browser: Chrome 																		*
//	* //Class Name: FindAndEditContact															*
//	*********************************************************************************************

package week3;

import org.junit.Test;

public class FindAndEditContact extends WrapperProject {

	
	@Test
	public void findAndEdit() {
		// TODO Auto-generated method stub
		
		//Launch Chrome browser and navigate to URL "demo1.opentaps.org"
		launchBrowser("firefox", "http://demo1.opentaps.org");
				
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
		
		//Click find contacts tab
		clickByXpath("//a[contains(text(),'Find Contacts')]");
		
		//Find the contact using the first name
		enterByXpath("//*[@id='ext-gen128']", "adnan");
		
		//Click the Find Contacts button
		clickByXpath("//button[contains(text(),'Find Contacts')]");
		
		//Click the contact
		clickByXpath("//a[contains(text(),'adnan')]");
		
		//Get the title of the page
		printTitle();
		
		//Edit the contact information
		clickByXpath("//a[contains(text(), 'Edit')]");
		
		//Edit the first name
		enterValueById("updateContactForm_firstName", "rohith");
		
		//Click the update button
		clickByClassName("smallSubmit");
		
		//Verify the new name
		getTextById("viewContact_firstName_sp");
		
	
	}

}
