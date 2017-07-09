package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingAlertsOne {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public void launchBrowser() {
		
		driver.manage().window().maximize();
		System.out.println("Browser launched and maximized");
		
	}
	
	public void openUrl() {
		
		driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Navigated to the URL");
		
	}
	
	public void enterFrame() {
		
		driver.switchTo().frame("iframeResult");
		System.out.println("Entered into the frame");
						
	}
	
	public boolean clickButtonAndAcceptAlert() throws InterruptedException {
		
		driver.findElementByXPath("/html/body/button").click();
		System.out.println("Clicked the button");
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		System.out.println("Alert Accepted");
		Thread.sleep(3000);
		return true;
		
	}
	
	public void readText() {
		
		System.out.println(driver.findElementByXPath("/html/body/p").getText());		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SeleniumHandlingAlertsOne handle = new SeleniumHandlingAlertsOne();
		
		handle.launchBrowser();
		System.out.println("\n");
		handle.openUrl();
		System.out.println("\n");
		handle.enterFrame();
		System.out.println("\n");
		handle.clickButtonAndAcceptAlert();
		System.out.println("\n");
		handle.readText();
		System.out.println("\n");
		System.out.println("RESULT:"+" "+"PASS");

	}

}
