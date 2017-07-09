package testngpractice;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestNGChapterFour extends SeleniumTestNGChapterThree {
	
	@Test(expectedExceptions={NoSuchElementException.class})
	public void cleanHome() throws Exception {
		System.out.println("Rohith cleans his home!");
		throw new NoSuchElementException();
	}
	
	@Test()
	public void readNovel() {
		System.out.println("Rohith reads novels!");
		return;
	}
	
	@Test()
	public void listenMusic() {
		System.out.println("Rohith listens to music!");
		return;
	}
	
	@BeforeClass
	public void watchTv() {
		System.out.println("Rohith watches tv!");
	}
	
	@BeforeMethod
	public void talkToFriend() {
		System.out.println("Rohith talks to his friends!");
	}
	
	@AfterMethod
	public void useComputer() {
		System.out.println("Rohith uses his computer!");
	}
	
	@AfterClass
	public void learnSelenium() {
		System.out.println("Rohith executes selenium scripts!");
	}
	
	
	

}
