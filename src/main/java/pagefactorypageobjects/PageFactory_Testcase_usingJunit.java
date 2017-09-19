package pagefactorypageobjects;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;

public class PageFactory_Testcase_usingJunit {
	
	static WebDriver driver;
	static ChromeOptions driverOptions;
	TwitterLoginPage loginPg;
	TwitterLogoutPage logoutPg;
	
	@Before
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		driverOptions = new ChromeOptions();
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		driver.navigate().to("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPg = PageFactory.initElements(driver, TwitterLoginPage.class);
		logoutPg = PageFactory.initElements(driver, TwitterLogoutPage.class);
		
	}
	
	@Test
	public void TwitterLogin() throws InterruptedException {
		
		System.out.println("Logging into the application, mate!");
		loginPg.login_Btn_One.click();
		loginPg.login_userId.sendKeys("rohithkumar90@ymail.com");
		loginPg.login_password.sendKeys("rohith");
		loginPg.login_Btn_Two.click();
		Thread.sleep(3000);
		System.out.println("logging out of the application, mate!");
		logoutPg.logout_Btn_One.click();
		logoutPg.logout_Btn_Two.click();
		
		
	}
	
	@After
	public void afterMethod() {
		
		driver.quit();
		
	}

}
