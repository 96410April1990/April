package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScriptOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the URL
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo1.opentaps.org/");
		
		//Maximize the browser and set timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the user name and password to Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click the Login button
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		
		//Click CRMSFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Logout
		driver.findElementByLinkText("Logout").click();
		
		//Close the browser
		driver.quit();
		
		System.out.println("Hey Rohith! I just logged into the portal and logged out.");
		System.out.println("\n"+"RESULT: PASS");

	}

}
