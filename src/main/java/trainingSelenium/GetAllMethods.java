package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.gmail.com");
		
		//Maximize the browser and apply timeout
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement gmail = driver.findElementByLinkText("Sign in to continue to Gmail");
		
		//Get the location
		System.out.println(gmail.getLocation());
		
		//Get the name of the link
		System.out.println(gmail.getText());
		
		//Get the size
		System.out.println(gmail.getSize());
		
		//Get the attribute
		System.out.println(gmail.getAttribute("href"));
		
		//Get the CSS
		System.out.println(gmail.getCssValue("color"));
		
		//Get the tagnames
		System.out.println(gmail.getTagName());
		
		//Get the current URL
		System.out.println(driver.getCurrentUrl());
		

	}

}
