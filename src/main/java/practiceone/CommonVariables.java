package practiceone;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CommonVariables {
	
	public String PASS = "0";
	public String FAIL = "1";
	public String WARNING = "2";
	
	@BeforeSuite
	public void before_suite_test() {		
		System.out.println("Hi, i am in @BeforeSuite!");		
	}
	
	@BeforeTest
	public void before_test() {
		System.out.println("Hi, i am in @BeforeTest!");		
	}
	
	@BeforeClass
	public void before_class() {
		System.out.println("Hi, i am in @BeforeClass!");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("Hi, i am in @BeforeMethod!");
	}

	@AfterMethod
	public void after_method() {
		System.out.println("Hi, i am in @AfterMethod!");
	}
	
	@AfterClass
	public void after_class() {
		System.out.println("Hi, i am in @AfterClass!");
	}
	
	@AfterTest
	public void after_test() {
		System.out.println("Hi, i am in @AfterTest!");
	}
	
	@AfterSuite
	public void after_suite() {
		System.out.println("Hi, i am in @AfterSuite!");
	}	
	
}
