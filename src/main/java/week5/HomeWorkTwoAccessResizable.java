package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkTwoAccessResizable {

	public static void main(String[] args) {
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
				
		//Navigate to the URL and maximize the window
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Click Resizable in the homepage
		driver.findElementByLinkText("Resizable").click();
				
		//Switch to the frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//Click Resizable, hold, drag and resize it
		WebElement resize = driver.findElementByXPath("//*[@id='resizable']/div[3]");
		
		System.out.println("The location of the resizable is:" +resize.getLocation());
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(resize).moveByOffset(200, 200).release().perform();
		
		
		
						
		
	}

}
