package practiceTestNG;

import org.testng.annotations.Test;

public class ContactCreate extends OpenTapsWrapper {

	@Test(groups="smoke")
	public void createContact() {
		// TODO Auto-generated method stub

		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Create Contact')]").click();
		
		driver.findElementById("firstNameField").click();
		driver.findElementById("firstNameField").sendKeys("sample");
		
		driver.findElementById("lastNameField").click();
		driver.findElementById("lastNameField").sendKeys("Rohith");
		
		driver.findElementByName("submitButton").click();
		
	}

}
