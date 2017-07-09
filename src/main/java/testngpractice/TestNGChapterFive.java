package testngpractice;

/* Create a Lead 
 */

import java.lang.NullPointerException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGChapterFive extends TestNGChapterFour {
	
	@Test(dataProvider="leaddetails", expectedExceptions={NullPointerException.class})
	public void createLead(String firstname, String lastname) throws Exception {
				
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
			driver.findElementById("createLeadForm_firstName").click();
			driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
			driver.findElementById("createLeadForm_lastName").click();
			driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
			driver.findElementByClassName("smallSubmit").click();
			throw new NullPointerException();
				
	}
	
	@DataProvider(name="leaddetails")
	public Object[][] leadDetails() {
		
		Object[][] detailsLead = new Object[1][2];
		detailsLead[0][0] = "abc";
		detailsLead[0][1] = "xyz";
		
		return detailsLead;
		
	}

}
