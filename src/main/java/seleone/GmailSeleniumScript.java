package seleone;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmailSeleniumScript {
	
	static WebDriver driver;
	static ChromeOptions driverOptions;
	public static String moreOptnsBtn = "//div[starts-with(@id,'ow176')]";
	
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
	public void gmailSignup() {
		
		System.out.println("Clicking the 'more options' button, mate!");
		driver.findElement(By.xpath(moreOptnsBtn)).click();
		
		
	}
	

}
