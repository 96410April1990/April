package testngpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestNGChapterFour extends TestNGChapterThree {
	
	@BeforeMethod
	public void logIn() {
		
		driver.findElementById("username").click();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").click();
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();		
		
	}
	
	@AfterMethod
	public void logOut() {
		
		driver.findElementByLinkText("Logout").click();
		
	}
	
	
}
