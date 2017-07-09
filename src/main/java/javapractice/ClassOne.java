package javapractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("Hi, I am in before suite!");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Hi, I am in before test!");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Hi, I am in before class!");
		
	}
	
	@BeforeMethod	
	public void beforeMethod() {
		
		System.out.println("Hi, I am in before method!");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		
		System.out.println("Hi, I am in after method!");
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("Hi, I am in after class!");
		
	}
	
	@AfterTest
	public void AfterTest() {
		
		System.out.println("Hi, I am in after test!");
		
	}
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("Hi, I am in after suite!");
		
	}
	
	
}
