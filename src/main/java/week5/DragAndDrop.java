package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/April/src/main/java/chromedriver.exe");
		
		//Launch the browser		
		ChromeDriver driver = new ChromeDriver();
		
		//navigate to the URL and maximize the browser
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//click droppable
		driver.findElementByLinkText("Droppable").click();
		
		//switch to the frame
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//Get the WebElement to be dragged and the WebElement where the WebElement dragged is to 
		//be dropped
		WebElement drag = driver.findElementById("draggable");
		
		//Print the location of the WebElement to be dragged
		System.out.println("The location of the WebElement to be dragged: "+ drag.getLocation());
		
		WebElement drop = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
		//Drop the WebElement that is dragged
		builder.dragAndDrop(drag, drop).build().perform();
		
		//Print the current location of the WebElement that has been dragged and dropped
		System.out.println("THe location of the WebElement after drag and drop: "+ drop.getLocation());
		
		//Drag the same WebElement and drop it back in the same place
		builder.dragAndDrop(drop, drag).build().perform();
		
		//Print the current location of the WebElement after dropping it back in the same place
		System.out.println("The location of the WebElement after putting it back in the same place: "+ drag.getLocation());
		
	}

}
