package threeweekplanselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingExcelScriptOne {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String testResult = "FAIL";
		
		//Using output stream to write and append
		FileOutputStream fos = new FileOutputStream(new File("./data/TestReport.xlsx"));
		
		//Create a new workbook
		XSSFWorkbook wBook = new XSSFWorkbook();
		
		//Create a worksheet
		XSSFSheet wSheet = wBook.createSheet();
		
		//Create a row
		XSSFRow rowOne = wSheet.createRow(0);
		
		//Create a cell
		XSSFCell cellOne = rowOne.createCell(0);
		
		cellOne.setCellValue("Test Case");
		
		//Create another cell
		XSSFCell cellTwo = rowOne.createCell(1);
		
		cellTwo.setCellValue("Result");
		
			
		try {
			
			FileInputStream fis = new FileInputStream(new File("./dataone/Login.xlsx"));
			
			//Open the workbook 
			XSSFWorkbook wBookTwo = new XSSFWorkbook(fis);
			
			//Go to the worksheet
			XSSFSheet wSheetOne = wBookTwo.getSheetAt(0);
			
			//Returns the number of rows in the excel sheet.
			int rowCount = wSheetOne.getLastRowNum();
			
			System.out.println("The number of rows in this sheet is:"+ " "+wSheetOne.getLastRowNum());
			
			for(int i=0; i<=rowCount; i++) {
				
				//Go to row
				XSSFRow rowTwo = wSheetOne.getRow(i);
				
				//Go to cell and read
				System.out.println("The user name is:"+" "+rowTwo.getCell(0).getStringCellValue());
				System.out.println("The password is:"+" "+rowTwo.getCell(1).getStringCellValue());
				
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NANDAKUMARSIR\\workspace\\April\\src\\main\\java\\chromedriver.exe" );
				
				//Launch the browser
				//ChromeDriver driver = new ChromeDriver();
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.navigate().to("http://linkedin.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Enter the user name and password
				driver.findElementById("login-email").click();
				driver.findElementById("login-email").sendKeys(rowTwo.getCell(0).getStringCellValue());
				driver.findElementById("login-password").click();
				driver.findElementById("login-password").sendKeys(rowTwo.getCell(1).getStringCellValue());
				
				//Click the sign in button
				driver.findElementByXPath("/html/body/div[1]/div/form/input[6]").click();
				
				Thread.sleep(3000);
				
				Actions builder = new Actions(driver);
				WebElement mouseOver = driver.findElementByXPath("/html/body/div[2]/div[1]/div/div[2]/div/ul/li[4]/a/img");
				builder.moveToElement(mouseOver).build().perform();
				
				//Click the sign out button
				driver.findElementByXPath("/html/body/div[2]/div[1]/div/div[2]/div/ul/li[4]/div/div/div[2]/ul/li[1]/div/span/span[3]/a").click();
				
				Thread.sleep(2000);
				
				driver.close();
				
				testResult = "PASS";
				
			}
				
			} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
			} finally {
				
				//Create another row
				XSSFRow rowTwo = wSheet.createRow(1);
				
				//Create another cell
				XSSFCell cellThree = rowTwo.createCell(0);
				cellThree.setCellValue("Log into LinkedIn");
				
				XSSFCell cellFour = rowTwo.createCell(1);
				cellFour.setCellValue(testResult);
				
				wBook.write(fos);
				fos.close();
				wBook.close();
				
			}
				
		}
			
		
		
	}


