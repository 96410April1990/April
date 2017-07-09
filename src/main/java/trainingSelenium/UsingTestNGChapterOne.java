/* TestNG - TestNextGeneration
 * 
 * Annotations in TestNG
 * 
 * @BeforeSuite - initialize WebDriver - shall be executed only once.
 * @BeforeTest - connecting to a DB - invoked before a test tag.
 * @BeforeClass  
 * @BeforeMethod - opening a browser under test - invoked before each method within @test method.
 * @Test - test case in Selenium code.
 * @AfterMethod - closing the browser opened.
 * @AfterClass  
 * @AfterTest - closing the DB.
 * @AfterSuite - shutdown the WebDriver.
 *
 * Attributes in TestNG
 * 
 * Groups - groups the methods belong to
 * Parameters - parameters that will be passed to the test method as they are found in testng.xml
 * dependsOnGroups - The list of groups the methods depend on. 
 * TimeOut - How long TestNG should wait before declaring your test method has failed.
 *
 */

package trainingSelenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class UsingTestNGChapterOne {
	
	@BeforeSuite
	public void wakeupAndBrush(){
		
		System.out.println("Rohith wakes up and brushes his teeth!");
		
	}
	
	@BeforeTest
	public void openAndSignin() {
		
		System.out.println("Rohith opens and punches in!");
		
	}
	
	@AfterTest
	public void signoutAndClose() {
		
		System.out.println("Rohith punches out and closes!");
		
	}
	
	@AfterSuite
	public void refreshAndSleep() {
		
		System.out.println("Rohith refreshes and sleeps!");
		
	}

}
