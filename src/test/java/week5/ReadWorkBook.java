package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadWorkBook {
	
  @Test
  public void readWorkSheet() throws IOException {
	
	  FileInputStream fis = new FileInputStream(new File("./data/Login.xlsx"));
	  
	  //Open the workbook
	  XSSFWorkbook Workbook = new XSSFWorkbook(fis);
	  
	  XSSFSheet sheet = Workbook.getSheetAt(0);
	  
	  int rowcount = sheet.getLastRowNum();
	  
	  for (int i = 0; i <= rowcount; i++) {
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		System.out.println("Username ::" + cell.getStringCellValue());
		System.out.println("Password ::" + row.getCell(1).getStringCellValue());
	}
	  
	 
  }
}
