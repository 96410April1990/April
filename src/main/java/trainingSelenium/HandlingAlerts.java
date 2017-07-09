package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser and maximize it
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		Thread.sleep(2000);
		
		//Click the tryit button
		driver.findElementByXPath("/html/body/button").click();
		
		Alert myAlert = driver.switchTo().alert();
		
		myAlert.accept();
		
		System.out.println();
		

	}

}
