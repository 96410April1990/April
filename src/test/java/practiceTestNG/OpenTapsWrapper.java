package practiceTestNG;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class OpenTapsWrapper {

	RemoteWebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe");
		System.out.println("The browser launched successfully, mate!");
		driver.get("http://demo1.opentaps.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void enterCredentials() {

		// Enter the ID
		driver.findElementById("username").click();
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter the password
		driver.findElementById("password").click();
		driver.findElementById("password").sendKeys("crmsfa");

		// Click the Sign in button
		driver.findElementByClassName("decorativeSubmit").click();

		// Click CRM/SFA
		driver.findElementByXPath("//*[@id='label']/a").click();

		System.out.println("Logged into opentaps successfully, mate !!");
	}

	@AfterClass
	public void logOutCloseBrowser() {

		driver.findElementByXPath("//a[contains(text(),'Logout')]").click();

		System.out.println("Logged out successfully, mate!");

		driver.quit();
		driver.close();

	}

}
