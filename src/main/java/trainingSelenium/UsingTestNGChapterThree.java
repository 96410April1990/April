package trainingSelenium;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class UsingTestNGChapterThree {

	@BeforeSuite
	public void firstMethod() {
		
		System.out.println("I am in before suite!");
		
	}
	
	@BeforeTest
	public void secondMethod() {
		
		System.out.println("I am in before test!");
		
	}
	
}
