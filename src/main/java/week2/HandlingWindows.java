package week2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );
	
	//Launch the Chrome browser
	FirefoxDriver driver = new FirefoxDriver();
	
	//Open the URL
	driver.get("http://popuptest.com/");
	
	//Maximize the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Print the parent window's handle	
	System.out.println("This is the parent window:" +driver.getWindowHandle());
	
	String primaryWindow = driver.getWindowHandle();
	
	//Click the Multi-popup
	driver.findElementByXPath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a").click();	
	
	Thread.sleep(3000);
	
	//Pass control to the new window
	Set<String> windowHandles = driver.getWindowHandles();
	
	System.out.println(windowHandles.size());
	
	for(String wHandle : windowHandles) {
		driver.switchTo().window(wHandle);
	}
	
	//Print the window handle ID
	System.out.println("This is window number one:" +driver.getWindowHandle());
	
	String firstWindow = driver.getWindowHandle();
	
	//Pass control to the new window	
	Set<String> windowHandlesone = driver.getWindowHandles();
	
	System.out.println(windowHandlesone.size());
	
	for(String wHandleone : windowHandlesone){
		//Switch to the child window		
		driver.switchTo().window(wHandleone);
	}
	
	String secondWindow = driver.getWindowHandle();
	
	//Print the window handle ID
	System.out.println("This is window number two:" +driver.getWindowHandle());
	
	//Pass control to the new window
	Set<String> windowHandlestwo = driver.getWindowHandles();
		
	System.out.println(windowHandlestwo.size());
	
	for(String wHandletwo : windowHandlestwo){
		//Switch to the second child window
		driver.switchTo().window(wHandletwo);
	}
	
	String thirdWindow = driver.getWindowHandle();
	
	//Print the window handle ID
	System.out.println("This is window number three:" +driver.getWindowHandle());
	
	Thread.sleep(3000);
	
	//Close the third window
	driver.close();
	
	Thread.sleep(2000);
	
	//Pass the control back to the second window
	driver.switchTo().window(secondWindow);
	
	//Close the second window
	driver.close();
	
	Thread.sleep(2000);
	
	//Pass the control back to the first window
	driver.switchTo().window(firstWindow);
	
	//Close the first window
	driver.close();
	
	Thread.sleep(2000);
	
	//Pass the control back to the parent window
	driver.switchTo().window(primaryWindow);
	
	//Print the title of the parent window
	String parentWindowTitle = driver.getTitle();
	System.out.println("The title of the parent window is:" + parentWindowTitle);
	
	Thread.sleep(2000);
	
	driver.close();
	
	}
	
	
	}


