package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDraggableDroppable {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public void launchBrowserAndOpenUrl() {
		
		boolean launchBrowser = true;
		
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (launchBrowser==true) {
			
			System.out.println("Launched the browser and navigated to the URL!");
						
		} else {
			
			System.out.println("Sorry mate, negative!");
						
		}	
		
	}
	
	public void clickDraggable() throws InterruptedException {
		
		boolean draggableClick = true;
		
		driver.findElementByLinkText("Draggable").click();
		if (draggableClick==true) {
			
			System.out.println("Click 'Draggable' in the main page!");
			
		} else {
			
			System.out.println("Sorry mate, negative!");

		}
		
		Thread.sleep(3000);
			
	}
	
	public void enterFrame() {
		
		boolean useFrame = true;
		
		driver.switchTo().frame(driver.findElementByXPath("//*[@id='content']/iframe"));
		if (useFrame==true) {
			
			System.out.println("Entered the frame!");
			
		} else {

			System.out.println("Sorry mate, negative!");
			
		}
		
	}
	
	public void readTextDraggable() throws InterruptedException {
		
		boolean readText = true;
		
		String readDraggable = driver.findElementById("draggable").getText();
		System.out.println(readDraggable);
		if (readText==true) {
			
			System.out.println("Printed the text inside draggable!");
			
		} else {

			System.out.println("Sorry mate, negative!");
			
		}
		
		Thread.sleep(3000);
				
	}
	
	public void exitFrame() {
		
		boolean frameExit = true;
		driver.switchTo().defaultContent();
		if (frameExit==true) {
			
			System.out.println("Exited frame!");
			
		} else {
			
			System.out.println("Sorry mate, negative!");

		}
		
	}
	
	public void clickDroppable() {
		
		boolean droppableClick = true;
		driver.findElementByLinkText("Droppable").click();
		if (droppableClick==true) {
			
			System.out.println("Clicked Droppable!");
			
		} else {
			
			System.out.println("Sorry mate, negative!");

		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumDraggableDroppable dragAndDrop = new SeleniumDraggableDroppable();
		dragAndDrop.launchBrowserAndOpenUrl();
		dragAndDrop.clickDraggable();
		dragAndDrop.enterFrame();
		dragAndDrop.readTextDraggable();
		dragAndDrop.exitFrame();
		dragAndDrop.clickDroppable();		
		
	}

}
