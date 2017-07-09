package threeweekplanselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScriptTwo {
	
	private WebDriver driver;
	private String baseurl;
	
	@Before
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "http://demo1.opentaps.org";
		driver.manage().window().maximize();
		System.out.println("Browser launched and maximized successfully!");
						
	}
	
	@Test
	public void login() throws InterruptedException {
		
		driver.navigate().to(baseurl);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		System.out.println("Log in successful!");
		
	}
	
	/*@Override
	public void printMessage() {
		
		System.out.println("Hey! Is your name Homework? Cos I am not doing you, but i should be");
		
	}*/
	
	@After
	public void logoutAndClose() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Log out successful!");
		driver.quit();
		System.out.println("Closed the browser");
		
	}
	
}
