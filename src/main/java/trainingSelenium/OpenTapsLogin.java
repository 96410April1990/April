package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenTapsLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser	
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL
		driver.get("http://demo1.opentaps.org");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Login to the site using the credentials
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(3000);
		
		//click CRMSFA in the homepage
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(3000);
		
		//Create a Lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter the lead details
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("AXA");
		
		driver.findElementById("createLeadForm_firstName").clear();
		driver.findElementById("createLeadForm_firstName").sendKeys("Rohith");
		
		driver.findElementById("createLeadForm_lastName").clear();
		driver.findElementById("createLeadForm_lastName").sendKeys("Nandakumar");
		
		//Click the submit button in the create lead page
		driver.findElementByClassName("smallSubmit").click();
		
		//Verify if the lead is created
		if (driver.findElementById("viewLead_companyName_sp").getText().contains("AXA")) {
			
			System.out.println("The company name is verified");
		}
		else {
			
			System.out.println("The company name is not verified, FAIL!!!");
			
		}
		
		Thread.sleep(2000);
		
		if (driver.findElementById("viewLead_firstName_sp").getText().contains("Rohith")) {
			
			System.out.println("The first name is verified");
		}
		else {
			
			System.out.println("The first name is not verified, FAIL!!!");
			
		}
		
		Thread.sleep(2000);
		
		if (driver.findElementById("viewLead_lastName_sp").getText().contains("Nandakumar")) {
			
			System.out.println("The last name is verified");
			
		}
		else {
			
			System.out.println("The last name is not verified, FAIL!!!");
			
		}

		Thread.sleep(2000);
		
		System.out.println("Congratulations, The lead has been created successfully!!!");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
