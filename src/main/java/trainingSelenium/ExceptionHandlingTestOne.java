package trainingSelenium;

//Log into gmail and take a screenshot

public class ExceptionHandlingTestOne extends ExceptionHandlingProjectWrapper {

	public void loginGmail() throws InterruptedException {
		
		launchBrowser("firefox", "http://gmail.com");
		clickById("gmail-sign-in");
		Thread.sleep(3000);
		enterValueById("Email", "rohithkumar1990@gmail.com");
		clickById("next");
		enterValueById("Passwd", "rohith");
		clickById("signIn");
		clickByLink("Done");
		
	}
	
	
}
