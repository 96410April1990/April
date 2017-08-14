package javapracticeone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeMethods extends CommonWebElements implements CommonMethods  {
	
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

	@Override
	public void beforeMethod() {
		// TODO Auto-generated method stub
		System.out.println("Mate, I am in before method");		
	}
	
	@Test(enabled=true, priority=1, alwaysRun=true, invocationCount=1, timeOut=300000, description="Interacting with drop down", groups="group2")
	public void usingDropDown() throws IOException, InterruptedException {		
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverOne = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		/*fosExcelOne = new FileOutputStream(new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Data Sheets\\Excel Output Data.xlsx"));
		//Creating a workbook
		wbookOne = new XSSFWorkbook();
		//Creating a worksheet
		wsheetOne = wbookOne.createSheet("Report");
		//Creating a row
		rowHeaderOne = wsheetOne.createRow(0);
		//Creating a cell
		cellOne = rowHeaderOne.createCell(0);
		cellOne.setCellValue("Test Case Name");
		cellTwo = rowHeaderOne.createCell(1);
		cellTwo.setCellValue("Status");*/
		try {
			System.out.println("The thread Id of the method usingDropDown is:"+" "+Thread.currentThread().getId());
			/*driverOne = new FirefoxDriver();*/
			driverOne.manage().window().maximize();
			driverOne.get(salesForceUrl);
			driverOne.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the details
			driverOne.findElementByXPath(salesForceEnterFirstName).clear();
			driverOne.findElementByXPath(salesForceEnterFirstName).sendKeys("Rohith");
			driverOne.findElementByXPath(salesForceEnterLastName).clear();
			driverOne.findElementByXPath(salesForceEnterLastName).sendKeys("Nandakumar");
			driverOne.findElementByXPath(salesForceEnterEmail).clear();
			driverOne.findElementByXPath(salesForceEnterEmail).sendKeys("rohithkumar90@ymail.com");
			//Interacting with dropdown
			role = driverOne.findElementByXPath(salesForceSelectRoleOne);
			selectRole = new Select(role);
			selectRole.selectByIndex(selectRoleOne);
			driverOne.findElementByXPath(salesForceEnterCompany).clear();
			driverOne.findElementByXPath(salesForceEnterCompany).sendKeys("Cognizant Technology Solutions");
			country = driverOne.findElementByXPath(salesForceSelectCountryOne);
			selectCountry = new Select(country);
			selectCountry.selectByValue(selectCountryOne);
			driverOne.findElementByXPath(salesForceEnterPostalCode).clear();
			driverOne.findElementByXPath(salesForceEnterPostalCode).sendKeys("600087");
			status = PASS;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverOne.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\salesforce.jpeg"));
			System.out.println("Closing the browser right away");
			driverOne.quit();
			/*rowHeaderTwo = wsheetOne.createRow(1);
			cellThree = rowHeaderTwo.createCell(0);
			cellThree.setCellValue("usingDropDown");
			cellFour = rowHeaderTwo.createCell(1);
			cellFour.setCellValue(status);
			wbookOne.write(fosExcelOne);*/						
		}		
	}

	@Test(priority=2, enabled=true, alwaysRun=true, invocationCount=1, description="Java program to find out whether a number is prime or not", groups="group1", dependsOnMethods={"usingDropDown"})
	public void checkPrimeNumber() throws IOException {
		// TODO Auto-generated method stub		
		status = FAIL;
		try {
			System.out.println("The thread Id of the method checkPrimeNumber is:"+" "+Thread.currentThread().getId());
			for (int i = 2; i <= n; i++) {				
				if (i%m==0) {
					System.out.println(i+" "+"is not prime");
					flag = 1;
				}
				else {
					System.out.println(i+" "+"is prime");
				}				
			}
			status = PASS;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			/*rowHeaderThree = wsheetOne.createRow(2);
			cellFive = rowHeaderThree.createCell(0);
			cellFive.setCellValue("checkPrimeNumber");
			cellSix = rowHeaderThree.createCell(1);
			cellSix.setCellValue(status);
			wbookOne.write(fosExcelOne);*/			
		}							
	}
	
	@Test(priority=3, enabled=true, alwaysRun=true, invocationCount=1, dependsOnMethods="checkPrimeNumber", description="To print the even numbers between 100 and 200", groups="group2")
	public void printEvenNumber() throws IOException {		
		//Printing the even numbers alone
		status = FAIL;
		try {
			System.out.println("The thread Id of the method printEvenNumber is:"+" "+Thread.currentThread().getId());
			for (j = 100; j <= l; j++) {
				if (j%k==0) {
					System.out.println("That's an even number, mate"+" "+j);
				} 	
			}
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			/*rowHeaderFour = wsheetOne.createRow(3);
			cellSeven = rowHeaderFour.createCell(0);
			cellSeven.setCellValue("printEvenNumber");
			cellEight = rowHeaderFour.createCell(1);
			cellEight.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}
	
	@Test(priority=4, enabled=true, alwaysRun=true, invocationCount=1, dependsOnMethods="printEvenNumber", description="Using various types of loops", groups="group1")
	public void usingLoops() throws InterruptedException, IOException {		
		status = FAIL;
		try {
			System.out.println("The thread Id of the method usingLoops is:"+" "+Thread.currentThread().getId());
			//for loop
			for (o = 1; o <= 10; o++) {
				System.out.println(o);
			}
			Thread.sleep(TIMEOUT_TWO_MILLI_SECOND);
			//traversing the elements in a list
			List<String> arrList = new ArrayList<String>();
			arrList.add("Rohith");
			arrList.add("Rags");
			arrList.add("Vaibhav");
			arrList.add("Sai");
			System.out.println("The elements in the array list are:"+" ");
			for (String arrListOne : arrList) {
				System.out.println(arrListOne);
			}
			Thread.sleep(TIMEOUT_TWO_MILLI_SECOND);
			//Using for loop for collections
			for (int p = 0; p < arrList.size(); p++) {
				System.out.println("The elements in the array list are:"+" "+arrList.get(p));
			}
			Thread.sleep(TIMEOUT_TWO_MILLI_SECOND);
			//Using while loop to print the elements in the array list
			q=0;
			while (q < arrList.size()) {
				System.out.println("The elements in the array list are:"+" "+arrList.get(q));
				q++;
			}
			status = PASS;	
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			/*rowHeaderFive = wsheetOne.createRow(4);
			cellEight = rowHeaderFive.createCell(0);
			cellEight.setCellValue("usingLoops");
			cellNine = rowHeaderFive.createCell(1);
			cellNine.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}	
	
	@Test(enabled=true, priority=5, dependsOnMethods={"usingLoops"}, invocationCount=1, alwaysRun=true, description="Fibonacci series", groups="group1")
	public void fibonacciSeries() throws IOException {		
		int i1=0, i2=1, n1, c, count=10;		
		status = FAIL;
		try {
			System.out.println("The thread Id of the method fibonacciSeries is:"+" "+Thread.currentThread().getId());
			System.out.println(i1+" "+i2);
			for (c = 2; c < count; c++) {
				n1=i1+i2;
				System.out.println(" "+n1);
				i1=i2;
				i2=n1;
			}
			status = PASS;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			/*rowHeaderSix = wsheetOne.createRow(5);
			cellEleven = rowHeaderSix.createCell(0);
			cellEleven.setCellValue("fibonacciSeries");
			cellTwelve = rowHeaderSix.createCell(1);
			cellTwelve.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}
	
	@Test(enabled=true, alwaysRun=true, priority=6, dependsOnMethods={"fibonacciSeries"}, invocationCount=1, description="Access twitter using object repository", timeOut=2500000, expectedExceptions=WebDriverException.class, groups="group1")
	public void useTwitterUsingObjectRepo() throws IOException, FileNotFoundException, InterruptedException {
		//Creating the file object
		file = new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Object_Repo.properties");
		//Creating the properties object
		prop = new Properties();
		//Creating input stream to read data
		fis = null;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
			fis.close();
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
		driverTwo = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method useTwitterUsingObjectRepo is:"+" "+Thread.currentThread().getId());
			/*driverTwo = new FirefoxDriver();*/
			driverTwo.manage().window().maximize();
			//Navigating to the URL
			driverTwo.navigate().to(prop.getProperty("twitter.url"));
			driverTwo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Entering the user name and password
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.loginpage.loginone.xpath"))).click();
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.login.username.xpath"))).clear();
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.login.username.xpath"))).sendKeys("rohithkumar90@ymail.com");
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.login.password.xpath"))).clear();
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.login.password.xpath"))).sendKeys("rohith");
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.loginpage.logintwo.xpath"))).click();
			//Click the profile name in the home page
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.homepage.clickprofile.xpath"))).click();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Click Notifications tab
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.notificationstab.clicknotifications.xpath"))).click();
			//Click the home page
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.hometab.clickhome.xpath"))).click();
			//Log out
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.logoutpage.logoutone.xpath"))).click();
			driverTwo.findElement(By.xpath(prop.getProperty("twitter.logoutpage.logouttwo.xpath"))).click();
			status = PASS;
		} catch (WebDriverException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverTwo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\twitterPage.jpeg"));
			System.out.println("Closing the browser right away");
			driverTwo.quit();
			/*rowHeaderSeven = wsheetOne.createRow(6);
			cellThirteen = rowHeaderSeven.createCell(0);
			cellThirteen.setCellValue("useTwitterUsingObjectRepo");
			cellFourteen = rowHeaderSeven.createCell(1);
			cellFourteen.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=7, alwaysRun=true, dependsOnMethods={"useTwitterUsingObjectRepo"}, invocationCount=1, description="Printing the links with your name", groups="group2")
	public void printLinks() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverThree = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method printLinks is:"+" "+Thread.currentThread().getId());
			/*driverThree = new FirefoxDriver();*/
			driverThree.manage().window().maximize();
			driverThree.navigate().to(googleUrl);
			driverThree.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Entering the name in the search bar
			driverThree.findElementByXPath(enterNameGoogleUrlFirefox).clear();
			driverThree.findElementByXPath(enterNameGoogleUrlFirefox).sendKeys("Rohith Nandakumar");
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Clicking the search button
			driverThree.findElementByXPath(googleSearchButtonFirefox).click();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Storing all the links pertaining to the search results in a list
			searchLinks = driverThree.findElementsByTagName("Rohith");
			//Printing the number of links in the list
			System.out.println("The number of links pertaining to the search list in the list is:"+" "+searchLinks.size());
			//Printing the links that have the name Rohith
			for (WebElement printLink : searchLinks) {
				System.out.println(printLink.isDisplayed());
				System.out.println(printLink.isEnabled());
				if (printLink.getText().contains("Rohith") || printLink.getText().contains("rohith") ) {
					
				} 
			}			
			searchLinksOne = driverThree.findElementsByTagName("Rohith");			
			//Printing the links that have more than 20 characters
			for (WebElement maxChar : searchLinksOne) {
				if (maxChar.getText().length() > 20) {
					System.out.println("The links that have more than 20 characters:"+" "+searchLinks);
				} else {
					System.out.println("Sorry mate, no such link found");
				}
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverThree.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\print_links.jpeg"));
			System.out.println("Closing the browser right away");
			driverThree.quit();
			/*rowHeaderEight = wsheetOne.createRow(7);
			cellFifteen = rowHeaderEight.createCell(0);
			cellFifteen.setCellValue("printLinks");
			cellSixteen = rowHeaderEight.createCell(1);
			cellSixteen.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=8, alwaysRun=true, dependsOnMethods={"printLinks"}, invocationCount=1, description="counting the number of dropdown entries in the page", groups="group1")
	public void countDropdown() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverFour = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method countDropdown is:"+" "+Thread.currentThread().getId());
			/*driverFour = new FirefoxDriver();*/
			driverFour.manage().window().maximize();
			driverFour.navigate().to(itctcUrl);
			driverFour.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Storing all the web elements pertaining to the dropdown fields in the webpage
			countDropdown = driverFour.findElements(By.tagName("select"));
			//Print the number of dropdown fields in the webpage
			System.out.println("The number of dropdown fields in the irctc webpage is:"+" "+countDropdown.size());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverFour.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\count_dropdown.jpeg"));
			System.out.println("Closing the browser right away");
			driverFour.quit();
			/*rowHeaderNine = wsheetOne.createRow(8);
			cellSeventeen = rowHeaderNine.createCell(0);
			cellSeventeen.setCellValue("countDropdown");
			cellEighteen = rowHeaderNine.createCell(1);
			cellEighteen.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=9, alwaysRun=true, dependsOnMethods={"countDropdown"}, invocationCount=1, description="print all the links in google.com", groups="group2")
	public void printAllLinks() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverFive = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method printAllLinks is:"+" "+Thread.currentThread().getId());
			/*driverFive = new FirefoxDriver();*/
			driverFive.manage().window().maximize();
			driverFive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driverFive.navigate().to(googleUrl);
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Storing all the web elements pertaining to all the links in a list
			googleLinks = driverFive.findElementsByTagName("a");
			//Printing all the links
			for (WebElement googleLinksOne : googleLinks) {
				System.out.println("The links in google.com are:"+" "+googleLinksOne);
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverFive.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\printAlllinks.jpeg"));
			System.out.println("Closing the browser right away");
			driverFive.quit();
			/*rowHeaderTen = wsheetOne.createRow(9);
			cellNineteen = rowHeaderTen.createCell(0);
			cellNineteen.setCellValue("printAllLinks");
			cellTwenty = rowHeaderTen.createCell(1);
			cellTwenty.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}	
	
	@Test(enabled=true, alwaysRun=true, priority=10, dependsOnMethods={"printAllLinks"}, invocationCount=1, description="using all methods", groups="group1")
	public void useAllMethods() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverSix = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method useAllMethods is:"+" "+Thread.currentThread().getId());
			/*driverSix = new FirefoxDriver();*/
			driverSix.manage().window().maximize();
			driverSix.navigate().to(gmailUrl);
			driverSix.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Get the location of the element
			gmailGetLink = driverSix.findElement(By.xpath(gmailTitleXpath));
			//Print the location of the element
			System.out.println("The location of the web element is:"+" "+gmailGetLink.getLocation());
			//Get the name of the link
			System.out.println("The name of the link is:"+" "+gmailGetLink.getText());
			//Get the current url
			System.out.println("The current Url is:"+" "+driverSix.getCurrentUrl());
			//Get the size
			System.out.println("The size is:"+" "+gmailGetLink.getSize());
			//Get the attribute
			System.out.println("The attribute is:"+" "+gmailGetLink.getAttribute("href"));
			//Get the color
			System.out.println("The color is:"+" "+gmailGetLink.getCssValue("color"));
			//Get the tagname
			System.out.println("The tag name is:"+" "+gmailGetLink.getTagName());
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverSix.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\useAllMethods.jpeg"));
			System.out.println("Closing the browser right away");
			driverSix.quit();
			/*rowHeaderEleven = wsheetOne.createRow(10);
			cellTwentyone = rowHeaderEleven.createCell(0);
			cellTwentyone.setCellValue("useAllMethods");
			cellTwentytwo = rowHeaderEleven.createCell(1);
			cellTwentytwo.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=11, alwaysRun=true, dependsOnMethods={"useAllMethods"}, invocationCount=1, description="Handling alerts", expectedExceptions=UnhandledAlertException.class, groups="group2")
	public void handlingAlerts() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverSeven = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method handlingAlerts is:"+" "+Thread.currentThread().getId());
			/*driverSeven = new FirefoxDriver();*/
			driverSeven.manage().window().maximize();
			driverSeven.navigate().to(w3schoolsUrl);
			driverSeven.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Entering the frame
			driverSeven.switchTo().frame(w3schoolFrameId);
			//Click the try it button
			driverSeven.findElementByXPath(w3schoolTryitButtonXpath).click();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			w3schoolAlert = driverSeven.switchTo().alert();
			snap = driverSeven.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingAlertsOne.jpeg"));
			w3schoolAlert.accept();
			System.out.println("The text in the alert box is:"+" "+driverSeven.findElementByXPath(w3schoolAlertText).getText());
			status = PASS;
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverSeven.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingAlertsTwo.jpeg"));
			System.out.println("Closing the browser right away");
			driverSeven.quit();
			/*rowHeaderTwelve = wsheetOne.createRow(11);
			cellTwentythree = rowHeaderTwelve.createCell(0);
			cellTwentythree.setCellValue("handlingAlerts");
			cellTwentyfour = rowHeaderTwelve.createCell(1);
			cellTwentyfour.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}
	
	@Test(enabled=true, priority=12, alwaysRun=true, dependsOnMethods={"handlingAlerts"}, description="handling frames", invocationCount=1, groups="group1")
	public void handlingFrame() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverEight = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method handlingFrame is:"+" "+Thread.currentThread().getId());
			/*driverEight = new FirefoxDriver();*/
			driverEight.manage().window().maximize();
			driverEight.navigate().to(jqueryUrl);
			driverEight.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(TIMEOUT_FIVE_MILLI_SECOND);
			//Entering the frame
			driverEight.switchTo().frame(driverEight.findElementByClassName(jqueryFrameClassname));
			//Print the content within the frame
			if (jqueryDraggableId.contains(jqueryDraggableText)) {
				System.out.println("Entered the frame and the text inside the frame is:"+" "+jqueryDraggableText);
				snap = driverEight.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingFramesOne.jpeg"));			
			} else {
				System.out.println("Sorry mate, could not enter the frame!");
			}
			//Come out of the frame
			driverEight.switchTo().defaultContent();
			if (jqueryOutsideFrameText.contains(jqueryHomePageText)) {
				System.out.println("You have come out of the frame, mate!"+" "+"The text message in the home page is:"+" "+jqueryHomePageText);
				snap = driverEight.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingFramesTwo.jpeg"));
			} else {
				System.out.println("Sorry mate, you still haven't come out of the frame!");
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverEight.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingFramesThree.jpeg"));
			System.out.println("Closing the browser right away");
			driverEight.quit();
			/*rowHeaderThirteen = wsheetOne.createRow(12);
			cellTwentyfour = rowHeaderThirteen.createCell(0);
			cellTwentyfour.setCellValue("handlingFrame");
			cellTwentyfive = rowHeaderThirteen.createCell(1);
			cellTwentyfive.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=13, alwaysRun=true, dependsOnMethods={"handlingFrame"}, invocationCount=1, description="Handling prompts", expectedExceptions=UnhandledAlertException.class, groups="group2") 
	public void handlingPrompts() throws InterruptedException, NoSuchElementException, IOException, UnhandledAlertException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverNine = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method handlingPrompts is:"+" "+Thread.currentThread().getId());
			/*driverNine = new FirefoxDriver();*/
			driverNine.manage().window().maximize();
			driverNine.navigate().to(w3schoolsPromptUrl);
			driverNine.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Enter the frame
			System.out.println("Entering the frame, mate!");
			driverNine.switchTo().frame(w3schoolFrameId);
			if (w3schoolHandlePromptTextXpath.equalsIgnoreCase(handlingPromptsText)) {
				System.out.println("Entered the frame mate!"+" "+"The text inside the frame is:"+" "+handlingPromptsText);
				snap = driverNine.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingPromptsOne.jpeg"));
			} else {
				System.out.println("Nah mate, you have not entered the frame just yet!");
			}
			tryItButton = driverNine.findElementByXPath(w3schoolTryitButtonXpath);
			//Click the try it button if enabled
			if (tryItButton.isDisplayed() || tryItButton.isEnabled()) {
				System.out.println("The try it button inside the frame is enabled!");
				System.out.println("Clicking the try it button, mate");
				driverNine.findElementByXPath(w3schoolTryitButtonXpath).click();
				/*Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
				snap = driverNine.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingPromptsTwo.jpeg"));*/
			} else {
				System.out.println("Sorry mate, looks like the try it button is not enabled or displayed!");
			}
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);			
			//Switch to Alert, enter the user's name and accept the alert
			w3schoolAlert = driverNine.switchTo().alert();
			System.out.println(w3schoolAlert.getText());
			w3schoolAlert.sendKeys("Rohith Nandakumar");
			Thread.sleep(TIMEOUT_FOUR_MILLI_SECOND);
			w3schoolAlert.accept();
			Thread.sleep(TIMEOUT_FIVE_MILLI_SECOND);
			snap = driverNine.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingPromptsThree.jpeg"));
			if (w3schoolHandlePrmoptVerifyTextXpath.equalsIgnoreCase(handlingPromptsVerifyText)) {
				System.out.println("The text is:"+" "+handlingPromptsVerifyText);
			} else {
				System.out.println("sorry mate, unable to read the text!");
			}
			//Come out of the frame
			driverNine.switchTo().defaultContent();
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverNine.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingPromptsFour.jpeg"));
			System.out.println("Closing the browser right away");
			driverNine.quit();
			/*rowHeaderFourteen = wsheetOne.createRow(13);
			cellTwentysix = rowHeaderFourteen.createCell(0);
			cellTwentysix.setCellValue("handlingPrompts");
			cellTwentyseven = rowHeaderFourteen.createCell(1);
			cellTwentyseven.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, alwaysRun=true, priority=14, dependsOnMethods={"handlingPrompts"}, invocationCount=1, description="Handling windows", groups="group1")
	public void handlingWindows() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverTen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method handlingWindows is:"+" "+Thread.currentThread().getId());
			/*driverTen = new FirefoxDriver();*/
			driverTen.manage().window().maximize();
			driverTen.navigate().to(popupTestUrl);
			driverTen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Printing the window handle of the parent window
			System.out.println("The window handle of the parent window is:"+" "+driverTen.getWindowHandle());
			//Storing the window handle of the primary window in a string variable
			popupTestPrimaryWindow = driverTen.getWindowHandle();
			//Click the second multi pop-up link
			driverTen.findElementByXPath(multiPopUpTwoXpath).click();
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);			
			popupTestWindowHandles = driverTen.getWindowHandles();
			snap = driverTen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingWindowsOne.jpeg"));
			//Printing the number of windows
			System.out.println("The number of child windows is:"+" "+popupTestWindowHandles.size());
			//Pass control to the new window
			for (String secondWindow : popupTestWindowHandles) {
				driverTen.switchTo().window(secondWindow);
			}
			//Printing the window handle of the second window
			System.out.println("The window handle of the second window is:"+" "+driverTen.getWindowHandle());
			secondWindowHandle = driverTen.getWindowHandle();
			//Pass control to the new window
			popupTestWindowHandlesOne = driverTen.getWindowHandles();
			//Printing the number of windows
			System.out.println("The number of child windows is:"+" "+popupTestWindowHandlesOne.size());
			//Pass control to the new window
			for (String thirdWindow : popupTestWindowHandlesOne) {
				driverTen.switchTo().window(thirdWindow);
			}
			//Printing the window handle of the third window
			System.out.println("The window handle of the third window is:"+" "+driverTen.getWindowHandle());
			thirdWindowHandle = driverTen.getWindowHandle();
			//Pass control to the new window
			popupTestWindowHandlesTwo = driverTen.getWindowHandles();
			//Printing the number of windows
			System.out.println("The number of child windows is:"+" "+popupTestWindowHandlesTwo.size());
			//Pass control to the new window
			for (String fourthWindow : popupTestWindowHandlesTwo) {
				driverTen.switchTo().window(fourthWindow);
			}
			//Printing the window handle of the fourth window
			System.out.println("The window handle of the fourth window is:"+" "+driverTen.getWindowHandle());
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			driverTen.close();
			//Switch control to the previous window
			/*driverTen.switchTo().window(thirdWindowHandle);
			//Closing this window
			driverTen.close();*/
			//Switch control to the previous window
			/*driverTen.switchTo().window(secondWindowHandle);
			//Closing this window
			driverTen.close();*/
			//Switching control to the parent window
			driverTen.switchTo().window(popupTestPrimaryWindow);
			status = PASS;			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverTen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\handlingWindowsTwo.jpeg"));
			System.out.println("Closing the browser right away");
			driverTen.quit();
			/*rowHeaderFifteen = wsheetOne.createRow(14);
			cellTwentyeight = rowHeaderFifteen.createCell(0);
			cellTwentyeight.setCellValue("handlingWindows");
			cellTwentynine = rowHeaderFifteen.createCell(1);
			cellTwentynine.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}
	
	@Test(enabled=true, priority=15, alwaysRun=true, dependsOnMethods={"handlingWindows"}, invocationCount=1, description="Counting the number of frames in a webpage", groups="group2")
	public void countFrames() throws IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverEleven = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method countFrames is:"+" "+Thread.currentThread().getId());
			/*driverEleven = new FirefoxDriver();*/
			driverEleven.manage().window().maximize();
			driverEleven.navigate().to(countingFramesUrl);
			driverEleven.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Printing the number of frames in the webpage
			List<WebElement> frameOne = driverEleven.findElements(By.tagName("iframe"));
			System.out.println("The number of frames in the main page is:"+" "+frameOne.size());
			//Switch to the frames within the frame
			driverEleven.switchTo().frame(driverEleven.findElementByXPath(jqueryFrameOne));
			//Print the number of frames within this frame
			List<WebElement> childFrameOne = driverEleven.findElements(By.tagName("iframe"));
			System.out.println("The number of frames within this frame is:"+" "+childFrameOne.size());
			//Switch to the main frame
			driverEleven.switchTo().defaultContent();
			//Switch to the next frame
			driverEleven.switchTo().frame(driverEleven.findElementByXPath(jqueryFrameTwo));
			//Print the number of frames within this frame
			List<WebElement> childFrameTwo = driverEleven.findElements(By.tagName("iframe"));
			System.out.println("The number of frames within this frame is:"+" "+childFrameTwo.size());
			status = PASS;
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			snap = driverEleven.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CountFramesOne.jpeg"));
			System.out.println("Closing the browser right away");
			driverEleven.quit();
			/*rowHeaderSixteen = wsheetOne.createRow(15);
			cellTwentynine = rowHeaderSixteen.createCell(0);
			cellTwentynine.setCellValue("countFrames");
			cellThirty = rowHeaderSixteen.createCell(1);
			cellThirty.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		 
	}
	
	@Test(enabled=true, alwaysRun=true, priority=16, dependsOnMethods={"countFrames"}, invocationCount=1, description="closing the frames in the web page", groups="group1")
	public void closeFrames() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverTwelve = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method closeFrames is:"+" "+Thread.currentThread().getId());
			/*driverTwelve = new FirefoxDriver();*/
			driverTwelve.manage().window().maximize();
			driverTwelve.navigate().to(closeFramesUrl);
			driverTwelve.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Close the west frame
			driverTwelve.findElementByXPath(jqueryWestFrameXpath).click();
			snap = driverTwelve.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CloseFramesOne.jpeg"));
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Close the east frame
			driverTwelve.findElementByXPath(jqueryEastFrameXpath).click();
			snap = driverTwelve.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CloseFramesTwo.jpeg"));
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Entering the frame
			driverTwelve.switchTo().frame(driverTwelve.findElementByXPath(jqueryCenterFrameXpath));
			//Closing the west frame
			driverTwelve.findElementByXPath(jqueryWestFrameOneXpath).click();
			snap = driverTwelve.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CloseFramesThree.jpeg"));
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			//Closing the east frame
			driverTwelve.findElementByXPath(jqueryEastFrameOneXpath).click();
			snap = driverTwelve.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CloseFramesFour.jpeg"));
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			System.out.println("Closed all the frames, mate!");
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverTwelve.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\CloseFramesFive.jpeg"));
			System.out.println("Closing the browser right away");
			driverTwelve.quit();
			/*rowHeaderSeventeen = wsheetOne.createRow(16);
			cellThirtyone = rowHeaderSeventeen.createCell(0);
			cellThirtyone.setCellValue("closeFrames");
			cellThirtytwo = rowHeaderSeventeen.createCell(1);
			cellThirtytwo.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, priority=17, alwaysRun=true, dependsOnMethods={"closeFrames"}, invocationCount=1, description="read the content within a frame", groups="group2")
	public void readContent() throws InterruptedException, IOException {
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driverThirteen = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			System.out.println("The thread Id of the method readContent is:"+" "+Thread.currentThread().getId());
			/*driverThirteen = new FirefoxDriver();*/
			driverThirteen.manage().window().maximize();
			driverThirteen.navigate().to(jqueryUrlOne);
			driverThirteen.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//Clicking draggable in the home page
			driverThirteen.findElementByXPath(jqueryUiDraggableXpath).click();
			//Entering the frame
			driverThirteen.switchTo().frame(driverThirteen.findElementByXPath(jqueryUiFrameXpath));
			Thread.sleep(TIMEOUT_FIVE_MILLI_SECOND);
			//Verifying the text inside the frame
			if (driverThirteen.findElementByXPath(jqueryUiDraggableContentXpath).getText().equalsIgnoreCase(jqueryUiDraggableText)) {
				System.out.println("The text inside the text box is:"+" "+jqueryUiDraggableText);				
			} else {
				System.out.println("Sorry mate, could not read the text inside the box");
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			snap = driverThirteen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap, new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\selenium screenshots two\\readContent.jpeg"));
			System.out.println("Closing the browser right away");
			driverThirteen.close();
			/*rowHeaderEighteen = wsheetOne.createRow(17);
			cellThirtythree = rowHeaderEighteen.createCell(0);
			cellThirtythree.setCellValue("readContent");
			cellThirtyfour = rowHeaderEighteen.createCell(1);
			cellThirtyfour.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(enabled=true, alwaysRun=true, dependsOnMethods={"readContent"}, invocationCount=1, priority=18, description="print stars", groups="group1")
	public void starPattern() throws IOException {
		status = FAIL;
		try {
			System.out.println("The thread Id of the method starPattern is:"+" "+Thread.currentThread().getId());
			for (startPatternI = 0; startPatternI < 5; startPatternI++) {
				for (startPatternJ = 0; startPatternJ <= startPatternI; startPatternJ++) {
					System.out.print("* ");
				}				
				System.out.println();
			}
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			/*rowHeaderNineteen = wsheetOne.createRow(18);
			cellThirtyfive = rowHeaderNineteen.createCell(0);
			cellThirtyfive.setCellValue("starPattern");
			cellThirtysix = rowHeaderNineteen.createCell(1);
			cellThirtysix.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}
	}
	
	@Test(enabled=true, priority=19, alwaysRun=true, dependsOnMethods={"starPattern"}, invocationCount=1, description="using wrapper methods", groups="group2")
	public void usingWrapperMethods() throws InterruptedException, IOException {
		status = FAIL;
		try {
			System.out.println("The thread Id of the method usingWrapperMethods is:"+" "+Thread.currentThread().getId());
			launchBrowser(firefoxBrowser, gmailUrl);
			clickByXpath(gmailSignInButtonXpath);
			clickByXpath(gmailEmailXpath);
			enterByXpath(gmailEmailXpath, gmailEmailId);
			clickByXpath(gmailEmailNextButtonOneXpath);
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			clickByXpath(gmailPasswordXpath);
			enterByXpath(gmailPasswordXpath, gmailPassword);
			clickByXpath(gmailEmailNextButtonTwoXpath);
			Thread.sleep(TIMEOUT_THREE_MILLI_SECOND);
			clickByXpath(gmailEmailSignOutButtonOneXpath);
			clickByXpath(gmailEmailSignOutButtonTwoXpath);			
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Closing the browser right away");
			quitBrowser();
			/*rowHeaderTwenty = wsheetOne.createRow(19);
			cellThirtyseven = rowHeaderTwenty.createCell(0);
			cellThirtyseven.setCellValue("usingWrapperMethods");
			cellThirtyeight = rowHeaderTwenty.createCell(1);
			cellThirtyeight.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}
	
	@Test(dataProvider="useData", enabled=true, priority=20, alwaysRun=true, dependsOnMethods={"usingWrapperMethods"}, invocationCount=1, description="using data provider", groups="group1")
	public void dataUsingDataProvider(String man, String woman) throws IOException {
		status = FAIL;
		try {
			System.out.println("The thread Id of the method dataUsingDataProvider is:"+" "+Thread.currentThread().getId());
			System.out.println("The members in the family are:"+" "+man+" "+"and"+" "+woman);
			status = PASS;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			/*rowHeaderTwentyone = wsheetOne.createRow(20);
			cellThirtynine = rowHeaderTwentyone.createCell(0);
			cellThirtynine.setCellValue("dataUsingDataProvider");
			cellFourty = rowHeaderTwentyone.createCell(1);
			cellThirtynine.setCellValue(status);
			wbookOne.write(fosExcelOne);*/
		}		
	}		
	
	@DataProvider(name="myFamily")
	public Object[][] useData() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "Rohith";
		data[0][1] = "Ananya";
		
		data[1][0] = "Harsha";
		data[1][1] = "Tanvi";
		
		return data;		
	}
	
	@Test(enabled=false, priority=4, /*dependsOnMethods={"printEvenNumber"},*/ invocationCount=2, expectedExceptions=StaleElementReferenceException.class)
	public void getAllLinks() throws StaleElementReferenceException, IOException {		
		dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		status = FAIL;
		try {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
			/*driver = new FirefoxDriver();*/
			driver.get(googleUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath(enterNameGoogleUrl).clear();
			driver.findElementByXPath(enterNameGoogleUrl).sendKeys("Rohith Nandakumar");
			driver.findElementByXPath(googleSearchButtonFirefox).click();
			//Use List to store multiple web elements
			allLinks = driver.findElementsByTagName("a");
			//Print the number of links in the page
			System.out.println("The number of links in the page:"+" "+allLinks.size());
			//Using foreach loop to print all the elements
			for (WebElement printLinks : allLinks) {
				System.out.println(printLinks.isDisplayed());
				System.out.println(printLinks.getText());
				if (printLinks.getText().contains("a") || printLinks.getText().contains("A")) {
					System.out.println("SUCCESS");
					System.out.println("\n"+printLinks.getSize());
				}
				else {
					System.out.println("That's it, mate!");
				}				
			}
			status = PASS;
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Closing the browser right away");
			driver.quit();
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
	public void afterSuite() throws IOException {
		// TODO Auto-generated method stub		
		System.out.println("Mate, i am in after suite");
		wbookOne.close();
		fosExcelOne.close();
	}	
}
