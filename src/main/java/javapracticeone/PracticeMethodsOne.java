package javapracticeone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeMethodsOne extends CommonWebElements {

	@BeforeSuite
	public void beforeSuite() {
		// TODO Auto-generated method stub
		System.out.println("Mate, I am in before suite");		
	}

	@BeforeTest
	public void beforeTest() {
		// TODO Auto-generated method stub
		System.out.println("Mate, I am in before test");
	}

	@BeforeClass
	public void beforeClass() {
		// TODO Auto-generated method stub
		System.out.println("Mate, I am in before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("Mate, I am in before method");
	}

	@Test(enabled=true, priority=1, alwaysRun=true, invocationCount=1, description="drag and drop an element")
	public void dragAndDrop() throws IOException {
		// TODO Auto-generated method stub		
		status = FAIL;				
		try {
			System.out.println("The thread Id of the method readContent is:"+" "+Thread.currentThread().getId());
			driverFourteen = new FirefoxDriver();
			driverFourteen.manage().window().maximize();
			driverFourteen.navigate().to(jqueryUrl);
			driverFourteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			driverFourteen.switchTo().frame(driverFourteen.findElementByXPath(jqueryUiFrameXpath));
			draggable = driverFourteen.findElementById(jqueryUiDraggableId);
			//Printing the location
			System.out.println("The location before dragging is:"+" "+draggable.getLocation());
			builder = new Actions(driverFourteen);
			builder.dragAndDropBy(draggable, xoffSet, yoffSet).build().perform();
			//Printing the location
			System.out.println("The location after dragging is:"+" "+draggable.getLocation());
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			snap = driverFourteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\dragAndDrop.jpeg"));
			System.out.println("Closing the browser right away");
			driverFourteen.close();
		}
	}

	@Test(enabled=true, priority=2, dependsOnMethods={"dragAndDrop"}, alwaysRun=true, invocationCount=1, description="using right click")
	public void usingRightClick() throws IOException {
		// TODO Auto-generated method stub
		status = FAIL;
		try {
			System.out.println("The thread Id of the method usingRightClick is:"+" "+Thread.currentThread().getId());
			driverFifteen = new FirefoxDriver();
			driverFifteen.manage().window().maximize();
			driverFifteen.navigate().to(jqueryUrl);
			driverFifteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Entering the frame
			driverFifteen.switchTo().frame(driverFifteen.findElementByXPath(jqueryUiFrameXpath));
			draggable = driverFifteen.findElementById(jqueryUiDraggableId);
			//Printing the location of the web element
			System.out.println("The location of the web element is:"+" "+draggable.getLocation());
			builder = new Actions(driverFifteen);
			builder.contextClick(draggable).pause(PAUSE_THREE_MILLI_SECOND).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(TIMEOUT_TWO_MILLI_SECOND);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverFifteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\RightClick.jpeg"));
			System.out.println("Closing the browser, mate!");
			driverFifteen.close();
		}		
	}
	
	@Test(enabled=true, alwaysRun=true, dependsOnMethods={"usingRightClick"}, priority=3, description="Running in Grid")
	public void runInGrid() throws WebDriverException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverSixteen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method runInGrid is:"+" "+Thread.currentThread().getId());
			driverSixteen.manage().window().maximize();
			driverSixteen.navigate().to(jqueryUrl);
			driverSixteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			driverSixteen.switchTo().frame(driverSixteen.findElementByXPath(jqueryUiFrameXpath));
			draggable = driverSixteen.findElementById(jqueryUiDraggableId);
			//Printing the location
			System.out.println("The location before dragging is:"+" "+draggable.getLocation());
			builder = new Actions(driverSixteen);
			builder.dragAndDropBy(draggable, xoffSet, yoffSet).build().perform();
			//Printing the location
			System.out.println("The location after dragging is:"+" "+draggable.getLocation());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverSixteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\RunInGrid.jpeg"));
			System.out.println("Closing the browser, mate!");
			driverSixteen.close();
		}			
	}
	
	@Test(enabled=true, alwaysRun=true, priority=4, dependsOnMethods={"runInGrid"}, invocationCount=1, description="draggable and droppable")
	public void draggableAndDroppable() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverEighteen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method draggableAndDroppable is:"+" "+Thread.currentThread().getId());
			driverEighteen.manage().window().maximize();
			driverEighteen.navigate().to(jqueryUrlThree);
			driverEighteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Clicking droppable
			driverEighteen.findElementByXPath(jqueryUiDroppableXpath).click();
			//Entering the frame
			driverEighteen.switchTo().frame(driverEighteen.findElementByXPath(jqueryUiFrameXpath));
			draggableOne = driverEighteen.findElementByXPath(jqueryUiDraggableOneXpath);
			droppableOne = driverEighteen.findElementByXPath(jqueryUiDroppableOneXpath);
			builder = new Actions(driverEighteen);
			builder.dragAndDrop(draggableOne, droppableOne).build().perform();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverEighteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\DraggableAndDroppable.jpeg"));
			System.out.println("Closing the browser, mate!");
			driverEighteen.close();
		}
	}
	
	@Test(enabled=true, alwaysRun=true, priority=4, dependsOnMethods={"draggableAndDroppable"}, invocationCount=1, description="selectable using grid")
	public void selectableRunInGrid() throws IOException, InterruptedException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverSeventeen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method selectableRunInGrid is:"+" "+Thread.currentThread().getId());
			driverSeventeen.manage().window().maximize();
			driverSeventeen.navigate().to(jqueryUrlTwo);
			driverSeventeen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			driverSeventeen.switchTo().frame(driverSeventeen.findElementByXPath(jqueryUiFrameXpath));
			Thread.sleep(3000);
			listOne = driverSeventeen.findElementByXPath(jqueryUiSelectableOneXpath);
			listFour = driverSeventeen.findElementByXPath(jqueryUiSelectableFourXpath);
			builder = new Actions(driverSeventeen);
			builder.clickAndHold(listOne).clickAndHold(listFour).pause(PAUSE_TWO_MILLI_SECOND).release().build().perform();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverSeventeen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\selectableRunInGrid.jpeg"));
			System.out.println("Closing the browser, mate!");
			driverSeventeen.close();
		}
		
	}
		
	@Test(enabled=true, alwaysRun=true, priority=5, dependsOnMethods={"selectableRunInGrid"}, invocationCount=1, description="using parameters", parameters={"username", "password"})
	public void usingParameters(String username, String password) {
		status = FAIL;
		try {
			System.out.println("The thread Id of the method usingParameters is:"+" "+Thread.currentThread().getId());
			System.out.println("The name of the user is:"+" "+username);
			System.out.println("The password of the user is:"+" "+password);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true, alwaysRun=true, priority=6, dependsOnMethods={"usingParameters"}, invocationCount=2, description="logging into twitter using parameters", parameters={"loginId", "loginPassword"})
	public void logintoTwitterUsingParameters(String loginId, String loginPassword) throws IOException {
		//creating the file object
		fileOne = new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Object_Repo.properties");
		//creating the properties object
		propOne = new Properties();
		//creating input stream to read data
		fisOne = null;
		try {
			fisOne = new FileInputStream(fileOne);
			propOne.load(fisOne);
			fisOne.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverNineteen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"), dc);
		status = FAIL;
		try {
			//Print the thread Id
			System.out.println("The thread Id of the method logintoTwitterUsingParameters is:"+" "+Thread.currentThread());
			//Maximize the windows
			driverNineteen.manage().window().maximize();
			//Navigate to the URL
			driverNineteen.navigate().to(propOne.getProperty("twitter.url"));
			driverNineteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the credentials
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.loginpage.loginone.xpath"))).click();
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.login.username.xpath"))).clear();
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.login.username.xpath"))).sendKeys(loginId);
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.login.password.xpath"))).clear();
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.login.password.xpath"))).sendKeys(loginPassword);
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.loginpage.logintwo.xpath"))).click();
			//Click the profile name in the home page
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.homepage.clickprofile.xpath"))).click();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Click Notifications tab
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.notificationstab.clicknotifications.xpath"))).click();
			//Click the home page
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.hometab.clickhome.xpath"))).click();
			//Log out
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.logoutpage.logoutone.xpath"))).click();
			driverNineteen.findElement(By.xpath(prop.getProperty("twitter.logoutpage.logouttwo.xpath"))).click();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverNineteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\logintoTwitterUsingParameters.jpeg"));
			System.out.println("Closing the browser right away");
			driverNineteen.quit();
		}		
	}
	
	@Test(enabled=true, alwaysRun=true, priority=7, dependsOnMethods={"logintoTwitterUsingParameters"}, invocationCount=1, description="using right click one")
	public void usingRightClickOne() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverTwenty = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"), dc);
		status = FAIL;
		try {
			//Print the thread Id
			System.out.println("The thread Id of the method usingRightClickOne is:"+" "+Thread.currentThread());
			//Maximize the windows
			driverTwenty.manage().window().maximize();		
			//Navigate to the URL
			driverTwenty.navigate().to(jqueryUrlOne);
			//Apply implicit wait
			driverTwenty.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Click draggable using relative xpath
			driverTwenty.findElementByXPath(jqueryDraggableRltvXpath).click();
			//Enter the frame
			driverTwenty.switchTo().frame(driverTwenty.findElementByXPath(jqueryFrameRltvXpath));
			draggable = driverTwenty.findElementByXPath(jqueryDraggableOneRltvXpath);
			System.out.println("The location is:"+" "+draggable.getLocation());
			builder = new Actions(driverTwenty);
			builder.contextClick(draggable).pause(PAUSE_THREE_MILLI_SECOND).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverTwenty.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\usingRightClickOne.jpeg"));
			System.out.println("Closing the browser right away");
			driverTwenty.quit();
		}
		
	}
	
	@Test(enabled=true, priority=8, alwaysRun=true, dependsOnMethods={"usingRightClickOne"}, invocationCount=1, description="read data from excel sheet")
	public void useExcelInput() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverTwentyOne = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"), dc);
		status = FAIL;
		try {
			fisExcelOne = new FileInputStream(new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Data Sheets\\Excel Input Data.xlsx"));
			wbookTwo = new XSSFWorkbook(fisExcelOne);
			wsheetTwo = wbookTwo.getSheetAt(0);
			rowCount = wsheetTwo.getLastRowNum();
			for (int i = 1; i <= rowCount; i++) {
				row = wsheetTwo.getRow(i);
				cell = row.getCell(0);
				System.out.println("The user name is:"+" "+cell.getStringCellValue());
				System.out.println("The password is:"+" "+row.getCell(1).getStringCellValue());
			}
			//Print the thread Id
			System.out.println("The thread Id of the method useExcelInput is:"+" "+Thread.currentThread());
			//Launch the browser
			driverTwentyOne.manage().window().maximize();
			//Navigate to the URL
			driverTwentyOne.navigate().to(quoraUrl);
			//Implicitly wait
			driverTwentyOne.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Log into quora using the credentials
			driverTwentyOne.findElementByXPath(quoraLoginEmailXpath).clear();
			driverTwentyOne.findElementByXPath(quoraLoginEmailXpath).sendKeys(cell.getStringCellValue());
			//Enter the password
			driverTwentyOne.findElementByXPath(quoraLoginPwdXpath).clear();
			driverTwentyOne.findElementByXPath(quoraLoginPwdXpath).sendKeys(row.getCell(1).getStringCellValue());
			//Click the login
			driverTwentyOne.findElementByXPath(quoraLoginSubmitXpath).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			snap = driverTwentyOne.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\useExcelInput.jpeg"));
			System.out.println("Closing the browser right away");
			driverTwentyOne.quit();
		}		
	}
	
	@Test(enabled=true, alwaysRun=true, priority=9, dependsOnMethods={"useExcelInput"}, invocationCount=1, description="connecting to DB")
	public void useDataBase() {
		java.sql.Connection db_Conn = null;
		Statement stmt = null;
		status = FAIL;
		try {
			System.out.println("The thread Id of the method usingRightClickOne is:"+" "+Thread.currentThread());
			Class.forName(postgresql_Jdbc_Driver);
			db_Conn = DriverManager.getConnection(postgresql_Db_Url, user_name, user_password);
			stmt = db_Conn.createStatement();
			String sql_query = "SELECT id, first_name, last_name FROM public.users order by id";
			ResultSet rs_set = stmt.executeQuery(sql_query);
			 
			//Extracting data from the set
			while (rs_set.next()) {				
			 int id = rs_set.getInt("id");
			 String first_name = rs_set.getString("first_name");
			 String last_name = rs_set.getString("last_name");
				 
			//Display the values
			System.out.println("The ID is:"+" "+id+", "+"the first name is:"+" "+first_name+" "+"and the last name is:"+" "+last_name);		 
			}
			rs_set.close();
			stmt.close();
			db_Conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true, priority=10, alwaysRun=true, dependsOnMethods={"useDataBase"}, invocationCount=1, description="Inserting an entry into a table")
	public void useDataBaseOne() {
		Connection connOne = null;
		Statement stmtOne = null;
		status = FAIL;
		try {
			Class.forName(postgresql_Jdbc_Driver);
			connOne = DriverManager.getConnection(postgresql_Db_Url, user_name, user_password);
			
			//Executing a query
			stmtOne = connOne.createStatement();
			String sql = "INSERT INTO public.users(id, first_name, last_name, age, date_of_birth) VALUES(324053, 'Sabarethinam', 'Srinivasan', 27, '1989-04-10')";
			stmtOne.executeUpdate(sql);
			stmtOne.close();
			connOne.close();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmtOne!=null) {
					stmtOne.close();
				} 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (connOne!=null) {
					connOne.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}		
	}

	@AfterMethod
	public void afterMethod() {
		// TODO Auto-generated method stub
		System.out.println("Mate, i am in after method");
	}

	@AfterClass
	public void afterClass() {
		// TODO Auto-generated method stub
		System.out.println("Mate, i am in after class");
	}

	@AfterTest
	public void afterTest() {
		// TODO Auto-generated method stub
		System.out.println("Mate, i am in after test");
	}

	@AfterSuite
	public void afterSuite() {
		// TODO Auto-generated method stub
		System.out.println("Mate, i am in after suite");
	}

}
