package trainingSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsingTestNGChapterTwo extends UsingTestNGChapterOne {

	@Test
	public void goToOffice() {
		
		System.out.println("Rohith goes to office!");
		
	}
	
	@AfterMethod
	public void comeBackHome() {
		
		System.out.println("Rohith comes back home from office!");
		
	}
	
	@BeforeClass
	public void getReady() {
		
		System.out.println("Rohith gets ready to work!");
		
	}
	
	@BeforeMethod
	public void batheAndEat() {
		
		System.out.println("Rohith bathes and eats his breakfast!");
		
	}
	
	@AfterClass
	public void startFromOffice() {
		
		System.out.println("Rohith starts from office!");
		
	}
	
}
