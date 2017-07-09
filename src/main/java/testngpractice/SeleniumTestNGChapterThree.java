package testngpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SeleniumTestNGChapterThree {

	@BeforeSuite
	public void wakeUp() {
		System.out.println("Rohith gets up at 9 AM!");
	}
	
	@BeforeTest
	public void brushAndPaper() {
		System.out.println("Rohith brushes teeth and reads the newspaper!");
	}
	
	@AfterTest
	public void dinner() {
		System.out.println("Rohith has his dinner at 9 PM!");
	}
	
	@AfterSuite()
	public void sleep() {
		System.out.println("Rohith goes to bed at 10 PM!");
	}

}
