package trainingSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowsOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser and navigate to the website
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Print the window handle of the current window
		System.out.println(driver.getWindowHandle());
		
		//Store the window handle of the parent window in a variable
		String primaryWindow = driver.getWindowHandle();
		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Thread.sleep(3000);
		
		//Switch between windows using Iterator
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		//Hold the first window in the first string variable
		String firstWin = itr.next();
		
		//Hold the second window in the second string variable
		String secondWin = itr.next();
		
		//Switch to the next window
		driver.switchTo().window(secondWin);
		
		//Switch to the previous window
		driver.switchTo().window(firstWin);
		
		

	}

}
