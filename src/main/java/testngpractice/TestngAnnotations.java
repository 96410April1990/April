package testngpractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/* Annotations in TestNG
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite 
 */

public class TestngAnnotations {

	@BeforeSuite
	public void testngone() {
		System.out.println("I am in @BeforeSuite!");
	}
	
	@BeforeTest
	public void testngtwo() {
		System.out.println("I am in @BeforeTest!");		
	}	
	
}
