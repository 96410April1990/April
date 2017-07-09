package practiceselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.jna.Platform;

/* Test Case - Interaction with data in the excel sheet
 * Browser used - Firefox 
 */

public class SampleScriptThree {
	
	XSSFCell cellOne, cellTwo, cellThree;
	CharSequence[] cellResult;
	XSSFWorkbook wBook, wBookOne;
	XSSFSheet workSheet, workSheetOne;
	int rowCount;
	XSSFRow searchResult, rowOne;
	
	@BeforeTest
	public void readExcel() throws IOException, InterruptedException {
		
		try {
			FileInputStream fis = new FileInputStream(new File("C://Users//NANDAKUMARSIR//workspace//April//Excel Sheets//youtube_search.xlsx"));
			
			wBook = new XSSFWorkbook(fis);
			workSheet = wBook.getSheetAt(0);			
			rowCount = workSheet.getLastRowNum();
			
				for (int i = 1; i <=rowCount; i++) {
					
					searchResult = workSheet.getRow(i);
					cellOne = searchResult.getCell(0);
					//cellResult = 					
					System.out.println("The search result is:"+" "+cellOne);
					
				}
			
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void accessYoutube() throws IOException, InterruptedException, WebDriverException {
		
		RemoteWebDriver driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		driver = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		
		String url = "http://youtube.com";
		//FirefoxDriver driver = new FirefoxDriver();
		
		try {
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			System.out.println("Navigated to"+" "+url);
		
			driver.findElementByXPath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/input").clear();
			driver.findElementByXPath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/input").sendKeys("Donald Trump");
			
			driver.findElementByXPath("/html/body/div[2]/div[2]/div[2]/div/div[3]/form/button").click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.close();
			
		}
		
		
	}
	
	@AfterTest
	public void writeExcel() throws IOException {
		
		FileOutputStream fos = new FileOutputStream(new File("C://Users//NANDAKUMARSIR//workspace//April//Excel Sheets//tc_one.xlsx"));
		
		wBookOne = new XSSFWorkbook();
		workSheetOne = wBookOne.createSheet("Report");
		rowOne = workSheetOne.createRow(0);
		cellTwo = rowOne.createCell(0);
		cellTwo.setCellValue("Test Case");
		cellThree = rowOne.createCell(1);
		cellThree.setCellValue("Status");
		wBookOne.write(fos);
		fos.close();		
		
	}
	

}
