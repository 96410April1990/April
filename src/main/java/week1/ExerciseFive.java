package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExerciseFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Launch the browser and open the url http://www.google.com
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://demo1.opentaps.org/");

	//Maximize the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Login using the credentials
	driver.findElementById("username").click();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").click();
	driver.findElementById("password").sendKeys("crmsfa");
	
	//Click the Login button
	driver.findElementByClassName("decorativeSubmit").click();
	
	//Click the link CRMSFA
	driver.findElementByXPath("//*[@id='button']/a/img").click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
	//Click Create Lead
	driver.findElementByXPath("//*[@id='left-content-column']/div[1]/div[2]/ul/li[1]/a").click();
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Enter the credentials again
	//driver.findElementByXPath("/html/body/div[5]/div/div[1]/div[1]/div/div[2]/form/table/tbody/tr[1]/td[2]/input").click();
	//driver.findElementByXPath("/html/body/div[5]/div/div[1]/div[1]/div/div[2]/form/table/tbody/tr[1]/td[2]/input").sendKeys("DemoSalesManager");
	//driver.findElementByXPath("/html/body/div[5]/div/div[1]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input").click();
	///driver.findElementByXPath("/html/body/div[5]/div/div[1]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input").sendKeys("crmsfa");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//Enter the mandatory fields
	driver.findElementById("createLeadForm_companyName").click();
	driver.findElementById("createLeadForm_companyName").sendKeys("sample");
	
	//Enter the first name and last name
	driver.findElementByXPath("//*[@id='createLeadForm_firstName']").click();
	driver.findElementByXPath("//*[@id='createLeadForm_firstName']").sendKeys("Rohith");
	
	driver.findElementByXPath("//*[@id='createLeadForm_lastName']").click();
	driver.findElementByXPath("//*[@id='createLeadForm_lastName']").sendKeys("sample");
	
	//Click the create lead button
	driver.findElementByClassName("smallSubmit").click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Verify if the lead is created with the correct name
	if(driver.findElement(By.id("viewLead_firstName_sp")).getText().contains("Rohith"))
	{
		System.out.println("Yes, the lead is created with the correct name");
	}
	else
	{
		System.out.println("Sorry mate, the lead name is incorrect");
	}
	
	driver.close();
	
	}

}
