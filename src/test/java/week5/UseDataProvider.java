package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UseDataProvider {
	
	@Test
	public void usingDataProvider() throws IOException, InterruptedException  {

		FileInputStream fis = new FileInputStream(new File("./data/DataProvider.xlsx"));

		XSSFWorkbook Workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = Workbook.getSheetAt(0);

		int rowcount = sheet.getLastRowNum();

		XSSFRow sourceRow = sheet.getRow(rowcount);
		
		XSSFCell cellOne = sourceRow.getCell(0);
		
		XSSFCell cellTwo = sourceRow.getCell(1);
		
		//String username = sourceRow.getCell(0).get
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://demo1.opentaps.org");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(sheet.getRow(rowcount).getCell(0).getStringCellValue());
		
		driver.findElement(By.id("password")).sendKeys(sheet.getRow(rowcount).getCell(1).getStringCellValue());
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
