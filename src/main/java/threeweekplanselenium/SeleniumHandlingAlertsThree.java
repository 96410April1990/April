package threeweekplanselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHandlingAlertsThree {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	public boolean launchBrowser() {
		
		boolean browserLaunch = true;
		
		driver.manage().window().maximize();
		driver.navigate().to("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"+"\n");
		System.out.println("Maximized the window!"+"\n");
		
		if (browserLaunch==true) {
			
			System.out.println("Browser launched, maximized and navigated to the URL!"+"\n");
			return true;
			
		} else {
			
			System.out.println("Negative!"+"\n");
			return false;

		}
		
	}
	
	public boolean enterFrame() {
		
		boolean useFrame = true;
		
		System.out.println("Going to enter the frame!"+"\n");
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		System.out.println("Entered the frame!"+"\n");
		
		if (useFrame==true) {
			
			System.out.println("Success!");
			return true;
			
		} else {
			
			System.out.println("Failure!");
			return false;

		}	
		
	}
	
	public boolean clickButton() {
		
		boolean button = true;
		
		System.out.println("Going to click the button!"+"\n");
		driver.findElementByXPath("/html/body/button").click();
		System.out.println("Clicked the button!"+"\n");
		
		if (button==true) {
			
			System.out.println("Success!"+"\n");
			return true;
			
		} else {

			System.out.println("Failure"+"\n");
			return false;
			
		}		
		
	}
	
	public boolean handlePrompt() {
		
		boolean prompt = true;
				
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.sendKeys("Rohith Nandakumar");
		myAlert.accept();
		
		if (prompt==true) {
			
			System.out.println("\n"+"Entered a new name and accepted the alert"+"\n");
			return true;
			
		} else {
			
			System.out.println("Negative!"+"\n");
			return false;

		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumHandlingAlertsThree handlingPrompts = new SeleniumHandlingAlertsThree();
		handlingPrompts.launchBrowser();
		handlingPrompts.enterFrame();
		handlingPrompts.clickButton();
		handlingPrompts.handlePrompt();		
		

	}

}
