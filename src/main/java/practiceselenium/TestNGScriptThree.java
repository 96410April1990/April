package practiceselenium;

import java.awt.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNGScriptThree extends TestNGScriptOne {

	@Test(enabled=true, priority=1, invocationCount=1, invocationTimeOut=25000, expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	public void salesForce() throws InterruptedException {
		
		String testStatus = "FAIL";
		
		try {
			
			driver.navigate().to("https://developer.salesforce.com/signup?d=70130000000td6N");
			Thread.sleep(3000);
			driver.findElementById("first_name").clear();
			driver.findElementById("first_name").sendKeys("Rohith");
			driver.findElementById("last_name").clear();
			driver.findElementById("last_name").sendKeys("Nandakumar");
			driver.findElementByXPath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[2]/form/input[6]").clear();
			driver.findElementByXPath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[2]/form/input[6]").sendKeys("rohithkumar90@ymail.com");
			
			//Select a value in the drop down
			WebElement role = driver.findElementById("job_role");
			Select selectRole = new Select(role);
			selectRole.selectByIndex(3);
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[2]/form/input[7]").clear();
			driver.findElementByXPath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[2]/form/input[7]").sendKeys("Cognizant Technology Solutions");
			
			//Select the country in the drop down
			WebElement country = driver.findElementById("country");
			Select selectCountry = new Select(country);
			java.util.List<WebElement> listCountries = selectCountry.getOptions();
			
			for (WebElement printCountries : listCountries) {
				
				System.out.println("The countries in the drop down are:"+" "+printCountries.getText());
				
			}
			
			selectCountry.selectByValue("Israel");
			
			Thread.sleep(3000);
			
			driver.findElementById("postal_code").click();
			driver.findElementById("postal_code").sendKeys("600087");
			driver.findElementById("username").clear();
			driver.findElementById("username").sendKeys("rohith@xyz.com");
			driver.findElementByXPath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div/div[2]/form/div[9]/label").click();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.quit();
			
		}
		
		testStatus = "PASS";
		
	}
	
	@Test(alwaysRun=true, dependsOnMethods={"handleFrame"}, description="Accepting alerts in webpage", priority=3, expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	public void acceptAlert() throws InterruptedException {
		
		WebElement readText;
		String printText;
		
		String testStatus = "FAIL";
		
		try {
			
			driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			Thread.sleep(3000);
			//Move to frame
			driver.switchTo().frame(driver.findElementById("iframeResult"));
			//Read the text inside the frame
			readText = driver.findElementByXPath("Click the button to display an alert box:");
			printText = readText.getText();
			//Print the text
			System.out.println("The text inside the frame is:"+" "+printText);
			//Click the button inside the frame
			driver.findElementByXPath("/html/body/button").click();
			//Accept the alert
			Alert myAlert = driver.switchTo().alert();
			myAlert.accept();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.quit();
			
		}
		
		testStatus = "PASS";
				
	}
	
	@Test(alwaysRun=true, priority=2, dependsOnMethods={"salesForce"}, invocationTimeOut=30000, description="Handling frames in a webpage", expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	public void handleFrame() throws InterruptedException {
		
		String testStatus = "FAIL";
		String readText;
		String readTextOutsideFrame;
		boolean enterFrame = false;
		
		try {
					
			driver.get("http://jqueryui.com/draggable/");
			Thread.sleep(3000);
			//Switch to the frame
			driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
			if(enterFrame==true) {
				
				System.out.println("Entered the frame, mate!"+"\n");
				
			}
			else {
				
				System.out.println("Nah mate, could not enter the frame!"+"\n");
				
			}
			//Read and print the text inside the frame
			readText = driver.findElementById("draggable").getText();
			System.out.println("The text inside the frame is:"+" "+readText+"\n");
			
			//Come out of the frame
			driver.switchTo().defaultContent();
			
			//Read and print the text outside the frame
			readTextOutsideFrame = driver.findElementByXPath("/html/body/div[1]/div[2]/div/div[1]/p[1]").getText();
			System.out.println("The text outside the frame is:"+" "+readTextOutsideFrame+" "+"\n");			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.quit();
			
		}
		
		testStatus = "PASS";		
		
	}
	
	@Test(alwaysRun=true, priority=4, dependsOnMethods={"acceptAlert"}, description="Handling prompts in a webpage")
	public void handlePrompts() throws InterruptedException {
		
		boolean enterFrame = false;
		String readText;
		String testStatus = "FAIL";
		
		try {
			
			driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			Thread.sleep(3000);
			
			//Switch to the frame
			driver.switchTo().frame(driver.findElementById("iframeResult"));
			if (enterFrame==false) {
				
				System.out.println("Entered the frame, mate!");
				
			} else {

				System.out.println("Nah mate, could not enter the frame!");
				
			}
			//Read and print the text inside the frame
			readText = driver.findElementByXPath("/html/body/p[1]").getText();
			System.out.println("The text inside the frame is:"+" "+readText+"\n");
			
			//Click the button
			driver.findElementByXPath("/html/body/button").click();
			Alert myAlert = driver.switchTo().alert();
			System.out.println("The text in the alert box is:"+" "+myAlert.getText());
			myAlert.sendKeys("Rohith Nandakumar");
			myAlert.accept();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.quit();
			
		}
		
		testStatus = "PASS";
		
	}
	
	@Test(alwaysRun=true, priority=5, dependsOnMethods={"handlePrompts"}, description="Handling windows in a webpage")	
	public void handlingWindows() throws InterruptedException {
		
		boolean switchWindow = false;
		String testStatus = "FAIL";
		String primaryWindow;
		
		try {
			
			driver.navigate().to("https://legacy.crystalcruises.com/login.aspx");
			Thread.sleep(3000);
			
			//Get the window handle and print it
			primaryWindow = driver.getWindowHandle();
			System.out.println("This is the primary window handle:"+" "+primaryWindow);
			
			//Click 'Guest check-in' link
			driver.findElementByXPath("/html/body/form/div[10]/div[1]/ul/li[6]/a").click();
			
			Set<String> winHandles = driver.getWindowHandles();
			System.out.println("The number of windows is:"+" "+driver.getWindowHandles());
			for (String secondWindow : winHandles) {
				
				//Pass control to the secondary window
				driver.switchTo().window(secondWindow);
								
			}
			
			System.out.println("This is the secondary window handle:"+" "+driver.getWindowHandle());
			
			if (switchWindow==true) {
				
				System.out.println("Switched to the child window, mate!");
				
			} else {

				System.out.println("Nah mate, could not switch to the child window!");
				
			}
			
			//Switch to the parent window
			driver.switchTo().window(primaryWindow);
			System.out.println("The current window is:"+" "+driver.getWindowHandle());		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.quit();
			
		}
			
	}
	
	@Test(alwaysRun=true, priority=6, dependsOnMethods={"handlingWindows"}, description="Using data provider", dataProvider="DP")
	public void usingDataProvider(String firstname, String lastname) {
		
		System.out.println("Hi Guys, my first name is"+" "+firstname+" "+"and my last name is"+" "+lastname+".");
		
	}
	
	@DataProvider(name="DP")
	public Object[][] usingObject() {
		
		String[][] data = new String[1][2];
		data[0][0] = "Rohith";
		data[0][1] = "Nandakumar";		
		
		return data;
		
	}
	
	@Test
	public void dragAnddrop() {
		
		driver.navigate().to("http://jqueryui.com/");
		
		
		
	}
	
	
	
	
	
}
