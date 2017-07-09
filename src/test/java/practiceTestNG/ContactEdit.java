package practiceTestNG;

import org.testng.annotations.Test;

public class ContactEdit extends OpenTapsWrapper {

	@Test(groups="sanity")
	public void editContact() {
		// TODO Auto-generated method stub

		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Contacts')]").click();
		
		driver.findElementByName("firstName").click();
		driver.findElementByName("firstName").sendKeys("sample");

		driver.findElementByXPath("//button[contains(text(),'Find Contacts')]").click();
		
		driver.findElementByClassName("linktext").click();
		
		driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
		
		driver.findElementById("updateContactForm_firstName").clear();
		driver.findElementById("updateContactForm_firstName").sendKeys("SampleRohith");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
	}

}
