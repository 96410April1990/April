/*Selenium code to close all the frames in the below given link

http://layout.jquery-dev.com/demos/iframe_local.html
*/

package trainingSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAllFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*//Enter into the frame in the center and print the number of frames within the frame
		List<WebElement> closeFrame = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within the central frame is:" +closeFrame.size());
		
		//Click the close button on the left side of the central frame
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		//Click the close button on the right side of the central frame
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		//Come out of the frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);*/
		
		//Click the close button on the left side of the window
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		
		//Click the close button on the right side of the window
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		
		
		
	}

}
