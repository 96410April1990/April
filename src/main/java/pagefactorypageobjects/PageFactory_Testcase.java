package pagefactorypageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_Testcase {
	
	static WebDriver driver;
	static ChromeOptions driverOptions;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		driverOptions = new ChromeOptions();
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		driver.navigate().to("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		TwitterLoginPage LoginPg = PageFactory.initElements(driver, TwitterLoginPage.class);
		TwitterLogoutPage LogoutPg = PageFactory.initElements(driver, TwitterLogoutPage.class);
		
		LoginPg.login_Btn_One.click();
		LoginPg.login_userId.sendKeys("rohithkumar90@ymail.com");
		LoginPg.login_password.sendKeys("rohith");
		LoginPg.login_Btn_Two.click();
		Thread.sleep(3000);
		LogoutPg.logout_Btn_One.click();
		LogoutPg.logout_Btn_Two.click();
		driver.quit();
	}

}
