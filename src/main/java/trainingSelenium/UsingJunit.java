package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingJunit {
	
	private WebDriver driver;
	private String baseurl;
	
	@After
	public void logOut() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Log out successful");
		driver.quit();
			
	}
	
	@Before
	public void launchBrowser() throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		baseurl = "http://demo1.opentaps.org/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Launched the browser!");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void openWebPage() throws InterruptedException {
		
		driver.get(baseurl);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		System.out.println("Log in successful!");
	
	}

	
}
