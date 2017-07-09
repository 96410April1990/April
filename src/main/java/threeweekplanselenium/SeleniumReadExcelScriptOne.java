package threeweekplanselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumReadExcelScriptOne {

	@Test
	public void readExcel() throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		String testResult = "FAIL";
		
		try {
			
			FileInputStream fis = new FileInputStream(new File("C:/Users/NANDAKUMARSIR/workspace/April/Excel - Selenium/Read Excel One.xlsx"));
			
			//Open the workbook
			XSSFWorkbook wbook = new XSSFWorkbook(fis);
			
			//Open the worksheet
			XSSFSheet wsheet = wbook.getSheetAt(0);
			
			int sheetRowCount = wsheet.getLastRowNum();
			
			//Print the number of rows in the excel sheet
			System.out.println("The number of rows in the excel sheet is:"+" "+sheetRowCount);
			
			for (int i = 1; i <=sheetRowCount; i++) {
				
				XSSFRow row = wsheet.getRow(i);
				XSSFCell cell = row.getCell(0);
			
				System.out.println("The user name is:"+cell.getStringCellValue());
				System.out.println("The password is:"+row.getCell(1).getStringCellValue());
				
				Thread.sleep(3000);
				
				//Navigate to the URL
				driver.get("http://gmail.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);				
				
				//Log into gmail.com
				driver.findElementById("Email").click();
				driver.findElementById("Email").sendKeys(cell.getStringCellValue());
				driver.findElementById("next").click();
				driver.findElementById("Passwd").click();
				driver.findElementById("Passwd").sendKeys(row.getCell(1).getStringCellValue());		
				driver.findElementById("signIn").click();
				
				//click the done button
				driver.findElementByXPath("/html/body/div[1]/div[3]/div/div/div/div/div[1]/div[3]/div[2]").click();
				
				Thread.sleep(3000);
						
			}
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
						
		} finally {
			
			//Click sign out and close the browser
			driver.findElementByXPath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
			driver.findElementByXPath("/html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[2]/a").click();	
			
			driver.close();
			
			testResult = "PASS";
			
		}
		
		System.out.println("The test result is:"+" "+testResult);
		
	}

}
