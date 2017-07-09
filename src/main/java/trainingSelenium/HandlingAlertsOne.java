package trainingSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertsOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );
		
		//Launch the Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Switch to the frame
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		
		//Click the try it button 
		driver.findElementByXPath("/html/body/button").click();
		Thread.sleep(2000);
		
		//Accept the alert
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		
		myAlert.sendKeys("Rohith");
		myAlert.accept();
		

	}

}
