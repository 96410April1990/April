package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingDraggableDroppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );
	
	//Launch the Chrome Browser
	//ChromeDriver driver = new ChromeDriver();
	
	FirefoxDriver driver = new FirefoxDriver();
	
	//Navigate to the URL
	driver.get("http://jqueryui.com/");
	
	//Maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Click the draggable button in the webpage
	driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[1]/a").click();	
	
	Thread.sleep(3000);
	
	//Switch to the frame
	driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	
	String readtext = driver.findElementById("draggable").getText();
	
	if(readtext.contains("Drag me around")) {
		System.out.println("The text inside draggable is:" + readtext);
	}
	else
	{
		System.out.println("No text is available inside draggable");
			
	}

	Thread.sleep(3000);
	
	//Come out of the frame
	driver.switchTo().defaultContent();
	
	//Click Droppable button in the webpage
	
	driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[2]/a").click();
	
	driver.close();
	
}

}