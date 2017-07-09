package practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/* Annotations in TestNG
 * 
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite 
 */

public class TestNGScriptOne {
	
	FirefoxDriver driver;
	
	@BeforeSuite
	public void methodOne() {
		
		System.out.println("Hi Rohith, Good Morning!");
		
	}
	
	@BeforeTest
	public void methodTwo() {
		
		System.out.println("We are gonna execute a series of tests now!");
		
	}
	
	@BeforeClass
	public void methodThree() {
		
		System.out.println("Get ready, mate!");
		
	}
	
	@BeforeMethod
	public void methodFour() {
		
		try {
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	@AfterMethod
	public void methodFive() {
		
		driver.close();
		
	}
	
	@AfterClass
	public void methodSix() {
		
		System.out.println("Browser closed!");
		
	}
	
	@AfterTest
	public void methodSeven() {
		
		System.out.println("Test case successfully executed!");
		
	}
	
	@AfterSuite
	public void methodEight() {
		
		System.out.println("That's it, Rohith!");
		
	}
	

}
