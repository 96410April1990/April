package week2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );
	
	//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Open the URL
	driver.get("http://www.crystalcruises.com");

	//Maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//store the window handle of the parent window in a variable
	String StoreWindowHandle = driver.getWindowHandle();
	
	//Print the handle of the parent window
	System.out.println(driver.getWindowHandle());
	
	//Click the guest check-in button in the home page
	driver.findElementByLinkText("GUEST CHECK-IN").click();
	
	Thread.sleep(2000);
	
	//Pass the control to the new window
	Set<String> windowhandles = driver.getWindowHandles();
	
	for(String newwin : windowhandles) {
		driver.switchTo().window(newwin);
	}
	
	Thread.sleep(2000);
	
	//Print the window handle of the new window
	System.out.println(driver.getWindowHandle());
	
	//Click the hyper link in the new window
	driver.findElementByLinkText("click here").click();
	
	//Pass the control to the new window
	Set<String> windowhandlestwo = driver.getWindowHandles();
	
	for(String newwinone : windowhandlestwo) {
		driver.switchTo().window(newwinone);
	}
	
	Thread.sleep(2000);
	
	//Print the window handle of the new window
	System.out.println(driver.getWindowHandle());
	
	//Select a Language in the drop down
	driver.findElementByClassName("goog-te-combo").click();
	WebElement sellang = driver.findElementByClassName("goog-te-combo");
	Select language = new Select(sellang);
	language.selectByValue("ta");
	
	Thread.sleep(2000);
	
	//Close the window
	driver.close();
	
	//Pass the control to the parent window
	driver.switchTo().window(StoreWindowHandle);
	
	//Print the window handle of the parent window again
	System.out.println(driver.getWindowHandle());
	
	Thread.sleep(2000);
	
	//Close the browser
	driver.quit();
	
	}

}
