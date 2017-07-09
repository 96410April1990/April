package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGetAllLinksOne {

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
		
		//Enter your name in the search bar and click the search button
		/*driver.findElementByXPath("//*[@id='lst-ib']").click();
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Rohith Nandakumar");
		driver.findElementByXPath("//*[@id='sblsbb']/button").click();*/
		
		for (WebElement link : driver.findElementsByTagName("a")) {
			
			System.out.println(link.getText());
			
		}	

	}

}
