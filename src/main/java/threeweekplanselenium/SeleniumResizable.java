package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Resizable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement resizable = driver.findElementByXPath("//*[@id='resizable']/div[3]");
		System.out.println("The original size is:" +resizable.getSize());
		Actions builder = new Actions(driver);
		builder.clickAndHold(resizable).moveByOffset(200, 200).release().perform();
		System.out.println("The current size is:" +resizable.getLocation());
		
		
	}

}
