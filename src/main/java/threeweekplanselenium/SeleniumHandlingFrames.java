package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingFrames {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public int launchBrowser() {
		
		driver.manage().window().maximize();
		System.out.println("Browser Launched and Maximized!");
		return 1;
		
	}
	
	public int openUrl() {
		
		driver.navigate().to("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to the URL!");
		return 1;
		
	}
	
	public int enterFrame() {
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		System.out.println("Entered the frame");
		return 1;
		
	}
	
	public int readContent() {
		
		System.out.println(driver.findElementById("draggable").getText());
		driver.switchTo().defaultContent();
		return 1;
		
	}
	
	public int closeBrowser() {
		
		driver.close();
		driver.quit();
		System.out.println("Closed the browser");
		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumHandlingFrames frames = new SeleniumHandlingFrames();
		frames.launchBrowser();
		frames.openUrl();
		frames.enterFrame();
		frames.readContent();
		frames.closeBrowser();

	}

}
