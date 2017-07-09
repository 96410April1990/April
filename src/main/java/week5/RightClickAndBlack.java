package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndBlack {

	public static void main(String[] args) {
	
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL and maximize the window
		driver.navigate().to("http://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click sortable
		driver.findElementByLinkText("Sortable").click();
		
		Actions builder = new Actions(driver);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement sort = driver.findElementById("sortable");
		
		builder.contextClick(sort).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

		
	}

}
