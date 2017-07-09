package testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

	public class OpenTapsTest extends TestNgAnnotations {
		
		public FirefoxDriver driver;
		//private String baseurl;
		
		@BeforeClass
		public void launchBrowser() {
		
			System.out.println("Going to launch the browser, mate!");
			
		}
		
		@BeforeMethod
		public void navigateWebPage(){
			
			//System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://demo1.opentaps.org/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Enter the login ID and password
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		
			//Click the Login button
			driver.findElement(By.className("decorativeSubmit")).click();
		
			//Click CRM/SFA
			driver.findElement(By.xpath("//*[@id='label']/a")).click();
			
		}
		
		@Test(priority=1, invocationCount=1, threadPoolSize=2, description="Create a Lead")
		public void createLead() throws Exception {
			
			navigateWebPage();
			
			Thread.sleep(2000);
			
			//Click Leads Tab
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
			
			Thread.sleep(2000);
			
			//Click Create Leads Tab
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
			
			//Enter the mandatory fields
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xabcyz");
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rohith");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nandakumar");
			
			//Click the Submit button
			driver.findElement(By.className("smallSubmit")).click();
			
		}
		
		@Test(enabled=false, description="Find the lead")
		public void findLead() {
			
			navigateWebPage();
			
			//Click Leads Tab
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			
			//Click Find Leads Tab
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
			
			//Search by the first name and last name
			driver.findElement(By.name("firstName")).click();
			driver.findElement(By.name("lastName")).click();
			
			//Click the Find Leads button
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			
		}
		
		@Test(priority=2, dependsOnMethods="createLead", timeOut=100000, description="Create a contact")
		public void createContact() {
			
			navigateWebPage();
			
			//Click the contacts tab
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			
			//Create a contact
			driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
			
			//Enter the first name and Last name
			driver.findElement(By.id("firstNameField")).clear();
			driver.findElement(By.id("firstNameField")).sendKeys("kumarabc");
			
			driver.findElement(By.id("lastNameField")).clear();
			driver.findElement(By.id("lastNameField")).sendKeys("Rohith");
			
			//Click the Create contact button
			driver.findElement(By.name("submitButton")).click();
			
		}

		@AfterMethod(enabled=false)
		public void signOut() {
			
			//Click the sign out
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		}
		
		
		//@AfterClass(alwaysRun=true)
		//public void closeBrowser() {
			
			//driver.quit();
			//driver.close();
	//}
		
	}
