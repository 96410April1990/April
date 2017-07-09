package practiceTestNG;

import org.testng.annotations.Test;

public class LeadDelete extends OpenTapsWrapper {

	@Test(groups="sanity")
	public void deleteLead() {
		// TODO Auto-generated method stub
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();

		driver.findElementByName("firstName").click();
		driver.findElementByName("firstName").sendKeys("RohithSample");

		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		
		driver.findElementByClassName("linktext").click();
		
		driver.findElementByClassName("subMenuButtonDangerous").click();
		
		
	}

}
