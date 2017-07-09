package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\April\\src\\main\\java\\chromedriver.exe" );

	//Launch the Chrome browser
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Open the URL
	driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Switch to the main frame
	driver.switchTo().frame(driver.findElementById("childIframe"));
	
	
	//Close the button in the west frame
	driver.findElementByXPath("/html/body/div[2]/p/button").click();
	
	//Come back to the main frame
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	
	//Switch to the main frame
	driver.switchTo().frame(driver.findElementById("childIframe"));
	
	//Close the button in the east frame
	driver.findElementByXPath("/html/body/div[3]/p/button").click();
	
	Thread.sleep(2000);
	
	//Come back to the main frame
	driver.switchTo().defaultContent();
	
	Thread.sleep(2000);
	
	//Click the outer west frame
	driver.findElementByXPath("/html/body/div[1]/p[1]/button").click();
	
	Thread.sleep(2000);
	
	//Click the outer east frame
	driver.findElementByXPath("/html/body/div[2]/p/button").click();	
	
	Thread.sleep(2000);
	
	System.out.println("All the frames in the corner have been closed !!!");
	
	driver.close();
	
	driver.quit();
	
	}

}
