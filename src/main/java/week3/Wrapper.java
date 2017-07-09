package week3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Wrapper {
	
	
	RemoteWebDriver driver;
	
	int snapcount=1;
	
	public  void Launchbrowser(String browsername,String url) {
				
		{
			 try {
				if (browsername.equalsIgnoreCase("firefox"))
				 {
					  driver = new FirefoxDriver();
					  driver.get(url);				
						driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
						
				 }
				 else if(browsername.equalsIgnoreCase("chrome"))
				 {
					 
					 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
						 driver =new ChromeDriver();
						
					 
				 }
				 driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				screenshot();	
			}
			 
			
		}
		
		
	}
	
	public void getvaluebyid(String id, String value){
		
		try {
			driver.findElementById(id).clear();
			driver.findElementById(id).sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			screenshot();	
		}
		
		
		
	}
	public void screenshot() 
	{
		try {
		File snap =driver.getScreenshotAs(OutputType.FILE);
		
		
			FileUtils.copyFile(snap, new File("./images/Snap "+snapcount+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		snapcount++;
		
		
		
	}
	
	
	}


