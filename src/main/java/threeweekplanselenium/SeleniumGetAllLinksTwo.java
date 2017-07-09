package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetAllLinksTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//Navigate to the URL
				driver.navigate().to("http://www.google.co.in");
				
				//Maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				WebElement gmail = driver.findElementByLinkText("Gmail");
				
				//Get the Location
				System.out.println(gmail.getLocation());
				
				//Get the Link name
				System.out.println(gmail.getText());
				
				//Get the size
				System.out.println(gmail.getSize());
				
				//Get the attribute
				System.out.println(gmail.getAttribute("href"));
				
				//Get the CSS
				System.out.println(gmail.getCssValue("color"));
				
				//Get the tag name
				System.out.println(gmail.getTagName());
				
				//Get the current URL
				System.out.println(driver.getCurrentUrl());
				

	}

}
