package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//Maximize the browser window and apply timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get all the links and display
		
		for (WebElement link : driver.findElementsByTagName("a")) {
			
			System.out.println(link.getText());
			
		}
		
	}

}
