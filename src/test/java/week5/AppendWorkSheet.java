package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AppendWorkSheet {
  
  @Test
  public void appendExistingSheet() throws IOException {
  
	  FileInputStream fis = new FileInputStream(new File("./data/reports.xlsx"));
	  
	  XSSFWorkbook Workbook = new XSSFWorkbook(fis);

	  XSSFSheet sheet = Workbook.getSheetAt(0);

	  int rowcount = sheet.getLastRowNum();
	  
	  for (int i = 0; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
	  }
	  
	  FileOutputStream fos = new FileOutputStream(new File("./data/reports.xlsx"));
	  
	  XSSFRow row = sheet.createRow(1);
		
	  XSSFCell cell1 = row.createCell(0);
		
	  cell1.setCellValue("Test Case");
		
	  XSSFCell cell2 = row.createCell(1);
			
	  cell2.setCellValue("Status");
  
	  Workbook.write(fos);
		
	  fis.close();
	  fis.close();
	  
  }
}
