package trainingSelenium;

import org.junit.Test;

public class LearningWrappersOne extends LearningWrappers {
	
	@Test
	public void googleSearch() {
		
		launchBrowser("firefox", "http://www.google.com");
		enterValue("//*[@id='lst-ib']", "Rohith Nandakumar", "btnG");
		
	}
		
}
