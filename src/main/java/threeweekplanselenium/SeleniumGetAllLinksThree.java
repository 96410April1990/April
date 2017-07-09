package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetAllLinksThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the URL
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement yahoo = driver.findElementByLinkText("Yahoo");
		
		//Get the text
		System.out.println(yahoo.getText());
		
		//Get the location
		System.out.println(yahoo.getLocation());
		
		//Get the size
		System.out.println(yahoo.getSize());
		
		//Get the attribute
		System.out.println(yahoo.getAttribute("href"));
		
		//Get the CSS
		System.out.println(yahoo.getCssValue("color"));
		
		//Get the tag name
		System.out.println(yahoo.getTagName());
		
		//Get the current URL
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
