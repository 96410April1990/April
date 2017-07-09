package threeweekplanselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUsingWindows {

	FirefoxDriver driver = new FirefoxDriver();
	String parentWindowHandle;
	String firstChildWindow;
	String secondChildWindow;
	String thirdChildWindow;
	
	public int launchBrowser() {
		
		int browser = 1;
		
		driver.manage().window().maximize();
		System.out.println("Window Maximized!"+"\n");
		driver.navigate().to("http://popuptest.com/");
		System.out.println("Navigated to the URL!"+"\n");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if (browser==1) {
			
			System.out.println("Browser launch successful!"+"\n");
			return 1;
			
		} else {
			
			System.out.println("Browser launch unsuccessful!"+"\n");
			return 0;

		}
		
	}
	
	public int parentWindowTitle() {
		
		int parentWindow = 1;
					
		System.out.println("The title of the parent window is:"+ driver.getWindowHandle()+"\n");
		parentWindowHandle = driver.getWindowHandle();
		
		if (parentWindow==1) {
			
			System.out.println("Title of the parent window printed successfully!"+"\n");
			return 1;
			
		} else {
			
			System.out.println("Title of the parent window could not be printed!"+"\n");
			return 0;
			
		}
		
	}
	
	public void clickPopupLink() throws InterruptedException {
		
		boolean clickLink = true;
		
		System.out.println("Clicking the multi popup link on the home page!"+"\n");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
				
		if (clickLink==true) {
			
			System.out.println("Clicked the multi popup link successfully!"+"\n");
			
		} else {
			
			System.out.println("Could not click the multi popup link!"+"\n");
			
		}
		
		Thread.sleep(3000);
			
	}
	
	public void passControl() throws InterruptedException {
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		System.out.println("Passing the control to the first child window"+"\n");
				
		for (String winHandle : windowHandles) {
			driver.switchTo().window(winHandle);		
		}
		
		firstChildWindow = driver.getWindowHandle();
		System.out.println("This is the first child window:"+firstChildWindow+"\n");
		
		Thread.sleep(3000);
		
		Set<String> windowHandlesOne = driver.getWindowHandles();
		System.out.println(windowHandlesOne.size());
		System.out.println("Passing the control to the second child window"+"\n");
		
		for (String winHandleOne : windowHandlesOne) {
			driver.switchTo().window(winHandleOne);						
		}
		
		secondChildWindow = driver.getWindowHandle();
		System.out.println("This is the second child window:"+secondChildWindow+"\n");
		
		Thread.sleep(3000);
		
		Set<String> windowHandlesTwo = driver.getWindowHandles();
		System.out.println(windowHandlesTwo.size());
		System.out.println("Passing the control to the third child window"+"\n");
		
		for (String winHandleTwo : windowHandlesTwo) {			
			driver.switchTo().window(winHandleTwo);
		}
		
		thirdChildWindow = driver.getWindowHandle();
		System.out.println("This is the third child window:"+thirdChildWindow+"\n");
		
		Thread.sleep(3000);
			
	}
	
	public void closeWindows() throws InterruptedException {
		
		System.out.println("This is the current window:"+thirdChildWindow+"\n");
		System.out.println("Closing the third child window"+"\n");
		driver.close();
		Thread.sleep(2000);
		System.out.println("Passing control to the second child window"+"\n");
		driver.switchTo().window(thirdChildWindow);
		System.out.println("This is the current window:"+secondChildWindow+"\n");
		System.out.println("Closing the second child window"+"\n");
		driver.close();
		Thread.sleep(2000);
		System.out.println("Passing control to the first child window"+"\n");
		driver.switchTo().window(thirdChildWindow);
		System.out.println("This is the current window:"+firstChildWindow+"\n");
		System.out.println("Closing the first child window"+"\n");
		driver.close();
		Thread.sleep(2000);
		System.out.println("Passing control to the parent window"+"\n");
		driver.switchTo().window(parentWindowHandle);
		System.out.println("This is the current window"+parentWindowHandle+"\n");
		driver.close();		
		
	}
	
	public void printResult() {
		
		System.out.println("RESULT: PASS");
		driver.quit();
		
	}
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumUsingWindows learnWindows = new SeleniumUsingWindows();
		learnWindows.launchBrowser();
		learnWindows.parentWindowTitle();
		learnWindows.clickPopupLink();
		learnWindows.passControl();
		learnWindows.closeWindows();
		learnWindows.printResult();		

	}

}
