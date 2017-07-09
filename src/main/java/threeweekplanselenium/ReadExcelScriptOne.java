package threeweekplanselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelScriptOne {

	public void readExcel() throws Exception {
		
		//Read data from the excel sheet
		FileInputStream fis = new FileInputStream("C:/Users/NANDAKUMARSIR/workspace/April/dataone/Login.xlsx");
		
		//Open the workbook
		XSSFWorkbook wBook = new XSSFWorkbook(fis);
		
		//Go to the sheet
		XSSFSheet wSheet = wBook.getSheetAt(0);
		
		
		
		
	}
	
	
}
