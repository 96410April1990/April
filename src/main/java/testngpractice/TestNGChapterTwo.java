package testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGChapterTwo extends TestNGChapterOne {

	@BeforeClass
	public void checkMails() {
		System.out.println("Rohith checks the mails!");
	}
	
	@BeforeMethod
	public void delegateTask() {
		System.out.println("Rohith delegates tasks to team members!");
	}
	
	@Test(dataProvider="count")
	public void testExecution(String retest, int execute) {
		System.out.println("Rohith retests the "+retest+" defects everyday and executes around "+execute+" a day!");
	}
	
	@Test(dependsOnMethods="testExecution")
	public void blockerCall() {
		System.out.println("Rohith attends the blocker call!");
	}
	
	@AfterMethod
	public void standUpMeeting() {
		System.out.println("Rohith attends the stand up meeting!");
	}
	
	@AfterClass
	public void statusMail() {
		System.out.println("Rohith sends the status mail!");
	}
	
	@DataProvider(name="count")
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		data[0][0] = "defects";
		data[0][1] = 20;
		
		return data;
				
	}
	
	
}
