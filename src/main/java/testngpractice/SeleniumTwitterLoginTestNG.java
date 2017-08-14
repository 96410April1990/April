package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testngExamples.TestNgAnnotations;

public class SeleniumTwitterLoginTestNG extends TestNgAnnotations {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void launchBrowser() {
		
		String openUrl;
		String url = "twitter.com";
		
		driver.navigate().to("http://twitter.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to"+" "+url+" "+"!");
		
		openUrl = driver.findElementByXPath("//*[@id='doc']/div[1]/div/div[1]/div[3]/h2").getText();
		
		if (openUrl.contains("What’s happening?")) {
			System.out.println("Success: Navigated to"+" "+url+"\n");		
		} else {
			System.out.println("Failure: Could not navigate to"+" "+url+"\n");
		}	
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		
		String homepage;
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input").clear();
		driver.findElementByXPath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input").sendKeys("rohithkumar90@ymail.com");
		driver.findElementByXPath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input").clear();
		driver.findElementByXPath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input").sendKeys("rohith");
		driver.findElementByXPath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]").click();
		Thread.sleep(3000);
		
		homepage = driver.findElementByXPath("//*[@id='global-nav-home']/a/span[2]").getText();
		
		if (homepage.contains("Home")) {
			System.out.println("Success: This is the home page."+"\n");			
		} else {
			System.out.println("Failure: This is not the home page."+"\n");
		}	
		
	}
	
	@Test(enabled=true, priority=1, alwaysRun=true)
	public void checkNotification() {
		
		String notification = null;
		String pageTitleNotification;
		
		driver.findElementByXPath("//*[@id='global-actions']/li[2]/a/span[2]").click();
		pageTitleNotification = driver.getTitle();
		
		if (notification==pageTitleNotification) {
			System.out.println("Success: This is the notification page."+"\n");			
		} else {
			System.out.println("Failure: This is not the notification page."+"\n");
		}
				
	}
	
	@Test(enabled=true, priority=2, alwaysRun=true)
	public void checkMessage() {
		
		String message = null;
		String pageTitleMessage;
		String directMessage;
		
		driver.findElementByXPath("//*[@id='global-actions']/li[3]/a/span[2]").click();
		pageTitleMessage = driver.getTitle();
		
		if (message==pageTitleMessage) {
			System.out.println("Success: This is still the notification page."+"\n");
		} else {
			System.out.println("Failure: This is not the notification page."+"\n");
		}
		
		directMessage = driver.findElementByXPath("//*[@id='dm_dialog-header']").getText();
		
		if (directMessage.contains("Direct Messages")) {
			System.out.println("Success: This is the messages page."+"\n");
			driver.findElementByXPath("//*[@id='dm_dialog-dialog']/div[2]/div[1]/div[2]/button[3]/span[1]").click();
		} else {
			System.out.println("Failure: This is not the messages page."+"\n");
		}
		
	}
	
	@AfterMethod(enabled=true, alwaysRun=true)
	public void logout() throws InterruptedException {
		
		String logoutPageTitle;
		String logoutText;
		
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id='user-dropdown-toggle']").click();
		driver.findElementByXPath("//*[@id='signout-button']/button").click();
		Thread.sleep(2000);
		
		logoutPageTitle = driver.getTitle();
		System.out.println("This is the title of the logout page:"+" "+logoutPageTitle+"\n");
		
		logoutText = driver.findElementByXPath("//*[@id='page-container']/div/div[1]/h1").getText();
		
		if (logoutText.contains("Download the app")) {
			System.out.println("Success: This is the logout page"+"\n");			
		} else {
			System.out.println("Failure: This is not the logout page"+"\n");
		}	
		
	}
	
	@AfterClass(enabled=true, alwaysRun=true)
	public void closeBrowser() {
		
		System.out.println("Closing the browser."+" "+"Good Bye!");
		driver.close();
		driver.quit();		
		
	}
	
}
