/*Frames - allows developers to present page in multiple views
 *IFrame - Inline Frame or IFrame is a HTML document embedded inside another HTML document in a 
 *website
 * -- Frame is just another webelement
 * -- Frames can be located using the tagnames - frame or iframe
 * Syntax -- driver.switchTo(frame)
 * 
 * ways to locate a frame
 * 
 * -- driver.switchTo().frame(name or id)
 * -- driver.switchTo().frame(index) -- example: driver.switchTo.frame(0) -- least preferred
 * -- driver.switchTo().frame(frame_element) 
 * 
 * -- Sample code --
 * -- driver.switchTo().defaultContent() - to go back to the first frame or the main page
 * 
 * -- driver.switchTo().frame(driver.findElement(By.className("demo_frame"))); 
 */

package trainingSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Use the tagname to store all the frames in the website in the list class 
		List<WebElement> countFrames = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames in the webpage is:" +countFrames.size());
		
		//Move to frame one and print the number of frames in it
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		List<WebElement> countFramesOne = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within frame1 is:" +countFramesOne.size());
		
		int i = countFramesOne.size();
		
		if(i>0) {
			
			System.out.println("There are frames within this frame");
			//driver.switchTo().frame("/html/body/div[1]/iframe");
			
		}
		else {
			
			driver.switchTo().defaultContent();
			System.out.println("Switched back to the main page");
			
		}
		
		Thread.sleep(2000);
		
		//Move to frame two and print the number of frames in it
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[1]/iframe"));
		List<WebElement> countFramesTwo = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within frame2 is:" +countFramesTwo.size());
		
		int j = countFramesTwo.size();
		
		if(j>0) {
			
			System.out.println("There are frames within this frame");
			
		}
		else {
			
			driver.switchTo().defaultContent();
			System.out.println("Switched back to the main page");
			
		}
		
		Thread.sleep(2000);
		
		//Move to frame three and print the number of frames in it
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[2]/iframe"));
		List<WebElement> countFramesThree = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within frame3 is:" +countFramesThree.size());
		
		int k = countFramesThree.size();
		
		if(k>0) {
			
			System.out.println("There are frames within this frame");
			
		}
		else {
			
			driver.switchTo().defaultContent();
			System.out.println("Switched back to the main page");
			
		}
		
		Thread.sleep(2000);
		
		//Move to frame four and print the number of frames in it
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[3]"));
		List<WebElement> countFramesFour = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within frame4 is:" +countFramesFour.size());
		
		int l = countFramesFour.size();
		
		if(l>0) {
			
			System.out.println("There are frames within this frame");
			
		}
		else {
			
			driver.switchTo().defaultContent();
			System.out.println("Switched back to the main page");
			
		}

		Thread.sleep(2000);
		
		//Move to frame one and print the number of frames in it
		//driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		//List<WebElement> countFrames1 = driver.findElementsByTagName("iframe");
		
		//Move to frame five and print the number of frames in it
		//driver.switchTo().frame(driver.findElementByXPath("//*[@id='footerWrapper']/iframe"));
		//List<WebElement> countFramesFive = driver.findElementsByTagName("iframe");
		//System.out.println("The number of frames within frame5 is:" +countFramesFive.size());
		
		//int m = countFramesFive.size();
		
		//if(m>0) {
			
			//System.out.println("There are frames within this frame");
			
		//}
		//else {
			
			//driver.switchTo().defaultContent();
			//System.out.println("Switched back to the main page");
			
		//}
		
		//Move to frame one and print the number of frames in it
		//driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		//List<WebElement> countFrames2 = driver.findElementsByTagName("iframe");
		
		//Move to frame six and print the number of frames in it
		/*driver.switchTo().frame(driver.findElementByXPath("//*[@id='_atssh992']"));
		List<WebElement> countFramesSix = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames within frame6 is:" +countFramesSix.size());
		
		int n = countFramesSix.size();
		
		if(n>0) {
			
			System.out.println("There are frames within this frame");
			
		}
		else {
			
			driver.switchTo().defaultContent();
			System.out.println("Switched back to the main page");
			
		}*/
		

	}

}
