package week3;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wrapperone {
	
	RemoteWebDriver driver;
	int snapcount = 1;
	
	public void takesnapshot() {
				
		try {
			File snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("./image/login_"+snapcount,".jpeg"));
			snapcount++;
		} catch (Exception e) {
			System.out.println("Couldnt take a screenshot");
		}
		
		
	}

	public void launchbrowser(String browsername, String Url) {
		try {
			if (browsername.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				browsername.equalsIgnoreCase("chrome");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			}
				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(Url);
		} catch (WebDriverException e) {
			System.out.println("broswer is not launchng");
		}finally {
			takesnapshot();
		}
	}
		
	public void clickbyclassname(String classname){
	try {
		
			driver.findElementByClassName(classname).click();
		
	} catch (NoSuchElementException e) {
		System.out.println("couldnt find the element");
		// TODO Auto-generated catch block
		
	}}
	
	
	
		public void entertextbyid(String id, String value) {
		try {
			
				driver.findElementById(id).clear();
				driver.findElementById(id).sendKeys(value);
						
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("cant find the given element");
		}finally {
			takesnapshot();
				}
				
		

	}

}
