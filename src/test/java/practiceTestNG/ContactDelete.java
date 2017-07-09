package practiceTestNG;

import org.testng.annotations.Test;

public class ContactDelete extends OpenTapsWrapper {

	@Test(groups="sanity")
	public void deleteContact() {
		// TODO Auto-generated method stub
		
		driver.findElementByXPath("//a[contains(text(),'Contacts')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Contacts')]").click();

		driver.findElementByName("firstName").click();
		driver.findElementByName("firstName").sendKeys("SampleRohith");

		driver.findElementByXPath("//button[contains(text(),'Find Contacts')]").click();
		
		driver.findElementByClassName("linktext").click();
		
		driver.findElementByClassName("subMenuButtonDangerous").click();

	}

}
