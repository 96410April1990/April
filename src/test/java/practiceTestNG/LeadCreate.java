package practiceTestNG;

import org.testng.annotations.Test;

public class LeadCreate extends OpenTapsWrapper {

	@Test(groups="smoke")
	public void createLead() {
		// TODO Auto-generated method stub
		
		//Create a Lead using the chrome browser
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		
		driver.findElementById("createLeadForm_companyName").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("abcxaa");
		
		driver.findElementById("createLeadForm_firstName").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Rohith");
		
		driver.findElementById("createLeadForm_lastName").click();
		driver.findElementById("createLeadForm_lastName").sendKeys("Nandakumar");
		
		driver.findElementByName("submitButton").click();	
				
	}

}
