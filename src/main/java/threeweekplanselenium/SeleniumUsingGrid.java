package threeweekplanselenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumUsingGrid {

	public static void main(String[] args) throws IOException, InterruptedException, WebDriverException {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://10.228.25.31:4444/wd/hub"),dc);
		
		driver.navigate().to("http://google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='lst-ib']").sendKeys("Rohith Nandakumar");
		driver.findElementByXPath("//*[@id='sblsbb']/button/span").click();
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
