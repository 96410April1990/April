package threeweekplanselenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumWriteExcelScriptOne {
	
	public static void main(String[] args) throws IOException {
		
		String testResult;
		boolean result = true;
		WebElement incorrectPassword;
		
		FirefoxDriver driver = new FirefoxDriver();
		
		try {
			
			FileOutputStream fos = new FileOutputStream(new File("C:/Users/NANDAKUMARSIR/workspace/April/Excel - Selenium/Write Excel One.xlsx"));
			
			//Create a worksheet
			XSSFWorkbook wBook = new XSSFWorkbook();
			
			//Create a worksheet
			XSSFSheet wSheet = wBook.createSheet();
			
			//Create a row
			XSSFRow rowHeader = wSheet.createRow(0);
			
			//Create a cell
			XSSFCell cellOne = rowHeader.createCell(0);
			cellOne.setCellValue("Test Case");
			
			//Create another cell
			XSSFCell cellTwo = rowHeader.createCell(1);
			cellTwo.setCellValue("Status");
			
			driver.manage().window().maximize();
			driver.navigate().to("http://quora.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Enter the ID and password
			driver.findElementById("__w2_mPfPRL6_email").click();
			driver.findElementById("__w2_mPfPRL6_email").sendKeys("rohithkumar90@ymail.com");
			driver.findElementById("__w2_mPfPRL6_password").click();
			driver.findElementById("__w2_mPfPRL6_password").sendKeys("9123456410");
			driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div[2]/form/div[2]/div[3]/input").click();
			
			incorrectPassword = driver.findElementById("__w2_mPfPRL6_incorrect_password_error");
			
			if(result==true) {
				
				System.out.println("RESULT:"+" "+"PASS"+" "+incorrectPassword);
				testResult = "PASS";
				
			}
			else {
				
				System.out.println("RESULT:"+" "+"FAIL");
				testResult = "FAIL";
				
			}
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			driver.close();			
			
		}
			
	}
	

}
