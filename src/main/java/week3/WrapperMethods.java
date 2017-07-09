package week3;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WrapperMethods {
	
	
	RemoteWebDriver driver;
	int snapcount = 1;
	
	public void takeScreenshot() {
		
		try{
			File snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\April\\src\\main\\java\\week3\\images"+snapcount,".jpeg"));
			snapcount++;
		}
		catch(Exception e){
			System.out.println("Count not take the screenshot, mate !!");
		}
	
	}

	public void launchBrowser(String browsername, String url) {
		// TODO Auto-generated method stub
		
			try{
				if(browsername.equalsIgnoreCase("firefox")){
					
				driver = new FirefoxDriver();
				}
				else {
				browsername.equalsIgnoreCase("chrome");
				System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe");
				
				driver = new ChromeDriver();
				}
			
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			catch(WebDriverException e){
				System.out.println("Could not launch the browser, mate !!");
			}
			finally{
				takeScreenshot();
			}
			
	}

	public void enterCredentials(String id, String value){
		
			try{
				driver.findElementById(id).click();
				driver.findElementById(id).clear();
				driver.findElementById(id).sendKeys(value);
			}
			catch(NoSuchElementException e) {
				System.out.println("Unable to find the element, mate !!");
			}
			finally{
				takeScreenshot();
			}
				
	}
	
	public void loggingIn(String classname){
		
		try{
			driver.findElementByClassName(classname).click();
		}
		catch(NoSuchElementException e){
			System.out.println("There is no such element, mate !!");
		}
	}
	
	public void logOut(String logout){
		
		try{
			driver.findElementByClassName(logout).click();
		}
		catch(NoSuchElementException e){
			System.out.println("Unable to find the element, mate !!");
		}
		finally{
			takeScreenshot();
		}
	}

}

	



