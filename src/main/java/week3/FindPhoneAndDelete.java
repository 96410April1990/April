//	*********************************************************************************************
//	* //Testcase #3: Find a contact by the Phone Number and Delete										*
//	* //Browser: Chrome 																		*
//	* //Class Name: FindPhoneAndDelete							*
//	*********************************************************************************************

package week3;

import org.junit.Test;

public class FindPhoneAndDelete extends WrapperProject {

	@Test
	public void findAndDelete() {
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
		
		//Click the Phone Tab
		clickByXpath("//span[contains(text(),'Phone')]");
		
		//Enter the Phone Number
		enterValueByName("phoneNumber", "9840099400");
		
		//Click Find Contacts button
		clickByXpath("//button[contains(text(),'Find Contacts')]");
		
		//Click the search result
		clickByXpath("//a[contains(text(),'rohith')]");
		
		//Click Deactivate Contact
		clickByXpath("//a[contains(text(),'Deactivate Contact')]");
		
		//Switch to Alert
		useAlert();
		
		//Click Find Contacts button
		clickByXpath("//a[contains(text(),'Find Contacts')]");
		
		//Search by the contact ID
		enterValueByName("id", "10083");
		
		//Click Find Contacts button
		clickByXpath("//button[contains(text(),'Find Contacts')]");
		
	}

}
