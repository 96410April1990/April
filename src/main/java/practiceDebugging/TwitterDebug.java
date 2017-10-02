package practiceDebugging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TwitterDebug {
	
	public static String twitterUrl = "https://twitter.com/";
	public static String twitterLoginBtn = "//a[contains(text(),'Log in')]";
	public static String twitterEnterIdTxt = "//input[@name='session[username_or_email]']";
	public static String twitterEnterPwdTxt = "//input[@name='session[password]']";
	public static String twitterLoginBtnTwo = "//input[@value='Log in']";
	public static String twitterProfileSettingsBtn = "//a[@id='user-dropdown-toggle']";
	public static String twitterLogoutBtn = "//button[contains(text(),'Log out')]";
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String twitterUserId = "rohithkumar90@ymail.com";
		String twitterUserPwd = "rohith";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		ChromeDriver driver;
		ChromeOptions driverOptions = new ChromeOptions();	
		
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		driver.navigate().to(twitterUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter the Id and password of the user
		driver.findElementByXPath(twitterLoginBtn).click();
		driver.findElementByXPath(twitterEnterIdTxt).click();
		driver.findElementByXPath(twitterEnterIdTxt).clear();
		driver.findElementByXPath(twitterEnterIdTxt).sendKeys(twitterUserId);
		driver.findElementByXPath(twitterEnterPwdTxt).click();
		driver.findElementByXPath(twitterEnterPwdTxt).clear();
		driver.findElementByXPath(twitterEnterPwdTxt).sendKeys(twitterUserPwd);
		driver.findElementByXPath(twitterLoginBtnTwo).click();
		Thread.sleep(3000);
		driver.findElementByXPath(twitterProfileSettingsBtn).click();
		driver.findElementByXPath(twitterLogoutBtn).click();	
		driver.quit();

	}

}
