package trainingSelenium;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearningWrappers {

	RemoteWebDriver driver;
	int snapcount = 5;

	public void getScreenshot() {

		try {

			File snapshot = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snapshot,
					new File("C:\\April\\src\\main\\java\\snapshots\\images" + snapcount, ".jpeg"));
			snapcount++;

		} catch (Exception e) {

			System.out.println("Sorry mate! Unable to take the screenshot!");

		}

	}

	public void launchBrowser(String browsername, String url) {

		try {

			if (browsername.equalsIgnoreCase("firefox")) {

				driver = new FirefoxDriver();
				driver.navigate().to(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			} else {

				browsername.equalsIgnoreCase("chrome");
				System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe");
				driver = new ChromeDriver();

			}

		}

		catch (WebDriverException e) {

			System.out.println("Sorry mate! There's an issue with the browser!");

		}

		finally {

			getScreenshot();

		}

	}
	
	public void enterValue(String name, String value, String nameone) {
		
		try {
			
			driver.findElementByXPath(name).click();
			driver.findElementByXPath(name).sendKeys(value);
			driver.findElementByName(nameone).click();
		
		}
		
		catch(NoSuchElementException e) {
			
			System.out.println("Sorry mate! Unable to find the elements!");
			
		}
		
		finally {
			
			getScreenshot();
			
		}
		
	}

}
