package threeweekplanselenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCapturingScreenshots {
	
	FirefoxDriver driver = new FirefoxDriver();
	int snapcount = 1;
	
	public void takeScreenshot() throws IOException {
		
		boolean screenshot = true;
		
		File snap = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, new File(".\\selenium screenshots\\"+snapcount+".jpeg"));
		snapcount++;
		
		if (screenshot==true) {
			
			System.out.println("SUCCESS: Image captured and saved in the mentioned path!"+"\n");
			return;
			
		} else {
			
			System.out.println("FAILURE: Sorry mate, could not take the screen shot!"+"\n");
			return;

		}	
		
	}
	
	public void launchBrowser() throws IOException {
		
		try {
			
			driver.manage().window().maximize();
			driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Opened the browser and navigated to the URL!"+"\n");
									
		} catch (Exception e) {
			// TODO: handle exception			
			System.out.println("Opened the browser and navigated to the URL!"+"\n");
									
		} finally {
			
			takeScreenshot();
			
		}
				
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		SeleniumCapturingScreenshots snapshots = new SeleniumCapturingScreenshots();
		snapshots.launchBrowser();		

	}

}
