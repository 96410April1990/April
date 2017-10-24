package fitnessetests;

import com.thoughtworks.selenium.DefaultSelenium;

public class FirstClass {
	
	DefaultSelenium selenium;
	
	public FirstClass(String host, int port, String browser, String baseUrl) {
		
		this.selenium = new DefaultSelenium(host, port, browser, baseUrl);
		this.selenium.start();
		
	}
	
	public boolean open(String url) {
		
		this.selenium.open(url);
		return true;
		
	}
	
	public boolean type(String locator, String value) {
		
		boolean findElement = this.selenium.isElementPresent(locator);
		if (findElement) {
			this.selenium.type(locator, value);
		} else {
			System.out.println("Sorry mate, unable to find the element!");
		}
		return findElement;
		
	}
	
	public boolean click(String locator) {
		
		boolean verifyClickElement = this.selenium.isElementPresent(locator);
		if (verifyClickElement) {
			this.selenium.click(locator);
		} else {
			System.out.println("Sorry mate, unable to find the element!");
		}
		return verifyClickElement;
		
	}
	
	public boolean verifyResultPage(String locator) {
		
		boolean verifyPage = this.selenium.isElementPresent(locator);
		return verifyPage;
		
	}
	
	public boolean closeBrowser() {
		
		this.selenium.close();
		return true;
		
	}
	
	public boolean stopIt() {
		
		this.selenium.stop();
		return true;
		
	}
	
}
