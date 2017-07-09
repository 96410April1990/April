package practiceTestNG;

import org.testng.annotations.Test;

public class LeadEdit extends OpenTapsWrapper {

	@Test(groups="sanity")
	public void editLead() {
		// TODO Auto-generated method stub
		
	//Find and edit the lead
	driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
	driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
	
	driver.findElementByName("firstName").click();
	driver.findElementByName("firstName").sendKeys("Rohith");

	driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	
	driver.findElementByClassName("linktext").click();
	
	driver.findElementByXPath("//a[contains(text(),'Edit')]").click();
	
	driver.findElementById("updateLeadForm_firstName").clear();
	driver.findElementById("updateLeadForm_firstName").sendKeys("RohithSample");
	
	driver.findElementByClassName("smallSubmit").click();
	
	}

}
