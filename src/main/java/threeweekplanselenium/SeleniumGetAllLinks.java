package threeweekplanselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class SeleniumGetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.co.in");
		driver.manage().window().maximize();
		System.out.println("Browser launched and maximized");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter a keyword in the search tab.
		driver.findElementByXPath("//*[@id='lst-ib']").click();
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Rohith");
		driver.findElementByXPath("/html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/button").click();
		
		//Get all links using the Tag name and store it in list
		List<WebElement> getAllLinks = driver.findElementsByTagName("a");
		
		//Print the number of links in the web page
		System.out.println("The number of links in the web page is:" +getAllLinks.size());
		
		for (WebElement allLinks : getAllLinks) {
			
			System.out.println(allLinks.isDisplayed());
			System.out.println(allLinks.getText());
			
			if(allLinks.getText().contains("a") || allLinks.getText().contains("A")) {
				
				System.out.println("SUCCESS");
				System.out.println("\n"+allLinks.getSize());
								
			}
						
		}
		
		
	}

}
