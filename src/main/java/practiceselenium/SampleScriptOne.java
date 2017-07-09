package practiceselenium;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleScriptOne {
	
	@Test
	public void gmailLogin() throws IOException, InterruptedException {
		
		String status = "FAIL";
		XSSFCell cellOne = null;
		XSSFCell cellTwo = null;
				
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\NANDAKUMARSIR\\workspace\\April\\src\\main\\java\\chromedriver.exe");
				
		//Navigate to the worksheet and read the data
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\NANDAKUMARSIR\\workspace\\April\\Excel - Selenium\\Read Excel One.xlsx"));
			
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
				
				System.out.println("The username is:"+" "+row.getCell(0));
				System.out.println("The password is:"+" "+row.getCell(1));
				
			}
			
		try {
				
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.navigate().to("http://gmail.com");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("Browser launched and navigated to the URL!");
				
				//Get the user ID and password from the excel sheet 
				//driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
				driver.findElement(By.id("Email")).click();
				driver.findElement(By.id("Email")).sendKeys(cellOne.getStringCellValue());
				driver.findElement(By.id("next")).click();
				driver.findElement(By.id("Passwd")).click();
				driver.findElement(By.id("Passwd")).sendKeys(cellTwo.getStringCellValue());
				driver.findElementById("signIn").click();
			
				System.out.println("Logged In!");
				
				Thread.sleep(3000);
				
				driver.findElementByXPath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span").click();
				driver.findElementByXPath("//*[@id='gb_71']").click();
				System.out.println("Logged Out!");
				driver.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			System.out.println("That's it, mate!");
			
		}
			

	}
	
	

}
