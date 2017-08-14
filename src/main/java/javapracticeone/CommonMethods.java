package javapracticeone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public interface CommonMethods {
	
	/** @author - Rohith Nandakumar
	 *  @date - 10/05/2017
	 **/
	
	/* Interface - It has static constants and abstract methods.
	 * It contains only abstract methods.
	 * It does not contain the method body.
	 * It is used to achieve abstraction and multiple inheritance in java.
	 * It cannot be instantiated. 	
	 */
	
	@BeforeSuite
	public void beforeSuite();
	
	@BeforeTest(groups={"group1", "group2"})
	public void beforeTest();
	
	@BeforeClass
	public void beforeClass();
	
	@BeforeMethod
	public void beforeMethod();
	
	@Test
	public void checkPrimeNumber() throws IOException;
	
	@Test
	public void printEvenNumber() throws IOException;
	
	@Test
	public void usingLoops() throws InterruptedException, IOException;
	
	@Test
	public void usingDropDown() throws IOException, InterruptedException;
	
	@Test
	public void fibonacciSeries() throws IOException;
	
	@Test
	public void useTwitterUsingObjectRepo() throws IOException, FileNotFoundException, InterruptedException;
	
	@Test
	public void getAllLinks() throws StaleElementReferenceException, IOException;
	
	@Test
	public void printLinks() throws InterruptedException, IOException;
	
	@Test
	public void countDropdown() throws IOException;
	
	@Test
	public void printAllLinks() throws InterruptedException, IOException;
	
	@Test
	public void useAllMethods() throws IOException;
	
	@Test
	public void handlingAlerts() throws InterruptedException, IOException;
	
	@Test
	public void handlingFrame() throws IOException;
	
	@Test
	public void handlingPrompts() throws InterruptedException, NoSuchElementException, IOException;
	
	@Test
	public void handlingWindows() throws InterruptedException, IOException;
	
	@Test
	public void countFrames() throws InterruptedException, IOException;
	
	@Test
	public void readContent() throws InterruptedException, IOException;
	
	@Test
	public void starPattern() throws IOException;
	
	@Test
	public void usingWrapperMethods() throws InterruptedException, IOException;
	
	@Test
	public void dataUsingDataProvider(String man, String woman) throws IOException;
	
	@DataProvider
	public Object[][] useData();
	
	@AfterMethod
	public void afterMethod();
	
	@AfterClass
	public void afterClass();
	
	@AfterTest(groups={"group1", "group2"})
	public void afterTest();
	
	@AfterSuite
	public void afterSuite() throws IOException;	
	
}
