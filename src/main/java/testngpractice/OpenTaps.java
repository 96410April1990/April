package testngpractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenTaps extends TestngAnnotations {
	
	FirefoxDriver driver = new FirefoxDriver();

	@BeforeClass
	public void launchBrowser() {
		driver.manage().window().maximize();
		driver.get("http://demo1.opentaps.org/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();		
		Thread.sleep(3000);
	}
	
	@Test(expectedExceptions={NoSuchElementException.class})
	public void createLead() throws Exception {
		
		String companyName; 
				
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").clear();
		driver.findElementById("createLeadForm_firstName").sendKeys("htihor");
		driver.findElementById("createLeadForm_lastName").clear();
		driver.findElementById("createLeadForm_lastName").sendKeys("ramuk");
		driver.findElementByClassName("smallSubmit").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		companyName = driver.findElementById("viewLead_companyName_sp").getText();
		
		if (companyName.contains("CTS")) {
			System.out.println("Lead has been created!");			
		} else {
			System.out.println("Negative: Unable to create the lead!");
		}
		
		throw new NoSuchElementException();
		
	}
	
	@Test(expectedExceptions={NoSuchElementException.class})
	public void findLead() {
		
		String leadFind;
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("firstName").clear();
		driver.findElementByName("firstName").sendKeys("htihor");
		driver.findElementByLinkText("Find Leads").click();
		
		leadFind = driver.findElementByXPath("//*[@id='ext-gen905']").getText();
		
		if (leadFind.contains("htihor")) {
			System.out.println("Lead found!");
		} else {
			System.out.println("Negative: Unable to find the lead!");
		}
		
		throw new NoSuchElementException();
		
	}
	
	@Test(expectedExceptions={NoSuchElementException.class})
	public void createContact() throws InterruptedException {
		
		String addContact;
		
		driver.findElementByLinkText("Contacts").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").clear();
		driver.findElementById("firstNameField").sendKeys("ramuk");
		driver.findElementById("lastNameField").clear();
		driver.findElementById("lastNameField").sendKeys("htihor");
		driver.findElementByXPath("//*[@id='ext-gen599']").click();
		Thread.sleep(3000);
		
		addContact = driver.findElementById("viewContact_firstName_sp").getText();
		
		if (addContact.contains("ramuk")) {
			System.out.println("Created Contact!");
		} else {
			System.out.println("Negative: Unable to create the contact!");
		}
		
		throw new NoSuchElementException();
		
	}
	
	@AfterMethod
	public void logout() {
		driver.findElementByLinkText("Logout").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Logout successful!");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	
}
