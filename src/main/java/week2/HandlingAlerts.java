package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Switch to frame
	driver.switchTo().frame(driver.findElementById("iframeResult"));
	
	//Click the Try it button
	driver.findElementByXPath("/html/body/button").click();
	
	Thread.sleep(3000);
	
	Alert MyAlert = driver.switchTo().alert();
	
	MyAlert.sendKeys("Rohith");
	
	Thread.sleep(2000);
	
	MyAlert.accept();
	
	
	
	}

}
