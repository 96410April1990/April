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

public class WrapperGoogle {

	RemoteWebDriver driver;
	int snapcount = 5;
	
	public void takeScreenShot() {
		// TODO Auto-generated method stub
		
		try{
			File snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\April\\src\\main\\java\\week3\\images"+snapcount,".jpeg"));
			snapcount++;
		}
		catch(Exception e){
			System.out.println("I am extremely sorry mate, i just could not take the screenshot !");
		}

	}
		
	public void browserLaunch(String browsername, String url) {
		
		try{
			if(browsername.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}
			else{
				browsername.equalsIgnoreCase("chrome");
				System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
				//Get the URL
				driver.get(url);
				
				//Maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			}
		}
		catch(WebDriverException e){
			System.out.println("I am extremely sorry mate, i am unable to launch the browser !");
		}
		finally{
			takeScreenShot();
		}
		
	}
	
	public void enterSomething(String enter, String value){
		
		try{
			driver.findElementById(enter).click();
			driver.findElementById(enter).clear();
			driver.findElementById(enter).sendKeys(value);
		}
		catch(NoSuchElementException e){
			System.out.println("I am extremely sorry mate, i am unable to locate the element !");
		}
		finally{
			takeScreenShot();
		}
	}
	
	public void clickSearch(String results){
	
		try{
			driver.findElementByName(results).click();
		}
		catch(NoSuchElementException e){
			System.out.println("I am extremely sorry mate, i am unable to locate the element !");
		}
		finally{
			takeScreenShot();
		}
	}

	public void closeBrowser(String browsername){
		
		try{
			if(browsername.equalsIgnoreCase("firefox")){
				
				driver.close();
			}
			else
			{
				browsername.equalsIgnoreCase("chrome");
				driver.close();
			}
		}
		catch(WebDriverException e){
			System.out.println("Sorry mate, I could not close the browser !");
		}
	
	}

}