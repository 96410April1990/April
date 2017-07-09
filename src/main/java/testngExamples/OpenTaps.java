package testngExamples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class OpenTaps extends TestNgAnnotations {
	
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
	
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println("Browser launched successfully, mate!");

	}
	
	@BeforeMethod
	public void navigateWebPage(){
		
		driver.get("http://demo1.opentaps.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the login ID and password
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
	
		//Click CRM/SFA
		driver.findElement(By.xpath("//*[@id='label']/a")).click();
		
	}

}
