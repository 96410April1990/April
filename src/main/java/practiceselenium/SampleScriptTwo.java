package practiceselenium;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SampleScriptTwo {

	@Test
	public void usingExcel() {
		// TODO Auto-generated method stub
		
		String status = "FAIL";
		XSSFCell cellOne = null;
		XSSFCell cellTwo = null;
		XSSFCell cellThree = null;
		
		try {
			
			//Navigate to the worksheet and read the data
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Excel Sheets\\workbook1.xlsx"));
			
			//Open the workbook
			XSSFWorkbook wBook = new XSSFWorkbook(fis);
			
			//Navigate to the worksheet
			XSSFSheet wSheet = wBook.getSheetAt(0);
			
			//Get the row count in the excel sheet
			int rowCount = wSheet.getLastRowNum();
			
			for (int i=0; i<=rowCount; i++) {
				
				XSSFRow row = wSheet.getRow(i);
				cellOne = row.getCell(0);
				cellTwo = row.getCell(1);
				cellThree = row.getCell(2);
				
				System.out.println("My first name is:"+" "+row.getCell(0));
				System.out.println("My last name is:"+" "+row.getCell(1));
				System.out.println("My date of birth is:"+" "+row.getCell(2));
				
				Thread.sleep(3000);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("That's it, mate!");
		}

	}

}
