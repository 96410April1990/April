package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSortableOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Sortable").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement draggable = driver.findElementByXPath("//*[@id='sortable']/li[1]");
		WebElement droppable = driver.findElementByXPath("//*[@id='sortable']/li[6]");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		driver.close();
		driver.quit();		
		
	}

}
