package trainingSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL
		driver.navigate().to("http://google.com");
		
		//Maximize the brower window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the name in the search bar
		driver.findElementByXPath("//*[@id='lst-ib']").clear();
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Rohith Nandakumar");
		
		driver.findElementByClassName("lsb").click();
		
		Thread.sleep(2000);
		
		List<WebElement> mylinks = driver.findElementsByTagName("a");
		
		//Print the number of links in the webpage
		System.out.println("The number of links in the webpage is:" +mylinks.size());
		
		for (WebElement links : mylinks) {
			
			System.out.println(links.isDisplayed());
			
		}
				

	}

}
