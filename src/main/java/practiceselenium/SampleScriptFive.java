package practiceselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class SampleScriptFive {
	
	XSSFWorkbook wBook;
	XSSFSheet wSheet;
	XSSFRow wRow;
	XSSFCell wCell, wCellOne;
	int rowCount;
			
	@BeforeTest
	public void excelRead() throws IOException {
		
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Excel Sheets\\read_input.xlsx"));
			wBook = new XSSFWorkbook(fis);
			wSheet = wBook.getSheetAt(0);
			rowCount = wSheet.getLastRowNum();
						
			for (int i=1; i<=i; i++) {
				
				wRow = wSheet.getRow(i);
				wCell = wRow.getCell(0);
				wCellOne = wRow.getCell(1);
				
				System.out.println("The ID is:"+" "+wCell);
				System.out.println("The password is:"+" "+wCellOne);				
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		
		
		
		
		
	}

}
