package trainingSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Print the window handle of the parent window
		System.out.println(driver.getWindowHandle());
		
		//Store the window handle of the parent window in a variable
		String primaryWindow = driver.getWindowHandle();
		
		//Click the 'guest check-in' button on the homepage of the website
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		for (String wHandle : windowHandles) {
			
			driver.switchTo().window(wHandle);
			
		}
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElementByLinkText("click here").click();
		
		Set<String> windowHandlesOne = driver.getWindowHandles();
		
		System.out.println(windowHandlesOne.size());
		
		for (String wHandleOne : windowHandlesOne) {
			
			driver.switchTo().window(wHandleOne);
			
		}
		
		System.out.println(driver.getWindowHandle());
		
		driver.close();
		
		driver.switchTo().window(primaryWindow);
		

	}

}
