package testngpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SeleniumTestNGChapterOne {
	
	@BeforeSuite
	public void wakeUp() {
		System.out.println("Rohith gets up at 6 AM!");
	}
	
	@BeforeTest
	public void swipeIn() {
		System.out.println("Rohith reaches office at 9 AM and punches in!");
	}
	
	@AfterTest
	public void swipeOut() {
		System.out.println("Rohith punches out and reaches home at 8 PM!");
	}
	
	@AfterSuite()
	public void sleep() {
		System.out.println("Rohith goes to bed at 10 PM!");
	}

}
