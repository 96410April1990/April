package threeweekplanselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingFramesOne {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public void launchBrowser() {
		
		driver.manage().window().maximize();
		System.out.println("Browser Maximized!");
				
	}
	
	public void openUrl() {
		
		driver.navigate().to("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to the URL!");
				
	}
	
	public void countFrames() throws InterruptedException {
		
		//Count the number of frames 
		List<WebElement> getFrames = driver.findElementsByTagName("iframe");
		System.out.println("The number of frames is:"+" "+getFrames.size());
		Thread.sleep(3000);
		
		//Switch to frame 1
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[1]"));
		System.out.println("Switched to frame one!");
		
		//Print the number of nested frames in frame 1
		List<WebElement> frameOne = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames in frame 1 is:"+" "+frameOne.size());
		
		if (frameOne.size()>0) {
			
			System.out.println("Dude, there are nested frames within frame 1");
			
		} else {
			
			System.out.println("No frames within frame 1, switch to the default frame");

		}
		
		//Switch to the main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to the main frame!");
		
		Thread.sleep(3000);
		
		//Switch to frame 2
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[2]"));
		System.out.println("Switched to frame two!");
		
		//Print the number of frames in frame two
		List<WebElement> frameTwo = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame two:"+" "+frameTwo.size());
		
		if (frameTwo.size()>0) {
			
			System.out.println("Dude, there are nested frames within frame 2");
			
		} else {
			
			System.out.println("No frames within frame 2, switch to the default frame");

		}
		
		//Switch to frame 6 
		driver.switchTo().frame(driver.findElementByXPath("//*[@id='footerWrapper']/iframe"));
		System.out.println("Switched to frame six!");
								
		//Count the number of nested frames in frame seven
		List<WebElement> frameSix = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame six:"+" "+frameSix.size());
								
		if (frameSix.size()>0) {
									
			System.out.println("Dude, there are nested frames within frame 6");
									
		} else {
									
			System.out.println("No frames within frame 6, switch to the default frame");

		}
								
		//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame!");
						
		Thread.sleep(3000);
		
		//Switch to frame 7 
		driver.switchTo().frame(driver.findElementByXPath("//*[@id='_atssh590']"));
		System.out.println("Switched to frame seven!");
										
		//Count the number of nested frames in frame six
		List<WebElement> frameSeven = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame six:"+" "+frameSeven.size());
										
		if (frameSeven.size()>0) {
											
			System.out.println("Dude, there are nested frames within frame 7");
											
		} else {
											
			System.out.println("No frames within frame 7, switch to the default frame");

		}
										
		//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame!");
								
		Thread.sleep(3000);
		
		/*//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to the main frame!");
		
		Thread.sleep(3000);*/
		
		//Switch to frame 3
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[1]/iframe"));
		System.out.println("Switched to frame three!");
		
		//Count the number of nested frames within frame 3
		List<WebElement> frameThree = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame three:"+" "+frameThree.size());
		
		if (frameThree.size()>0) {
			
			System.out.println("Dude, there are nested frames within frame 3");
			
		} else {
			
			System.out.println("No frames within frame 3, switch to the default frame");

		}
		
		//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame!");
		
		Thread.sleep(3000);
		
		//Switch to frame 4 
		driver.switchTo().frame(driver.findElementByXPath("/html/body/div[2]/iframe"));
		System.out.println("Switched to frame four!");
		
		//Count the number of nested frames in frame four
		List<WebElement> frameFour = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame four:"+" "+frameFour.size());
		
		if (frameFour.size()>0) {
			
			System.out.println("Dude, there are nested frames within frame 4");
			
		} else {
			
			System.out.println("No frames within frame 4, switch to the default frame");

		}
		
		//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame!");
		
		Thread.sleep(3000);
		
		//Switch to frame 5 
		driver.switchTo().frame(driver.findElementByXPath("/html/body/iframe[3]"));
		System.out.println("Switched to frame five!");
				
		//Count the number of nested frames in frame five
		List<WebElement> frameFive = driver.findElementsByTagName("iframe");
		System.out.println("The number of nested frames within frame five:"+" "+frameFive.size());
				
		if (frameFive.size()>0) {
					
			System.out.println("Dude, there are nested frames within frame 5");
					
		} else {
					
			System.out.println("No frames within frame 5, switch to the default frame");

		}
				
		//Switch to main frame
		driver.switchTo().defaultContent();
		System.out.println("Switched to main frame!");
		
		Thread.sleep(3000);
		
				
	}
	
	public int logOutAndClose() {
		
		driver.quit();
		driver.close();
		System.out.println("I am closing down!"+"\n"+"Bye dude!");
		return 1;
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumHandlingFramesOne handleframe = new SeleniumHandlingFramesOne();
		
		handleframe.launchBrowser();
		handleframe.openUrl();
		handleframe.countFrames();
		handleframe.logOutAndClose();

	}

}
