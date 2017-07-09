package threeweekplanselenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNGOne {
	
	@BeforeSuite
	public void wishes() {
		System.out.println("Hi, Good Morning!");				
	}
	
	@BeforeTest
	public void name() {
		System.out.println("My name is Rohith!");				
	}
	
	@BeforeClass
	public void age() {
		System.out.println("I am 26 years old!");				
	}
	
	@BeforeMethod
	public void qualification() {
		System.out.println("I am an engineer!");		
	}
	
	@Test(enabled=true, dependsOnMethods={"salary"}, description="job", priority=3, invocationCount=2, timeOut=10000, expectedExceptions={NoSuchElementException.class, WebDriverException.class})
	public void profession() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("I am a software engineer!");
		throw new NoSuchElementException("I am not a software engineer!");
	}
	
	@Test(priority=1, alwaysRun=true, threadPoolSize=2, invocationCount=2)
	public void company() {
		System.out.println("I work at Cognizant!");		
	}
	
	@Test(priority=2, dependsOnMethods={"company"})
	public void salary() {
		System.out.println("I earn around 50,000 rupees a month!");		
	}
	
	@Test
	public void role() {
		System.out.println("I am a SDET!");		
	}
	
	@AfterMethod
	public void timings() {
		System.out.println("I come in at 9.30 AM and leave at 7.30 PM!");		
	}
	
	@AfterClass
	public void activities() {
		System.out.println("I hit the gym, read books!");		
	}
	
	@AfterTest
	public void food() {
		System.out.println("I eat my dinner at 9.00 PM!");		
	}
	
	@AfterSuite
	public void sleep() {
		System.out.println("I go to bed at 10.00 PM!");
	}
	
}
