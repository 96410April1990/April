package practiceselenium;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNGScriptTwo extends TestNGScriptOne {

	@Test
	public void searchResult() throws InterruptedException {
		
		String testStatus = "FAIL";
		
		try {
			
			driver.navigate().to("http://google.com");
			driver.findElementByXPath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]").clear();
			driver.findElementByXPath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]").sendKeys("Rohith Nandakumar");
			driver.findElementByXPath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div/button/span").click();

			Thread.sleep(3000);
			
			java.util.List<WebElement> allLinks = driver.findElementsByTagName("a");
			System.out.println("Number of links for the search result is:"+" "+allLinks.size());
			
			for (WebElement links : allLinks) {
				
				System.out.println(links.isDisplayed());
				System.out.println(links.getText());
				
				if (links.getText().contains("Rohith") || links.getText().contains("rohith")) {
					
					System.out.println("SUCCESS");
					
				}
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testStatus = "PASS";		
		
	}
	
	
}
