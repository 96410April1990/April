package testngpractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGChapterOne {
	
	@BeforeTest(groups="work")
	public void swipeIn() {
		System.out.println("Rohith swipes in at 9.30 AM in the morning!");
	}
	
	@AfterTest(groups="work")
	public void swipeOut() {
		System.out.println("Rohith swipes out at 7.00 PM in the evening");
	}

}
