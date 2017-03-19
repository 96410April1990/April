package practiceone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CommonSteps extends CommonVariables {
	
	String sfUrl = "https://developer.salesforce.com/signup?d=70130000000td6N";
	String w3Url = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	String jqUrlOne = "http://jqueryui.com/draggable/";
	String jqUrlTwo = "http://jqueryui.com/droppable/";
	String frameUrlOne = "http://layout.jquery-dev.com/demos/iframes_many.html";
	String closeFrameUrl = "http://layout.jquery-dev.com/demos/iframe_local.html";
	String popupUrl = "http://popuptest.com/";
	String frameUrlTwo = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	String linkedinUrl = "https://linkedin.com/";
	String twitterUrl = "https://twitter.com";
	String first_name_TXT = "//*[@id='first_name']";
	String second_name_TXT = "//*[@id='last_name']";
	String email_TXT = "//*[@id='email']";
	String select_role_TXT = "//*[@id='job_role']";
	int run_time_vbl;
	String status;
	WebElement role_select;
	Select role_select_one;
	String company_TXT = "//*[@id='company']";
	String select_country_TXT = "//*[@id='country']";
	WebElement country_select;
	Select country_select_one;
	String postal_code_TXT = "//*[@id='postal_code']";
	String user_name_TXT = "//*[@id='username']";
	String select_agrmnt = "//*[@id='deorg_form']/div[5]/label";
	String frame_Enter = "//*[@id='iframeResult']";
	String contain_TXT = "/html/body/p";
	String contain_Alrt_TXT = "//*[@id='demo']";
	String display_TXT = "Click the button to display an alert box:";
	String display_Alert_TXT = "Hello Rohith Nandakumar! How are you today?";
	String click_Button = "/html/body/button";
	String display_TXT_One = "/html/body/p";
	WebDriverWait wait;
	Alert myAlert;
	Alert myAlert_One;
	String frame_Enter_One = "//*[@id='content']/iframe";
	String read_Text_Draggable = "//*[@id='draggable']";
	List<WebElement> count_Frames_One;
	List<WebElement> count_Frames_Two;
	List<WebElement> count_Frames_Three;
	List<WebElement> count_Frames_Four;
	String frame_One = "/html/body/iframe[1]";
	String frame_Two = "/html/body/iframe[2]";
	String frame_Three = "/html/body/iframe[3]";
	String close_Frame_One = "//*[@id='childIframe']";
	String close_West_Frame = "/html/body/div[2]/p/button";
	String close_East_Frame = "/html/body/div[3]/p/button";
	String close_West_Frame_One = "/html/body/div[1]/p[1]/button";
	String close_East_Frame_One = "/html/body/div[2]/p/button";
	String drag_Drop_Frame = "//*[@id='content']/iframe";
	String mult_ppup_link = "/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[2]/b/a";
	String acpt_Alert = "/html/body/button";
	String primary_Wdow_Hndl;
	String child_Wdow_Hndl;
	WebElement drag;
	WebElement drop;
	String draggable = "//*[@id='draggable']";
	String droppable = "//*[@id='droppable']";
	Actions builder;
	Set<String> window_Hndl_One;
	Set<String> window_Hndl_Two;
	File snap;
	File src_file;
	FileInputStream fis;
	Properties pro;
	Object[][] loginDetails;
	String linkedin_LoginID = "/html/body/div/main/div/div[1]/div/form/input[1]";
	String linkedin_LoginPwd = "/html/body/div/main/div/div[1]/div/form/input[2]";
	String linkedin_SignBtn = "/html/body/div/main/div/div[1]/div/form/input[3]";
	String linkedin_EnterCmpy = "/html/body/div[2]/div[1]/div/div[1]/form/fieldset/div[2]/span/span[1]/input";
	String linkedin_Srch = "/html/body/div[2]/div[1]/div/div[1]/form/fieldset/button";
	String linkedin_HomeBtn = "/html/body/div[2]/div[1]/div/div[1]/h2/a";
	WebElement linkedin_MseOver;
	String linkedin_MseOverOne = "/html/body/div[3]/div[1]/div/div[2]/div/ul/li[4]/a/img";
	Actions linkedin_action;
	String linkedin_SignOut;
	WebElement draggableOne;
	Actions builder_draggable;
	FileOutputStream fos;
	FileInputStream fisOne;
	XSSFWorkbook wBook;
	XSSFSheet wSheet;
	XSSFRow rowHeader;
	XSSFCell cell;
	XSSFCell cellOne;
	XSSFWorkbook wBooktwo;
	XSSFWorkbook wBookthree;
	XSSFSheet wSheettwo;
	XSSFSheet wSheetthree;
	XSSFSheet wSheetfour;
	XSSFRow rowHeadertwo;
	XSSFRow rowHeaderthree;
	XSSFCell cellTwo;
	XSSFCell cellThree;
	XSSFCell cellFour;
	XSSFCell cellFive;
	XSSFCell cellSix;
	FileOutputStream fosOne;
	XSSFWorkbook wBookfour;
	XSSFSheet wSheetfive;
	XSSFRow rowHeaderfour;
	int rowCount;
	int rowCountOne;
				
	/* @method name - interaction with dropdown using salesforce.com
	 * @created date - 01/14/2017
	 * @author - Rohith Nandakumar
	 */
	
	@Test(enabled=true, alwaysRun=true, priority=1, invocationCount=1, threadPoolSize=1, description="Interacting with dropdown")
	public void int_with_dropdown() throws InterruptedException, IOException {
		// TODO Auto-generated method stub		
		
		FirefoxDriver driver = new FirefoxDriver();
		status = PASS;		
		try {
			driver.get(sfUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath(first_name_TXT).sendKeys("Rohith");
			driver.findElementByXPath(second_name_TXT).sendKeys("Nandakumar");
			driver.findElementByXPath(email_TXT).sendKeys("rohithkumar90@ymail.com");
			role_select = driver.findElementByXPath(select_role_TXT);
			role_select_one = new Select(role_select);
			role_select_one.selectByIndex(3);	
			driver.findElementByXPath(company_TXT);
			country_select = driver.findElementByXPath(select_country_TXT);
			country_select_one = new Select(country_select);
			country_select_one.selectByValue("IN");
			driver.findElementByXPath(postal_code_TXT).sendKeys("600087");
			driver.findElementByXPath(user_name_TXT).sendKeys("rohithkumar90@xyz.com");
			wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(select_agrmnt)));
			driver.findElementByXPath(select_agrmnt).click();
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());			
		} finally {
			snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/dropdown_interaction.jpeg"));
			driver.quit();
			if (driver.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}			
		}
	}

	/* @method name - handling alerts
	 * @created date - 01/15/2017
	 * @author - Rohith Nandakumar
	 */
	
	@Test(enabled=true, dependsOnMethods={"int_with_dropdown"}, priority=2, description="Handling alerts", timeOut=45000)
	public void hlng_Alerts_W3s() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/chromedriver.exe");
		FirefoxDriver browser = new FirefoxDriver();
		status = PASS;				
		try {
			browser.get(w3Url);
			browser.manage().window().maximize();
			browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Entering the frame
			browser.switchTo().frame(browser.findElementByXPath(frame_Enter));
			if (browser.findElementByXPath(contain_TXT).getText().contains(display_TXT)) {
				System.out.println("Entered the frame. Please go ahead!");
			} else {
				System.out.println("Negative. Could not enter the frame!");
			}
			//click the button within the frame
			browser.findElementByXPath(click_Button).click();
			//Switch to alert
			myAlert = browser.switchTo().alert();
			myAlert.accept();
			Thread.sleep(10000);
			System.out.println(browser.findElementByXPath(display_TXT_One).getText());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browser.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/alerts_one.jpeg"));
			browser.quit();
			if (browser.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}			
		}
	}
	
	 /*@method name - handling draggable
	 * @created date - 01/24/2017
	 * @author - Rohith Nandakumar*/ 	 
	
	@Test(enabled=true, priority=3, dependsOnMethods={"hlng_Alerts_W3s"}, description="Handling draggable")
	public void hndl_Draggable() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driverone = new FirefoxDriver();
		boolean enter_frame;
		String read_Draggable;
		status = PASS;
		try {
			driverone.navigate().to(jqUrlOne);
			driverone.manage().window().maximize();
			driverone.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			driverone.switchTo().frame(driverone.findElementByXPath(frame_Enter_One));
			read_Draggable = driverone.findElementByXPath(read_Text_Draggable).getText();
			if (read_Draggable.contains("Drag me around")) {
				enter_frame = true;
				System.out.println("Entered the frame, mate!");
			} else {
				enter_frame = false;
				System.out.println("Could not enter the frame, mate!");
			}
			driverone.switchTo().defaultContent();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = driverone.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/handle_draggable.jpeg"));
			driverone.quit();
			if (driverone.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
	}

	 /*@method name - handling droppable
	 * @created date - 01/24/2017
	 * @author - Rohith Nandakumar */	 
	
	@Test(enabled=true, priority=4, dependsOnMethods={"hndl_Draggable"}, description="Handling droppable")
	public void hndl_Droppable() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/chromedriver.exe");
		FirefoxDriver browserone = new FirefoxDriver();
		status = PASS;
		try {
			browserone.navigate().to(jqUrlTwo);
			browserone.manage().window().maximize();
			browserone.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			browserone.switchTo().frame(browserone.findElementByXPath(frame_Enter_One));
			//Get the webelement to be dragged and store it in a variable
			drag = browserone.findElementByXPath(draggable);
			//Print the location of draggable
			System.out.println("The location of drag is:"+" "+drag.getLocation());
			//Get the webelement to be dropped and store it in a variable
			drop = browserone.findElementByXPath(droppable);
			//Print the location of droppable
			System.out.println("The location of drop is:"+" "+drop.getLocation());
			builder = new Actions(browserone);
			builder.dragAndDrop(drag, drop).build().perform();
			//Print the new locations of drag and drop
			System.out.println(drag.getLocation()+" "+drop.getLocation());
			builder.dragAndDrop(drop, drag).build().perform();		
			System.out.println(drag.getLocation()+" "+drop.getLocation());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browserone.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/handle_droppable.jpeg"));
			browserone.quit();
			if (browserone.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
	}

	 /*@method name - counting frames
	 * @created date - 01/26/2017
	 * @author - Rohith Nandakumar */	 
	
	@Test(enabled=true, dependsOnMethods={"hndl_Droppable"}, description="Count the frames", priority=5)
	public void count_Frames() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver drivertwo = new FirefoxDriver();
		status = PASS;
		try {
			drivertwo.navigate().to(frameUrlOne);
			drivertwo.manage().window().maximize();
			drivertwo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Count the number of frames
			count_Frames_One = drivertwo.findElementsByTagName("iframe");
			System.out.println("The number of frames is:"+" "+count_Frames_One.size());
			//Enter each frame and check if there are any other frames
			drivertwo.switchTo().frame(drivertwo.findElementByXPath(frame_One));
			count_Frames_Two = drivertwo.findElementsByTagName("iframe");
			System.out.println("The number of frames inside frame_One is:"+" "+count_Frames_Two.size());
			drivertwo.switchTo().defaultContent();
			drivertwo.switchTo().frame(drivertwo.findElementByXPath(frame_Two));
			count_Frames_Three = drivertwo.findElementsByTagName("iframe");
			System.out.println("The number of frames inside frame_Two is:"+" "+count_Frames_Three.size());
			drivertwo.switchTo().defaultContent();
			drivertwo.switchTo().frame(drivertwo.findElementByXPath(frame_Three));
			count_Frames_Four = drivertwo.findElementsByTagName("iframe");
			System.out.println("The number of frames inside frame_Three is:"+" "+count_Frames_Four.size());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = drivertwo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/count_frames.jpeg"));
			drivertwo.quit();
			if (drivertwo.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}			
		}
	}

	 /*@method name - closing frames
	 * @created date - 01/26/2017
	 * @author - Rohith Nandakumar*/	 
	
	@Test(enabled=true, priority=6, dependsOnMethods={"count_Frames"}, description="Closing frames")
	public void close_Frames() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/chromedriver.exe");
		FirefoxDriver browserthree = new FirefoxDriver();
		status = PASS;
		try {
			browserthree.navigate().to(closeFrameUrl);
			browserthree.manage().window().maximize();
			browserthree.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			browserthree.switchTo().frame(browserthree.findElementByXPath(close_Frame_One));
			browserthree.findElementByXPath(close_West_Frame).click();
			browserthree.findElementByXPath(close_East_Frame).click();
			browserthree.switchTo().defaultContent();
			browserthree.findElementByXPath(close_West_Frame_One);
			browserthree.findElementByXPath(close_East_Frame_One);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browserthree.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/close_frames.jpeg"));
			browserthree.quit();
			if (browserthree.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
	}
	
	 /*@method name - switching windows
	 * @created date - 01/26/2017
	 * @author - Rohith Nandakumar*/	 
	
	@Test(enabled=true, priority=7, dependsOnMethods={"close_Frames"}, description="Handling popup")
	public void hndl_popup() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driverthree = new FirefoxDriver();
		status = PASS;
		try {
			driverthree.navigate().to(popupUrl);
			driverthree.manage().window().maximize();
			driverthree.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Print the parent window's handle
			System.out.println("Parent window handle:"+" "+driverthree.getWindowHandle());
			//Click the multiple popup link
			driverthree.findElementByXPath(mult_ppup_link).click();
			primary_Wdow_Hndl = driverthree.getWindowHandle();
			//Pass control to the child windows
			window_Hndl_One = driverthree.getWindowHandles();
			System.out.println(window_Hndl_One.size());
			for (String wndHndlOne : window_Hndl_One) {
				driverthree.switchTo().window(wndHndlOne);
			}
			System.out.println("Child window handle:"+" "+driverthree.getWindowHandle());
			child_Wdow_Hndl = driverthree.getWindowHandle();
			//Pass control to the other child window
			window_Hndl_Two = driverthree.getWindowHandles();
			System.out.println(window_Hndl_Two.size());
			for (String wnHndlTwo : window_Hndl_Two) {
				driverthree.switchTo().window(wnHndlTwo);
			}
			System.out.println("Child window 2 handle:"+" "+driverthree.getWindowHandle());
			driverthree.close();
			//Handing over control to the parent window
			driverthree.switchTo().window(primary_Wdow_Hndl);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = driverthree.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/handle_popup.jpeg"));
			driverthree.quit();
			if (driverthree.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
	}

	 /*@method name - accepting alerts
	 * @created date - 01/28/2017
	 * @author - Rohith Nandakumar*/ 	 
	
	@Test(enabled=true, dependsOnMethods={"hndl_popup"}, priority=8, description="Accept alerts")
	public void acpt_alerts() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/chromedriver.exe");
		FirefoxDriver browserfour = new FirefoxDriver();
		status = PASS;
		try {
			browserfour.navigate().to(frameUrlTwo);
			browserfour.manage().window().maximize();
			browserfour.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			browserfour.switchTo().frame(browserfour.findElementByXPath(frame_Enter));
			if (browserfour.findElementByXPath(contain_TXT).getText().contains(display_TXT)) {
				System.out.println("Entered the frame. Please go ahead!");
			} else {
				System.out.println("Negative. Could not enter the frame!");
			}
			browserfour.findElementByXPath(acpt_Alert).click();
			//Accept the alert
			myAlert_One = browserfour.switchTo().alert();
			myAlert_One.sendKeys("Rohith Nandakumar");
			myAlert_One.accept();
			if (browserfour.findElementByXPath(contain_Alrt_TXT).getText().contains(display_Alert_TXT)) {
				System.out.println(display_Alert_TXT);
			} else {
				System.out.println("Negative!");
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browserfour.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/accept_alerts.jpeg"));
			browserfour.quit();
			if (browserfour.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
	}
	
	/** @methodName - Log into linkedin.com
	 *  @createdDate - 05/02/2017 
	 *  @author - Rohith Nandakumar 
	 */
	
	@Test(dataProvider="linkedin credentials", enabled=true, priority=10, dependsOnMethods={"hndl_run_time_exception"}, description="Log into linkedin")
	public void linkedin_Login(String loginId, String loginPassword) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driverfour = new FirefoxDriver();
		status = PASS;
		try {
			driverfour.navigate().to(linkedinUrl);
			driverfour.manage().window().maximize();
			driverfour.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the user id and password
			System.out.println("The user ID to be entered is:"+" "+loginId+" "+"and the password to be entered is:"+" "+loginPassword);
			driverfour.findElementByXPath(linkedin_LoginID).clear();
			driverfour.findElementByXPath(linkedin_LoginID).sendKeys(loginId);
			driverfour.findElementByXPath(linkedin_LoginPwd).clear();
			driverfour.findElementByXPath(linkedin_LoginPwd).sendKeys(loginPassword);
			driverfour.findElementByXPath(linkedin_SignBtn).click();
			driverfour.findElementByXPath(linkedin_EnterCmpy).clear();
			driverfour.findElementByXPath(linkedin_EnterCmpy).sendKeys("Cognizant");
			driverfour.findElementByXPath(linkedin_Srch).click();	
			//Click the home button
			driverfour.findElementByXPath(linkedin_HomeBtn).click();
			//Sign out
			linkedin_MseOver = driverfour.findElementByXPath(linkedin_MseOverOne);
			linkedin_action = new Actions(driverfour);
			linkedin_action.moveToElement(linkedin_MseOver).build().perform();
			driverfour.findElementByXPath(linkedin_SignOut).click();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = driverfour.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/linkedin_login.jpeg"));
			driverfour.quit();
			if (driverfour.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}		
	}
	
	/* @method name - Handle run time exceptions
	 * @created date - 01/29/2017
	 * @author - Rohith Nandakumar 
	 */
	
	@Test(enabled=true, dependsOnMethods={"acpt_alerts"}, priority=9, description="Handling run time exception")
	public void hndl_run_time_exception() throws ArithmeticException {
		// TODO Auto-generated method stub
		
		status = PASS; 
		try {
			run_time_vbl = 100;
			System.out.println(run_time_vbl/0);	
			status = PASS;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("Mate, i am in catch!");
		} finally {
			System.out.println("Mate, i am in final!");
		}	
	}
	
	/** @methodName - Data provider
	 *  @createdDate - 05/02/2017
	 *  @author - Rohith Nandakumar
	 */
	
	@DataProvider(name="linkedin credentials")
	public Object[][] getValue() {
		
		loginDetails = new Object[1][2];
		loginDetails[0][0] = "rohithkumar90@ymail.com";
		loginDetails[0][1] = "9940096410abcd1990";
		
		return loginDetails;
	}
	
	/** @methodName - using object properties
	 *  @createdDate - 07/02/2017
	 *  @author - Rohith Nandakumar 
	 */
	
	@Test(enabled=true, dependsOnMethods={"hndl_run_time_exception"}, priority=10, description="using object repository")
	public void using_object_repository() throws IOException {
		
		FirefoxDriver browserfive = new FirefoxDriver();
		status = PASS;
		try {
			src_file = new File(".Object_Repo.properties");
			fis = new FileInputStream(src_file);
			pro = new Properties();
			pro.load(fis);
			System.out.println("Properties file loaded");
			browserfive.navigate().to(twitterUrl);
			browserfive.manage().window().maximize();
			browserfive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			browserfive.findElement(By.xpath(pro.getProperty("twitter.login.btnone.xpath"))).click();
			browserfive.findElement(By.xpath(pro.getProperty("twitter.login.username.xpath"))).sendKeys("rohithkumar90@ymail.com");
			browserfive.findElement(By.xpath(pro.getProperty("twitter.login.password.xpath"))).sendKeys("9940096410abcd1990");
			browserfive.findElement(By.xpath(pro.getProperty("twitter.login.btntwo.xpath"))).click();
			Thread.sleep(3000);
			browserfive.findElement(By.xpath(pro.getProperty("twitter.logout.btnone.xpath"))).click();
			browserfive.findElement(By.xpath(pro.getProperty("twitter.logout.logout.xpath"))).click();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browserfive.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/twitter_login.jpeg"));
			browserfive.quit();
			if (browserfive.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
		
	}
	
	/** @MethodName - Using Drag and Drop
	 *  @CreatedDate - 02/25/2017
	 *  @author - Rohith Nandakumar 
	 *  @throws IOException 
	 */
	
	@Test(enabled=true, dependsOnMethods={"using_object_repository"}, priority=11, description="Using drag and drop")
	public void using_Drag_and_Drop() throws IOException {
		
		FirefoxDriver driverfive = new FirefoxDriver();
		status = PASS;
		try {
			driverfive.navigate().to(jqUrlOne);
			driverfive.manage().window().maximize();
			driverfive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Switch to frame
			driverfive.switchTo().frame(driverfive.findElementByXPath(drag_Drop_Frame));
			draggableOne = driverfive.findElementByXPath(draggable);
			System.out.println("The location of draggable is:"+" "+draggableOne.getLocation());
			builder_draggable = new Actions(driverfive);
			builder_draggable.dragAndDropBy(draggableOne, 100, 100).build().perform();
			System.out.println("The location of draggable is:"+" "+draggableOne.getLocation());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = driverfive.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/dragAndDrop.jpeg"));
			driverfive.quit();
			if (driverfive.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
		
	}
	
	/** @MethodName - Right click
	 *  @CreatedDate - 02/26/2017
	 *  @author - Rohith Nandakumar
	 *  @throws IOException 
	 */
	
	@Test(enabled=true, dependsOnMethods={"using_Drag_and_Drop"}, priority=12, description="Using Right Click")
	public void using_Right_Click() throws IOException {
		
		FirefoxDriver browserSix = new FirefoxDriver();
		status = PASS;
		try{
			browserSix.navigate().to(jqUrlOne);
			browserSix.manage().window().maximize();
			browserSix.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			browserSix.switchTo().frame(browserSix.findElementByXPath(frame_Enter_One));
			draggableOne = browserSix.findElementByXPath(draggable);
			System.out.println("The location of draggable is:"+" "+draggableOne.getLocation());
			builder_draggable = new Actions(browserSix);		
			builder_draggable.contextClick(draggableOne).pause(3000).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();			
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = browserSix.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/usingRightClick.jpeg"));
			browserSix.quit();
			if (browserSix.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
		
	}
	
	/** @MethodName - Run In Grid
	 *  @CreatedDate - 03/05/2017
	 *  @author - Rohith Nandakumar 
	 * @throws IOException 
	 */
	
	@Test(enabled=true, priority=13, dependsOnMethods={"using_Right_Click"}, description="running a test using grid")
	public void run_using_Grid() throws IOException {
		
		RemoteWebDriver driversix;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driversix = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"),dc);
		status = PASS;
		try {
			driversix.navigate().to(jqUrlOne);
			driversix.manage().window().maximize();
			driversix.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Switch to frame
			driversix.switchTo().frame(driversix.findElementByXPath(drag_Drop_Frame));
			draggableOne = driversix.findElementByXPath(draggable);
			System.out.println("The location of draggable is:"+" "+draggableOne.getLocation());
			builder_draggable = new Actions(driversix);
			builder_draggable.dragAndDropBy(draggableOne, 100, 100).build().perform();
			System.out.println("The location of draggable is:"+" "+draggableOne.getLocation());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			snap = driversix.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/dragAndDrop_usingGrid.jpeg"));
			driversix.quit();
			if (driversix.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}
		}
		
	}
	
	/** @MethodName - Write in excel sheet
	 *  @CreatedDate - 02/22/2017
	 *  @author - Rohith Nandakumar
	 */
	
	@Test(enabled=true, dependsOnMethods={"run_using_Grid"}, priority=14, description="writing in excel sheet")
	public void write_excel() throws IOException {
		
		status = PASS;
		try {
			fosOne = new FileOutputStream("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/resultOne.xlsx");
			wBookfour = new XSSFWorkbook();
			wSheetfive = wBookfour.createSheet("Report");
			rowHeaderfour = wSheetfive.createRow(0);
			cellFive = rowHeaderfour.createCell(0);		
			cellFive.setCellValue("Test Case Name");
			cellSix = rowHeaderfour.createCell(1);
			cellSix.setCellValue("Status");
			wBookfour.write(fosOne);
			status = PASS;			
		} catch (Exception e) {
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			wBookfour.close();
		}
		
	}
	
	/** @MethodName - Using excel sheet
	 * 	@CreatedDate - 08/02/2017
	 *  @author - Rohith Nandakumar
	 */
	
	@Test(enabled=true, dependsOnMethods={"write_excel"}, priority=15, description="Logging into twitter using excel")
	public void using_excel_sheet() throws IOException {
		
		fos = new FileOutputStream(new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/TestReport.xlsx"));
		wBook = new XSSFWorkbook();
		wSheet = wBook.createSheet("Report");
		rowHeader = wSheet.createRow(0);
		cell = rowHeader.createCell(0);
		cell.setCellValue("Test Case");
		cellOne = rowHeader.createCell(1);
		cellOne.setCellValue("Status");
		
		FirefoxDriver driverfive = new FirefoxDriver();
		status = PASS;
		try {
			fis = new FileInputStream(new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/TestResult.xlsx"));
			wBooktwo = new XSSFWorkbook(fis);
			wSheettwo = wBooktwo.getSheetAt(0);
			rowCount = wSheettwo.getLastRowNum();
			for (int i = 1; i <= rowCount; i++) {
				rowHeadertwo = wSheettwo.getRow(i);
				System.out.println("The username is:"+" "+rowHeadertwo.getCell(0).getStringCellValue());
				System.out.println("The password is:"+" "+rowHeadertwo.getCell(1).getStringCellValue());
				driverfive.navigate().to(twitterUrl);
				driverfive.manage().window().maximize();
				driverfive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driverfive.findElement(By.xpath(pro.getProperty("twitter.login.btnone.xpath"))).click();
				driverfive.findElement(By.xpath(pro.getProperty("twitter.login.username.xpath"))).sendKeys(rowHeadertwo.getCell(0).getStringCellValue());
				driverfive.findElement(By.xpath(pro.getProperty("twitter.login.password.xpath"))).sendKeys(rowHeadertwo.getCell(1).getStringCellValue());
				driverfive.findElement(By.xpath(pro.getProperty("twitter.login.btntwo.xpath"))).click();
				Thread.sleep(3000);
				driverfive.findElement(By.xpath(pro.getProperty("twitter.logout.btnone.xpath"))).click();
				driverfive.findElement(By.xpath(pro.getProperty("twitter.logout.logout.xpath"))).click();
				snap = driverfive.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/twitter_login_usingExcel.jpeg"));
				status = PASS;
			}			
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			rowHeadertwo = wSheetthree.createRow(1);
			cellTwo = rowHeadertwo.createCell(0);
			cellTwo.setCellValue("Log into twitter");
			cellThree = rowHeadertwo.createCell(1);
			cellThree.setCellValue(status);
			wBook.write(fos);
			fos.close();
			wBook.close();
			driverfive.quit();
			if (driverfive.toString().contains("null")) {
				System.out.println("The browser window is closed!");
			} else {
				System.out.println("Negative, the browser window is not closed!");
			}			
		}		
	}
	
	@Test(enabled=true, dependsOnMethods={"using_excel_sheet"}, priority=16, description="Getting input from excel sheet")
	public void read_Excel() throws IOException {
		
		status = PASS;
		fisOne = new FileInputStream(new File("C:/Users/NANDAKUMARSIR/workspace/April/src/main/java/practiceone/PracticeOne/Excel_Input.xlsx"));
		wBookthree = new XSSFWorkbook(fisOne);
		wSheetfour = wBookthree.getSheetAt(0);
		rowCountOne = wSheetfour.getLastRowNum();
		try {
			for (int i=0; i<=rowCountOne; i++) {
				rowHeaderthree = wSheetfour.getRow(i);
				cellFour = rowHeaderthree.getCell(0);
				System.out.println("The username is:"+" "+cellFour.getStringCellValue());
				System.out.println("The password is:"+" "+rowHeaderthree.getCell(1).getStringCellValue());			
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			status = WARNING;
			e.printStackTrace();
			System.out.println("An error occurred:"+" "+e.getMessage());
		} finally {
			fisOne.close();
			wBookthree.close();
		}
	}	
	
	
	
	
}
