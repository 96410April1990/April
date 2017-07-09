package week2;

import java.util.concurrent.TimeUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingFrames {

	public static void main(String args[]) {
		
		int totalFrames;
		
		//Declare the path to chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );
		
		//Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to the URL
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Use Tagname to identify all the iframes and store it in a variable using the List class
		List<WebElement> identifyFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("The number of iframes in the website are:" + identifyFrames.size());
		
		//Move to frame 1 and look for frames within frame 1
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		
		//Get the number of frames within frame 1 and store it in a variable using the List class
		List<WebElement> identifyFramesOne = driver.findElements(By.tagName("iframe"));
		System.out.println("The number of iframes within frame 1 is:" + identifyFramesOne.size());
		
		//Switch back to main page
		driver.switchTo().defaultContent();
		
		//Switch to frame 2
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[2]"));
		List<WebElement> identifyFramesTwo = driver.findElements(By.tagName("iframe"));
		System.out.println("The number of iframes within frame 2 is:" + identifyFramesTwo.size());
		
		//Switch back to main page
		driver.switchTo().defaultContent();
		
		//Switch to frame 3
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[3]"));
		List<WebElement> identifyFramesThree = driver.findElements(By.tagName("iframe"));
		System.out.println("The number of iframes within frame 3 is:" + identifyFramesThree.size());
		
		//Switch back to the main page
		driver.switchTo().defaultContent();
		
		//Switch to frame 4
		//driver.switchTo().frame(driver.findElementByXPath("//*[@id='footerWrapper']/iframe"));
		//List<WebElement> identifyFramesFour = driver.findElements(By.tagName("iframe"));
		//System.out.println("The number of iframes within frame 4 is:" + identifyFramesFour.size());
		
		//Switch back to the main page
		//driver.switchTo().defaultContent();
		
		//Switch to frame 5
		//driver.switchTo().frame(driver.findElementByXPath("//*[@id='_atssh766']"));
		//List<WebElement> identifyFramesFive = driver.findElements(By.tagName("iframe"));
		//System.out.println("The number of iframes within frame 5 is:" + identifyFramesFive.size());
				
		//Switch back to the main page
		//driver.switchTo().defaultContent();
		
		//Calculate the total number of frames
		totalFrames = identifyFrames.size() + identifyFramesOne.size() + identifyFramesTwo.size() + identifyFramesThree.size();
	
		//Print the total number of frames
		System.out.println("The total number of iframes in the given link is:" + totalFrames);
		
	}
	
}
