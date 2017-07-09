package testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[2]/a").click();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		System.out.println("The title of the parent window is:" +driver.getTitle());
		
		Actions builder = new Actions(driver);
		
		String parentHandle = driver.getWindowHandle();
		
		WebElement pageSource = driver.findElementById("droppable");
		
		builder.contextClick(pageSource).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
		sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).
		sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		
		for (String nextWindow : driver.getWindowHandles()) {
			driver.switchTo().window(nextWindow);
		}
		
		Thread.sleep(3000);
		
		System.out.println("The title of the child window is:" +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentHandle);
		
		System.out.println("Switching back to parent window:" +driver.getTitle());

	}

}
