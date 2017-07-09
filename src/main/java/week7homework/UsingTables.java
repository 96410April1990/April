package week7homework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Launch the browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Navigate to erail.in
		driver.navigate().to("http://erail.in/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the source
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS");
		
		//Enter the destination
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC");
		
		//Click the get trains button
		driver.findElementById("buttonFromTo").click();
		
		Thread.sleep(3000);
		
		WebElement table = driver.findElementById("tableMain");
		
		System.out.println("The number of rows in the table is:" +driver.findElementsByTagName("tr").size());
		
		WebElement getspecrow = driver.findElementsByTagName("tr").get(2);
		
		System.out.println("The specific row in the table is:" +getspecrow);
		
		System.out.println(getspecrow.findElements(By.tagName("td")).size());
		
		List<WebElement> columns = getspecrow.findElements(By.tagName("td"));
		
		for (WebElement getdata : columns) {
			
			System.out.println(getdata.getText());		
			
		}
		

	}

}
