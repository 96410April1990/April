package testngpractice;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestNGChapterTwo extends SeleniumTestNGChapterOne {

	
	@Test(expectedExceptions={NoSuchElementException.class})
	public void primaryTask() throws Exception {
		System.out.println("Rohith retests the defects!");
		throw new NoSuchElementException();
	}
	
	@Test()
	public void secondaryTask() {
		System.out.println("Rohith executes the test cases!");
		return;
	}
	
	@Test()
	public void statusMail() {
		System.out.println("Rohith sends the status mail!");
		return;
	}
	
	@BeforeClass
	public void meeting() {
		System.out.println("Rohith attends the stand up meeting every morning!");
	}
	
	@BeforeMethod
	public void tasks() {
		System.out.println("Rohith delegates tasks to team members!");
	}
	
	@AfterMethod
	public void status() {
		System.out.println("Rohith gets an update on the tasks from the team members!");
	}
	
	@AfterClass
	public void eveningMeeting() {
		System.out.println("Rohith attends the status meeting in the evening!");
	}
		
	
}
