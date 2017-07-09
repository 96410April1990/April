package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class YoutubeNarendraModi extends OpentapsWrappers {
	
	public YoutubeNarendraModi() {
		
		if (!(verifyTitle("narendra modi - YouTube"))) {
			Reporter.reportStep("I am sorry mate, you have landed in the wrong page!", "FAIL");			
		} else {
			Reporter.reportStep("This is the right page!", "PASS");
		}
		
	}
	
	public YoutubeSearchResult clickResult() {
		
		clickByXpath("/html/body/div[2]/div[4]/div/div[5]/div/div/div/div[1]/div/div[2]/div[1]/ol/li[2]/ol/li[1]/div/div/div[2]/h3/a");
		return new YoutubeSearchResult();
		
	}
	

}
