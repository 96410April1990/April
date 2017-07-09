package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkFiveAccessAmazon {

	public static void main(String[] args) {
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
				
		//Navigate to the URL and maximize the window
		driver.navigate().to("http://amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Mouseover ShopByCategory
		Actions builder = new Actions(driver);
		
		WebElement moveMouse = driver.findElementByXPath("//*[@id='nav-link-shopall']");
		
		builder.moveToElement(moveMouse).build().perform();
		
		
		
		

	}

}
