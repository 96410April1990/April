package trainingSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberOfDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Selenium script to get the number of drop down fields in a webpage
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get the list of the drop down fields in the webpage
		List dropdown = driver.findElementsByTagName("select");
		
		//Print the number of drop down fields in the webpage
		System.out.println("The number of drop down fields in the webpage is:" +dropdown.size());
		
		
	}

}
