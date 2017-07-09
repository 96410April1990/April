/*-- Handling alerts in selenium

There are three types of popup boxes in java:
	
	-- Alert box
	-- Confirm box
	-- Prompt box
	
-- A simple alert box comes with 'OK' button	
-- A confirm button comes with 'OK' and 'Cancel' buttons
-- A prompt button comes with fields to give values as input and 'OK' and 'Cancel' buttons*/

package trainingSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopupsAndAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL, maximize the browser window
		driver.navigate().to("http://popuptest.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click the hyperlink in the bottom of the webpage to test
		driver.findElementByXPath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/a").click();
		Thread.sleep(2000);
		
		//Print the parent window handle
		System.out.println("The parent window handle is:" +driver.getWindowHandle());
		
		String parentWindow = driver.getWindowHandle();
		
		//Click the first popup
		driver.findElementByLinkText("Good PopUp #1").click();
		
		//Pass the control to the new tab
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		for(String wHandle : windowHandles) {
			
			driver.switchTo().window(wHandle);
			
		}
		
		String wHandleTitle = driver.getTitle();
		Thread.sleep(2000);
		
		driver.close();
		
		//Pass the control back to the parent window
		driver.switchTo().window(parentWindow);
		
		//Print the parent window handle window 
		System.out.println("The parent window handle is:" +parentWindow);
		Thread.sleep(2000);
		
		//Click the second link in the webpage
		driver.findElementByLinkText("Good PopUp #2").click();
		
		//Pass the control to the new child window
		Set<String> windowHandlesOne = driver.getWindowHandles();
		
		System.out.println(windowHandlesOne.size());
		
		for(String wHandleOne : windowHandlesOne) {
			
			driver.switchTo().window(wHandleOne);
			
		}
		
		String wHandleTitleOne = driver.getTitle();
		Thread.sleep(2000);
		
		driver.close();
		
		//Pass the control back to the parent window
		driver.switchTo().window(parentWindow);
				
		//Print the parent window handle window 
		System.out.println("The parent window handle is:" +parentWindow);
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
