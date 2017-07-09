package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[1]/a").click();
		
		Thread.sleep(3000);
		
		//Switch to frame
		driver.switchTo().frame("//*[@id='content']/iframe");
		
		String drag = driver.findElementById("draggable").getText();
		
		if(drag.contains("Drag me around")) {
			
			System.out.println("The text inside draggable is:" +drag);
			
		}
		else {
			
			System.out.println("There is no text inside draggable");
			
		}
		
		Thread.sleep(3000);
		
		//Come out of the frame
		driver.switchTo().defaultContent();
		
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[2]/a").click();
		
		
	}

}
