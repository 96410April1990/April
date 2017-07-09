package week1;


import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ExerciseSix {

	//Search for results using your name on google, print the number of links and print the links
	//whose length is more than 20 characters
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//Launch the browser
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");
	
	//Maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//Enter the name to search in the search bar
	driver.findElementById("lst-ib").click();
	driver.findElementById("lst-ib").sendKeys("Rohith Nandakumar");
	
	//Click the search bar in the webpage
	driver.findElementByXPath("//*[@id='tsf']/div[2]/div[3]/center/input[1]").click();
	
	//Thread.sleep(3000);
	
	List<WebElement> printlinks = driver.findElementsByTagName("Rohith");
	
	//Print the number of links for the keyword
	System.out.println("The links for the keyword rohith nandakumar:" +printlinks);
		
	//Print the links with more than 20 characters
	for(WebElement link: printlinks) {
		System.out.println(link.isDisplayed());
		System.out.println(link.getText());
		if(link.getText().contains("Rohith") || link.getText().contains("rohith")) {
	}
	
	}
	
	List<WebElement> maxchar = driver.findElementsByTagName("Rohith");
	
	for(WebElement link: maxchar) {
		if(link.getText().length()>20) {
			System.out.println("The number of links with more than 20 characters:" +maxchar);
		}
		else
			System.out.println("Sorry mate, no results found");
	}
	
	}

}
