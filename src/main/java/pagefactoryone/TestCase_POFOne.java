package pagefactoryone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase_POFOne {
	
	static WebDriver driver;
	static ChromeOptions driverOptions;
	@FindBy(how=How.XPATH, using="//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
	static WebElement login_Btn;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")
	static WebElement userName;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")
	static WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
	static WebElement submit;
	@FindBy(how=How.XPATH, using="//*[@id='user-dropdown-toggle']")
	static WebElement logout_Btn;
	@FindBy(how=How.XPATH, using="//*[@id='signout-button']/button")
	static WebElement logout_Btn_One;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//NANDAKUMARSIR//April//src//main//java//chromedriver.exe");
		// TODO Auto-generated method stub
		driverOptions = new ChromeOptions();
		driverOptions.addArguments("disable-extensions");
		driverOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(driverOptions);
		//driver.manage().window().maximize();
		driver.navigate().to("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, TestCase_POFOne.class);
		System.out.println("Going to log into the application!");
		login_Btn.click();
		userName.sendKeys("rohithkumar90@ymail.com");
		password.sendKeys("rohith");
		submit.click();
		Thread.sleep(3000);
		logout_Btn.click();
		System.out.println("Going to log out of the application!");
		logout_Btn_One.click();
		driver.quit();
	}

}
