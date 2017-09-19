package pagefactoryone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCase_POF {
	
	static WebDriver driver;
	static WebElement userName;
	static WebElement password;
	static WebElement submit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, TestCase_POF.class);
		userName.sendKeys("rohithkumar90@ymail.com");
		password.sendKeys("rohith");
		submit.click();
		driver.quit();
		

	}

}
