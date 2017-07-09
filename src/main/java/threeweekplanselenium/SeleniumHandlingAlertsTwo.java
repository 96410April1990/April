package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingAlertsTwo {

FirefoxDriver driver = new FirefoxDriver();
	
	public void launchBrowserOne() {
		
		driver.manage().window().maximize();
		System.out.println("Browser launched and maximized");
		
	}
	
	public void openUrlOne() {
		
		driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to the URL");
		
	}
	
	public void enterFrameOne() {
		
		driver.switchTo().frame("iframeResult");
		System.out.println("Entered into the frame");
						
	}
	
	public boolean clickButtonAndDismissAlert() throws InterruptedException {
		
		driver.findElementByXPath("/html/body/button").click();
		System.out.println("Clicked the button");
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.dismiss();
		System.out.println("\n"+"Alert Dismissed");
		Thread.sleep(3000);
		return true;
		
	}
	
	public void readTextOne() {
		
		System.out.println(driver.findElementByXPath("/html/body/p").getText());		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumHandlingAlertsTwo handle = new SeleniumHandlingAlertsTwo();
		
		handle.launchBrowserOne();
		System.out.println("\n");
		handle.openUrlOne();
		System.out.println("\n");
		handle.enterFrameOne();
		System.out.println("\n");
		handle.clickButtonAndDismissAlert();
		System.out.println("\n");
		handle.readTextOne();
		System.out.println("\n");
		System.out.println("RESULT:"+" "+"PASS"+"\n"+"Alert Dismissed");

	}

}
