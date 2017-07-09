package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingFramesTwo {
	
	FirefoxDriver driver = new FirefoxDriver();
		
	public boolean launchBrowserAndOpenUrl() {
		
		boolean launchBrowser = true;
		
		driver.manage().window().maximize();
		driver.navigate().to("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (launchBrowser==true) {
			
			System.out.println("Browser launched, maximized and navigated to the URL!");
			return true;
						
		}
		else {
			
			System.out.println("Sorry mate, Browser launch unsuccessful!");
			return false;
			
		}
						
	}
	
	public boolean enterFrame() {
		
		boolean useFrame = true;
		
		driver.switchTo().frame(driver.findElementById("childIframe"));
		if (useFrame==true) {
			
			System.out.println("Entered the frame!");
			return true;
			
		} else {
			
			System.out.println("Sorry mate, could not enter the frame!");
			return false;

		}
				
	}
	
	public boolean closeLeftFrame() {
		
		boolean leftFrame = true;
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		if (leftFrame==true) {
			
			System.out.println("Closed the left frame!");
			return true;
			
		} else {
			
			System.out.println("Sorry mate, could not close the left frame!");
			return false;

		}
		
	}
	
	public boolean closeRightFrame() {
		
		boolean rightFrame = true;
		
		driver.findElementByXPath("/html/body/div[3]/p/button").click();
		if (rightFrame==true) {
			
			System.out.println("Closed the right frame!");
			return true;
			
		} else {
			
			System.out.println("Sorry mate, could not close the right frame!");
			return false;

		}
		
	}
	
	public boolean exitFrame() {
		
		boolean frameExit = true;
		
		driver.switchTo().defaultContent();
		if (frameExit==true) {
			
			System.out.println("Exited frame successfully!");
			return true;
			
		} else {
			
			System.out.println("Sorry mate, Could not exit the frame!");
			return false;

		}
						
	}
	
	public int closeLeftMostFrame() {
		
		int leftMostFrame = 1;
		
		driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
		if (leftMostFrame==1) {
			
			System.out.println("Closed the left most frame!");
			return 1;
			
		} else {
			
			System.out.println("Sorry mate, could not close the left most frame!");
			return 0;

		}
		
	}
	
	public int closeRightMostFrame() {
		
		int rightMostFrame = 1;
		
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		if (rightMostFrame==1) {
			
			System.out.println("Closed the right most frame!");
			return 1;
			
		} else {
			
			System.out.println("Sorry mate, could not close the right most frame!");
			return 0;

		}
		
	}
	
	public int closeBrowser() {
		
		int close = 1;
		
		driver.close();
		if (close==1) {
			
			System.out.println("Closed the browser!");
			return 1;
			
		} else {
			
			System.out.println("Sorry mate, could not close the browser!");
			return 0;

		}
				
	}
	
	public boolean printResult() {
		
		boolean result = true;
		
		driver.quit();
		if(result==true) {
			
			System.out.println("RESULT: PASS");
			return true;
			
		} else {
			
			System.out.println("RESULT: FAIL");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumHandlingFramesTwo closeFrames = new SeleniumHandlingFramesTwo();
		closeFrames.launchBrowserAndOpenUrl();
		closeFrames.enterFrame();
		closeFrames.closeLeftFrame();
		closeFrames.closeRightFrame();
		closeFrames.exitFrame();
		closeFrames.closeLeftMostFrame();
		closeFrames.closeRightMostFrame();
		closeFrames.closeBrowser();
		closeFrames.printResult();		

	}

}
