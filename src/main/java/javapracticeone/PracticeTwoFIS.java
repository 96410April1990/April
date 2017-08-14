package javapracticeone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTwoFIS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String facebookUrl = "https://www.facebook.com/";
		String genderBtnXpath = "/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input";
		boolean gndrBtn = false;
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(facebookUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement genderButton = driver.findElementByXPath(genderBtnXpath);
		if (genderButton.isDisplayed() && genderButton.isEnabled()) {
			gndrBtn = true;
			System.out.println("Hi, the button is available");
		} else {
			System.out.println("Sorry mate, the button is not available");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
