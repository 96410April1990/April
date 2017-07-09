package testngpractice;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import java.lang.NullPointerException;

public class TestNGChapterSeven extends TestNGChapterSix {
	
	@Test(dependsOnMethods={"findLead"}, expectedExceptions={NullPointerException.class})
	public void deleteLead() throws Exception {
		
		driver.findElementByXPath("//*[@id='ext-gen890']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='ext-gen598']").click();
		throw new NullPointerException();
		
	}

}
