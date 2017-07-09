package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class ExerciseSeven {

	//Total number of drop down fields in IRCTC
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		//Launch the IRCTC website
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//To list the number of drop down fields
		List<WebElement> total = driver.findElements(By.tagName("select"));
		System.out.println("The total number of drop down fields is: "+total.size());
		
	}

}
