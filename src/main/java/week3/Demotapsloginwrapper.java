package week3;

import org.junit.Test;

public class Demotapsloginwrapper extends Wrapperone{
	
	@Test
	public void login(){
		
	launchbrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	entertextbyid("username", "DemoSalesManager");
	entertextbyid("PASSWORD", "crmsfa");
	clickbyclassname("decorativeSubmit");
	
		
	}

}
