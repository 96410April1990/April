/*-- open the webpage jqueryui.com and click draggable and print the content
-- click droppable, drag it and drop it in the appropriate place*/

package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the browser and navigate to the URL
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click draggable
		driver.findElementByName("Droppable").click();
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		Thread.sleep(3000);
		
		//Get the webelement to be dragged and store it in a variable
		WebElement drag = driver.findElementById("draggable");
		
		System.out.println("The current location of the dragged webelement is:" +drag.getLocation());
		
		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
		//Drop the webelement that is dragged
		builder.dragAndDrop(drag, drop).build().perform();
		
		//Print the location of the webelement after is dragged and dropped
		System.out.println("The current location of the dropped webelement is:" +drop.getLocation());
		
		Thread.sleep(2000);
		
		//Drag and drop the webelement back in its original position
		builder.dragAndDrop(drop, drag).build().perform();
		
		//Print the location of the webelement after putting it back in its original position
		System.out.println("The curren location of the dropped webelement is:" +drag.getLocation());
		
	}

}
