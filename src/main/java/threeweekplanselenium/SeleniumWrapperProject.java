package threeweekplanselenium;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Reporter;

public class SeleniumWrapperProject
{

	RemoteWebDriver driver;
	
	int snapcount = 1;
	
	String pagetitle;
	
	public void launchBrowser(String browsername, String url) {

		try {
			if (browsername.equalsIgnoreCase("firefox")) {

				driver = new FirefoxDriver();
			} else {
				browsername.equalsIgnoreCase("chrome");
				System.setProperty("webdriver.chrome.driver", "C:/Users/Testleaf Selenium Library/Softwares/drivers/chromedriver.exe");

				driver = new ChromeDriver();
			}

			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (WebDriverException e) {
			System.out.println("Could not launch the browser, mate !!");
		} finally {
			takeScreenshot();
		}

	}

	public void enterValueById(String id, String value) {

		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(value);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the element, mate !!");
		} finally {
			takeScreenshot();
		}

	}
	
	public void enterValueByName(String name, String value) {

		try {
			driver.findElementByName(name).clear();
			driver.findElementByName(name).sendKeys(value);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the element, mate !!");
		} finally {
			takeScreenshot();
		}

	}
	
	
	public void findLeads(String xpath) {

		try {
			driver.findElementByXPath(xpath).click();
			driver.findElementByXPath(xpath).click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the element, mate !!");
		} finally {
			takeScreenshot();
		}

	}
	
	public void clickById(String id) {
		
		try {
			driver.findElementById(id).click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the element, mate !!!");
		} finally {
			takeScreenshot();
		}
	}
	
	public void printTitle() {
		
		try{
			pagetitle = driver.getTitle();
			System.out.println("The title of the page is:" +pagetitle);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to get the title of the page, mate !!");
		} finally {
			takeScreenshot();
		}
		
	}
	
	public void useAlert() {
		
		try {
			Alert MyAlert = driver.switchTo().alert();
			MyAlert.accept();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to switch to alert !!");
		} finally {
			takeScreenshot();
		}
	}

	/*public void enterPhoneNumber(String number, String value, String pass, String check){
		
		try {
			driver.findElementByName(number).click();
			driver.findElementByName(number).sendKeys(value);
			driver.findElementByClassName(pass).click();
			driver.findElementByClassName(check).click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the element, mate !!");
		} finally {
			takeScreenshot();
		}

	}
	*/
	
	public void getTextById(String newname){
		
		try{
			String name = driver.findElementById(newname).getText();
			
			System.out.println("The new first name is:" +name);
			
			if(name.equals(newname)){
				System.out.println("The name hasn't changed");
			}
			else {
				System.out.println("The name has changed");
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("There is no such element, mate !!");
		} finally {
			takeScreenshot();
		}
	}
	
	public void clickByClassName(String classname) {

		try {
			driver.findElementByClassName(classname).click();
			
		} catch (NoSuchElementException e) {
			System.out.println("There is no such element, mate !!");
		} finally {
			takeScreenshot();
		}
	}
	
	public boolean verifyTextContainsByXpath(String xpath, String text){
		boolean bReturn = false;
		String sText = driver.findElementByXPath(xpath).getText();
		if (driver.findElementByXPath(xpath).getText().trim().contains(text)){
			Reporter.reportStep("The text: "+sText+" contains the value :"+text, "PASS");
			bReturn = true;
		}else{
			Reporter.reportStep("The text: "+sText+" did not contain the value :"+text, "FAIL");
		}


		return bReturn;
	}
	
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			Reporter.reportStep("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.", "FAIL");
		}

	}
	
	public boolean clickByLink(String name) {
		boolean bReturn = false;
		try{
			driver.findElement(By.linkText(name)).click();
			Reporter.reportStep("The element with link name: "+name+" is clicked.", "PASS");

			bReturn = true;

		} catch (Exception e) {
			Reporter.reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
		return bReturn;
	}

	public void contactInfo(String contact) {
		try{
			String retrieveText = driver.findElementByClassName(contact).getText();
			System.out.println("The contact Id is:" +retrieveText);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the field");
		} finally {
			takeScreenshot();
		}
	}
	
	public void takeScreenshot() {

		try {
			File snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File(".\\images" + snapcount, ".jpeg"));
			snapcount++;
		} catch (Exception e) {
			System.out.println("Count not take the screenshot, mate !!");
		} 

	}

	public void clickByXpath(String xpath) {
		try {
			driver.findElementByXPath(xpath).click();
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the xpath");
		} finally {
			takeScreenshot();
		}

	}
	
	public void enterByXpath(String xpath, String value) {
		try {
			driver.findElementByXPath(xpath).sendKeys(value);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the xpath");
		} finally {
			takeScreenshot();
		}

	}
	
	
	public void clickByLinkText(String id) {
		try {
			driver.findElementByLinkText(id).click();
		} catch (NoSuchElementException e) {
			System.out.println("Click the link properly");
		} finally {
			takeScreenshot();
		}
	}

	public void switchToParticularWindow(String windowName) {
		try {
			windowName = driver.getWindowHandle();
			driver.switchTo().window(windowName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void switchToNewWindow() {
		try {
			Set<String> winhand = driver.getWindowHandles();
			for (String Winhand1 : winhand) {
				driver.switchTo().window(Winhand1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getCurrentWindow() {
		String currentWindow = driver.getWindowHandle();

		return currentWindow;
	}

	
	public void usingKeys(String keyin) {
		try {
			driver.findElementByClassName(keyin).sendKeys(Keys.ENTER);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find the xpath");
		} finally {
			takeScreenshot();
		}
		
	
		
	}
		
	}
	


	
	



