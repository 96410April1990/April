package threeweekplanselenium;

import org.junit.Test;

public class SeleniumUsingWrappersOne extends SeleniumWrapperProject {
	
	@Test
	public void loginAndlogout() throws InterruptedException {
		
		launchBrowser("chrome", "http://demo1.opentaps.org/");
		enterValueById("username", "DemoSalesManager");
		enterValueById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		Thread.sleep(3000);
		
		String verifyText = driver.findElementByXPath("//*[@id='label']/a").getText();
		System.out.println(verifyText);
		
		if (verifyText.contains("CRM/SFA")) {
			
			System.out.println("SUCCESS");
			
		} else {
			
			System.out.println("FAILURE");

		}
		
		clickByClassName("decorativeSubmit");
		driver.close();		
		
	}

}
