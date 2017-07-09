package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchOpenTaps {

	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void launchingOpenTaps() throws IOException {

		driver.get("http://demo1.opentaps.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		try {
			FileInputStream fis = new FileInputStream(new File("./data/Login.xlsx"));

			// Open the workbook
			XSSFWorkbook Workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = Workbook.getSheetAt(0);

			int rowcount = sheet.getLastRowNum();

			for (int i = 0; i <= rowcount; i++) {
				XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(0);
				System.out.println("Username ::" + cell.getStringCellValue());
				System.out.println("Password ::" + row.getCell(1).getStringCellValue());
			}
			
			//driver.findEl
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No such file in the given path !");
		} finally {

		
		
			
		}
	}
}
