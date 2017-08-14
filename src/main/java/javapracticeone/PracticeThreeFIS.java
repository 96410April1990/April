package javapracticeone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeThreeFIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jQueryUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		String enterFrame = "iframeResult";
		String txtInsdFrame = "JavaScript Prompt";
		String getFrameText = "/html/body/h2";
		String readText;
		boolean textValidation = false;
		Alert hndlAlert;
		String hndlAlrtOne = "/html/body/button";
		String verifyTxt = "Hello Rohith Nandakumar! How are you today?";
		String verifyTxtOne = "/html/body/p";
		boolean textValidationOne = false;
		String readTextOne;
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(jQueryUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the frame
		driver.switchTo().frame(driver.findElementById(enterFrame));
		
		//Print the text inside the frame
		readText = driver.findElementByXPath(getFrameText).getText();		
		if (readText.equalsIgnoreCase(txtInsdFrame)) {
			textValidation = true;
			System.out.println("The text within the frame:"+" "+readText);
			System.out.println("Accepting the alert now!");
			driver.findElementByXPath(hndlAlrtOne).click();
			hndlAlert = driver.switchTo().alert();
			hndlAlert.sendKeys("Rohith Nandakumar");
			hndlAlert.accept();
			readTextOne = driver.findElementByXPath(verifyTxtOne).getText();
			if (verifyTxt.equalsIgnoreCase(verifyTxt)) {
				textValidationOne = true;
				System.out.println(verifyTxt);
			} else {
				System.out.println("Sorry mate, negative!");
			}			
		} else {
			System.out.println("Sorry mate, could not read the text within the frame");
		}		

	}

}
