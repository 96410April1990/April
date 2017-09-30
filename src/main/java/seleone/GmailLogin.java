package seleone;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GmailLogin {
	
	/* 
	 * Gmail Selenium Script - 24/09/2017
	 */
	
	static WebDriver driver;
	static ChromeOptions driverOptions;
	public static String moreOptnsBtn = "//div[contains(text(),'More options')]";
	public static String createAccntBtn = "//div[contains(text(),'Create account')]";
	public static String firstNameTxt = "//input[@id='FirstName']";
	public static String lastNameTxt = "//input[@id='LastName']";
	public static String chooseIdTxt = "//input[@name='GmailAddress']";
	public static String passwdTxt = "//input[@name='Passwd']";
	public static String passwdTwoTxt = "//input[@id='PasswdAgain']";
	public static String birthMonthVal = "//div[@title='Birthday']";
	public static String selectBirthMnthVal = "//div[contains(text(),'April')]";
	public static String selectDay = "//span[contains(text(),'Day')]";
	WebElement selectDayOne; 
	WebElement selectYearOne; 
	
	public static String selectYear = "//span[contains(text(),'Year')]";
	
	public static String genderVal = "//div[@title='Gender']";
	public static String selectGenderVal = "//div[contains(text(),'Male')]";	
	public static String phoneNumberVal = "//input[@id='RecoveryPhoneNumber']";
	public static String recoveryMailTxt = "//input[@id='RecoveryEmailAddress']";
	Actions actions;
	Actions actionsOne;	
	/*Select location;
	public static String selectLocation = "//div[contains(text(),'India (????)')]";*/	
	
	@Before
	public void loginMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		driverOptions = new ChromeOptions();
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		driver.navigate().to("https://gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
	}
	
	@Test
	public void gmailSignup() throws InterruptedException {				
		
		System.out.println("Clicking the 'more options' button, mate!");
		driver.findElement(By.xpath(moreOptnsBtn)).click();
		System.out.println("Clicking the 'create account' button, mate!");
		Thread.sleep(3000);
		driver.findElement(By.xpath(createAccntBtn)).click();
		System.out.println("Entering the first name, mate!");
		Thread.sleep(3000);
		driver.findElement(By.xpath(firstNameTxt)).click();
		driver.findElement(By.xpath(firstNameTxt)).sendKeys("Rohith");
		driver.findElement(By.xpath(lastNameTxt)).click();
		driver.findElement(By.xpath(lastNameTxt)).sendKeys("Nandakumar");
		driver.findElement(By.xpath(chooseIdTxt)).click();
		driver.findElement(By.xpath(chooseIdTxt)).sendKeys("abcxyzrohith");
		driver.findElement(By.xpath(passwdTxt)).click();
		driver.findElement(By.xpath(passwdTxt)).sendKeys("abcdefghijk");
		driver.findElement(By.xpath(passwdTwoTxt)).click();
		driver.findElement(By.xpath(passwdTwoTxt)).sendKeys("abcdefghijk");
		//Select the birthday
		driver.findElement(By.xpath(birthMonthVal)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(selectBirthMnthVal)).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(selectDay)).clear();
		driver.findElement(By.xpath(selectDay)).click();
		selectDayOne = driver.findElement(By.xpath(selectDay));
		actions = new Actions(driver);
		actions.moveToElement(selectDayOne);
		actions.click();
		actions.sendKeys("27");
		actions.build().perform();
		/*driver.findElement(By.xpath(selectDay)).sendKeys("27");
		driver.findElement(By.xpath(selectYear)).click();*/
		driver.findElement(By.xpath(selectYear)).click();
		selectYearOne = driver.findElement(By.xpath(selectYear));
		actionsOne = new Actions(driver);
		actionsOne.moveToElement(selectYearOne);
		actionsOne.click();
		actionsOne.sendKeys("1990");
		actionsOne.build().perform();
		/*driver.findElement(By.xpath(selectYear)).clear();
		driver.findElement(By.xpath(selectYear)).sendKeys("1990");*/
		driver.findElement(By.xpath(genderVal)).click();
		driver.findElement(By.xpath(selectGenderVal)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(phoneNumberVal)).click();
		//driver.findElement(By.xpath(phoneNumberVal)).clear();
		driver.findElement(By.xpath(phoneNumberVal)).sendKeys("9904185524");
		Thread.sleep(3000);
		driver.findElement(By.xpath(recoveryMailTxt)).click();
		//driver.findElement(By.xpath(recoveryMailTxt)).clear();
		driver.findElement(By.xpath(recoveryMailTxt)).sendKeys("abcdaaaa@xyz.com");		
		
	}
	
	@After
	public void closeBrowser() {
		
		System.out.println("Closing the browser, mate!");
		driver.quit();
		
	}

}
