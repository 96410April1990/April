package seleone;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingMulEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Dealing with multiple elements using FindElements
	
	//Launch the browser and open the url http://www.google.com
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");

	//Maximize the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Declaring an object named alllinks and storing the obtained result in it
	List<WebElement> alllinks = driver.findElementsByTagName("a");
	
	//Print the number of links
	System.out.println("The number of links in the google homepage is: " + alllinks.size());
	
	//Use for loop to print the visible links and the link names
	for(WebElement link: alllinks) {
		System.out.println(link.isDisplayed());
		System.out.println(link.getText());
		if (link.getText().contains("a") || link.getText().contains("A")){
	}

}

}
}