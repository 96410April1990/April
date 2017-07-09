package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenTapsUsingTestNG extends UsingTestNGChapterThree {

	public FirefoxDriver driver = new FirefoxDriver();
	
	//launch and maximize the browser
	@BeforeClass(description="This method launches the browser")
	public void launchBrowser() {
		
		System.out.println("Hey bud! The browser is successfully launched!");
		driver.manage().window().maximize();		
		
	}
	
	//navigate to the URL, enter the user ID and password and click CRM/SFA
	@BeforeTest(description="This method navigates to the URL and logs into the website")
	public void openWebpage() throws InterruptedException {
		
		driver.navigate().to("http://demo1.opentaps.org");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").click();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").click();
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("The user has successfully logged in!");
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	
	//Click Leads tab and click create lead
	@Test(priority=1, invocationCount=2, description="This method clicks the create lead button")
	public void clickCreateLead() {
	
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("Hey bud! clicked the create Lead tab! what next?");
		
		
	}
	
	//Click Lead tab and click find lead
	@Test(enabled=false, description="This method clicks the find lead button")
	public void clickFindLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		System.out.println("Hey bud! clicked the find Lead tab! what next?");
		
	}
	
	//Click Contacts tab and click create contact
	@Test(priority=2, dependsOnMethods={"clickCreateLead"}, description="click create contact under contacts tab", timeOut=10000)
	public void clickCreateContact() {
		
		driver.findElementByLinkText("Contacts").click();
		driver.findElementByLinkText("Create Contact").click();
		System.out.println("Hey bud! clicked the create contact tab! what next?");
		
	}
	
	//Log out
	@AfterClass(description="This method logs out of the website")
	public void logout() {
		
		driver.findElementByLinkText("Logout").click();
		System.out.println("The user has successfully logged out!");
		
	}
	
	//Close the browser
	@AfterTest(alwaysRun=true, description="This method closes the browser")
	public void closeBrowser() {
		
		driver.quit();
		//driver.close();
		System.out.println("Browser closed successfully!");
		
	}
	
	
	
}
