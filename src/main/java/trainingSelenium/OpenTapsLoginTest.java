package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenTapsLoginTest {

	private WebDriver driver;
	private String baseurl;
	
	@Before
	public void openWebSite() throws Exception {
		driver = new FirefoxDriver();
		baseurl = "http://demo1.opentaps.org/opentaps/control/main";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Browser launched successfully, mate!");
	}

	@Test
	public void loginCredentials() throws Exception {
		driver.navigate().to(baseurl);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("User logged in successfully, mate!");
	}
	
	@After
	public void logOutAndQuit() throws Exception {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.quit();
		System.out.println("User logged out successfully and closed the browser, mate!");
		
	}
	
}
