package testngpractice;

import java.util.concurrent.TimeUnit;
import java.lang.NullPointerException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGChapterSix extends TestNGChapterFive {

	@Test(dataProvider="findlead", dependsOnMethods={"createLead"}, expectedExceptions={NullPointerException.class})
	public void findLead(String firstname, String lastname) throws Exception {
		
			driver.findElementByXPath("//*[@id='ext-gen594']").click();
			driver.findElementByXPath("//*[@id='ext-gen866']").click();
			driver.findElementByXPath("//*[@id='ext-gen857']").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath("//*[@id='ext-gen249']").click();
			driver.findElementByXPath("//*[@id='ext-gen249']").sendKeys(firstname);
			driver.findElementByXPath("//*[@id='ext-gen251']").click();
			driver.findElementByXPath("//*[@id='ext-gen251']").sendKeys(lastname);
			driver.findElementByXPath("//*[@id='ext-gen253']").click();
			driver.findElementByXPath("//*[@id='ext-gen253']").sendKeys("CTS");
			driver.findElementByXPath("//*[@id='ext-gen335']").click();
			throw new NullPointerException();
			
	}
	
	@DataProvider(name="findlead")
	public Object[][] leadFind() {
		
		Object[][] findleads = new Object[1][2];
		findleads[0][0] = "abc";
		findleads[0][1] = "xyz";
				
		return findleads;
		
	}
	
	
	
	
}
