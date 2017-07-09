package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNGChapterThree {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	//Create a lead
	@BeforeClass
	public void launchBrowser() {
		
		driver.manage().window().maximize();
		driver.navigate().to("http://demo1.opentaps.org");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
						
	}
	
	

}
