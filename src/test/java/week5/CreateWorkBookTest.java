package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateWorkBookTest {
  
  @Test
  public void createWorkSheet() throws IOException {
	
	FileOutputStream fos = new FileOutputStream(new File("./data/reports.xlsx"));
	  
	//Create a new workbook
	XSSFWorkbook wBook = new XSSFWorkbook();
	
	//Create sheet
	XSSFSheet sheet = wBook.createSheet("Report");
	
	//Create Row
	XSSFRow row = sheet.createRow(0);
	
	//Create Cell
	XSSFCell cell1 = row.createCell(0);
	
	//Name the cell
	cell1.setCellValue("Test Case");
	
	//Create Cell
	XSSFCell cell2 = row.createCell(1);
		
	//Name the cell
	cell2.setCellValue("Status");
	
	wBook.write(fos);
	
	fos.close();
	wBook.close();
	
	
	  
	  
  }
}
