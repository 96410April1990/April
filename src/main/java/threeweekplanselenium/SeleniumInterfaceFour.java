package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumInterfaceFour implements SeleniumInterfaceThree {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public void launchBrowser() {
				
		driver.manage().window().maximize();
		System.out.println("Hi Rohith! Browser launched successfully!");
				
	}
	
	public void openUrl() {
		
		driver.navigate().to("http://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("\n"+"Navigated to the URL!");
		
	}
	
	public void login() throws InterruptedException {
		
		//Enter your email ID and password
		driver.findElementById("Email").click();
		driver.findElementById("Email").sendKeys("rohithkumar1990@gmail.com");
		driver.findElementById("next").click();
		driver.findElementById("Passwd").click();
		driver.findElementById("Passwd").sendKeys("rohith");
		driver.findElementById("signIn").click();
		System.out.println("\n"+"Logged in successfully!");
		Thread.sleep(3000);
		
	}
	
	public void logout() {
		
		driver.findElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
		driver.findElementByLinkText("Sign out").click();
		System.out.println("\n"+"Logged out successfully!");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SeleniumInterfaceFour test = new SeleniumInterfaceFour();
		
		test.launchBrowser();
		test.openUrl();
		test.login();
		test.logout();	
		
	}

	

}
