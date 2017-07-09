package week3;

import org.junit.Test;

public class WrapperLogin extends WrapperMethods {

	@Test
	public void login(){
		// TODO Auto-generated method stub
	
	launchBrowser("chrome", "http://demo1.opentaps.org/opentaps/control/main");
	enterCredentials("username", "DemoSalesManager");
	enterCredentials("password", "crmsfa");
	loggingIn("decorativeSubmit");
	logOut("decorativeSubmit");

	}

}
