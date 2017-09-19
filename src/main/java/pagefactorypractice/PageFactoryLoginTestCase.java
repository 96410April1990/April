package pagefactorypractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactoryLoginTestCase {

	private static WebDriver driver = null;
	private static String homePageVerifyText = "Twitter";
	private static String homePage = "/html/head/title";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		//Launch the browser, maximize it and navigate to the URL
		driver.manage().window().maximize();
		driver.navigate().to("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Entering the user Id and password
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div[2]/a[3]")).click();
		driver.findElement(By.xpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[1]/input")).sendKeys("rohithkumar90@ymail.com");
		driver.findElement(By.xpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys("rohith");
		driver.findElement(By.xpath("/html/body/div[20]/div/div[2]/div[2]/div[2]/form/input[1]")).click();
		if (driver.findElement(By.xpath(homePage)).getText().contains(homePageVerifyText)) {
			System.out.println("This is home page!");
		} else {
			System.out.println("This ain't the home page!");
		}
		System.out.println("Signing off!");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[3]/ul/li[1]/div/ul/li[13]/button")).click();
		System.out.println("Closing the browser!");
		driver.quit();
	}

}
