package week3;

import org.junit.Test;

public class GoogleHandle extends WrapperGoogle {

	@Test
	public void googleControls() {
		// TODO Auto-generated method stub

		browserLaunch("chrome", "http://www.google.co.in");
		enterSomething("lst-ib", "Selenium Tutorial");
		clickSearch("btnK");
		closeBrowser("chrome");
	
	}

}
