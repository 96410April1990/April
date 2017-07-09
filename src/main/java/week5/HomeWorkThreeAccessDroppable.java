package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkThreeAccessDroppable {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		FirefoxDriver driver = new FirefoxDriver();

		// Navigate to the URL and maximize the window
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Click Droppable in the Home page
		driver.findElementByLinkText("Droppable").click();
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement pagesource = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
		System.out.println("The title of the parent page is:" +driver.getTitle());
		
		String parentHandle = driver.getWindowHandle();
		
		builder.contextClick(pagesource).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
		sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
		sendKeys(Keys.ENTER).build().perform();
		
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		System.out.println("The title of the new page is:" +driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentHandle);
		
		System.out.println("The title of the parent page is:" +driver.getTitle());

		
	}

}
