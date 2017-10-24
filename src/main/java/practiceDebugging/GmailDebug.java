package practiceDebugging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmailDebug {
	
	static ChromeDriver driver;
	static ChromeOptions driverOptions;
	public static String gmailEntrMailTxt = "//input[@id='identifierId']";
	public static String gmailEntrPwdTxt = "//input[@name='password']";
	public static String gmailNextBtn = "//span[contains(text(),'Next')]";
	public static String gmailCreateAcntBtn = "//a[contains(text(),'Create an account')]";
	public static String gmailFirstNameTxt = "//input[@name='FirstName']";
	public static String gmailLastNameTxt = "//input[@name='LastName']";
	public static String gmailEmailIdTxt = "//input[@id='GmailAddress']";
	public static String gmailPwdTxt = "//input[@id='Passwd']";
	public static String gmailPwdConfmTxt = "//input[@name='PasswdAgain']";
	public static String gmailBthdyBtn = "//div[@title='Birthday']";
	public static String gmailMonthBtn = "//div[contains(text(),'April')]";
	public static String gmailDayTxt = "//span[contains(text(),'Day')]";
	public static String gmailYearTxt = "//span[contains(text(),'Year')]";
	public static String gmailGenderBtn = "//div[contains(text(),'I am...')]";
	public static String gmailGenderSelectBtn = "//input[@value='MALE']";
	public static String gmailRcvryPhNbrTxt = "//input[@id='RecoveryPhoneNumber']";
	public static String gmailRcvryEmailTxt = "//input[@id='RecoveryEmailAddress']";
	public static String gmailSettingsBtn = "//span[contains(@class,'gb_7a')]";
	public static String gmailSignoutBtn = "//a[contains(text(),'Sign out')]";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String firstName = "Rohith";
		String lastName = "Htihor";
		String prefId = "rohithhtihor90";
		String passWd = "rohithhtihorbcdefgh";
		
		String emailId = "rohithkumar1990@gmail.com";
		String userPwd = "rohithkumar1990";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		driverOptions = new ChromeOptions();
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		driver.navigate().to("http://gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath(gmailEntrMailTxt).click();
		driver.findElementByXPath(gmailEntrMailTxt).clear();
		driver.findElementByXPath(gmailEntrMailTxt).sendKeys(emailId);
		driver.findElementByXPath(gmailNextBtn).click();
		Thread.sleep(3000);
		driver.findElementByXPath(gmailEntrPwdTxt).click();
		driver.findElementByXPath(gmailEntrPwdTxt).clear();
		driver.findElementByXPath(gmailEntrPwdTxt).sendKeys(userPwd);
		driver.findElementByXPath(gmailNextBtn).click();
		Thread.sleep(5000);
		driver.findElementByXPath(gmailSettingsBtn).click();
		Thread.sleep(5000);
		driver.findElementByXPath(gmailSignoutBtn).click();
		driver.quit();

	}

}
