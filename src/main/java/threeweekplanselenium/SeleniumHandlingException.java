package threeweekplanselenium;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingException {
	
	FirefoxDriver driver = new FirefoxDriver();
	int snapcount = 2;
	
	public void takeSnapshot() throws IOException {
		
		boolean snaps = true;
		
		File snap = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File(".\\selenium screenshots\\"+snapcount+".jpeg"));
		snapcount++;
		
		if (snaps==true) {
			
			System.out.println("Success: Snapshot saved in the given path!"+"\n");
			return;
			
		} else {
			
			System.out.println("Failure: Unable to capture the snapshot!"+"\n");
			return;

		}
		
		
	}
	
	public void launchBrowser() throws IOException {
		
		//Launch Browser and navigate to the URL
		try {
			
			driver.manage().window().maximize();
			System.out.println("Browser window maximized!"+"\n");
			driver.navigate().to("http://demo1.opentaps.org/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Navigated to the URL!"+"\n");
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
			System.out.println("Sorry mate, no such element found!"+"\n");
			
		} finally {
			
			takeSnapshot();
			
		}
		
	}
	
	public void login() throws IOException, InterruptedException {
		
		try {
			
			//Enter the credentials
			driver.findElementById("username").clear();
			driver.findElementById("username").sendKeys("DemoSalesManager");
			System.out.println("Entered the ID!"+"\n");
			Thread.sleep(2000);
			
			driver.findElementById("password").clear();
			driver.findElementById("password").sendKeys("crmsfa");
			System.out.println("Entered the password!"+"\n");
			Thread.sleep(2000);
			
			takeSnapshot();
			
			//Click the 'Login' button
			driver.findElementByXPath("//*[@id='login']/p[3]/input").click();
			Thread.sleep(2000);
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
			System.out.println("Sorry mate, no such element found!");
			
		} finally {
			
			takeSnapshot();
			
		}
		
	}
	
	public void logout() throws IOException {
		
		takeSnapshot();
		
		try {
			
			//Logout 
			driver.findElementByClassName("decorativeSubmit").click();
			System.out.println("Logged out!");
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Sorry mate, no such element found!");
			
		} finally {
			
			takeSnapshot();
			
		}
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumHandlingException usingException = new SeleniumHandlingException();
		usingException.launchBrowser();
		usingException.login();
		usingException.logout();

	}

}
