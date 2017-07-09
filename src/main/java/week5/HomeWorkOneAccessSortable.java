package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkOneAccessSortable {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "C:/April/src/main/java/chromedriver.exe");
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to the URL and maximize the window
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Click Sortable on the hompage
		driver.findElementByLinkText("Sortable").click();
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		WebElement sort = driver.findElementByXPath(("//*[@id='sortable']/li[1]"));
		
		System.out.println("The current location of Item 1 is:" +sort.getLocation());
		
		WebElement drop = driver.findElementByXPath(("//*[@id='sortable']/li[6]"));
		
		System.out.println("The current location of Item 6 is:" +drop.getLocation());
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(sort, 11, 179).build().perform();
		
		System.out.println("The current location of Item 1 is:" +sort);
		
		System.out.println("The current location of Item 6 is:" +drop);

	}

}
