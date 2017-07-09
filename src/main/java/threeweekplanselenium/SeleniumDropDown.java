package threeweekplanselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Testleaf Selenium Library\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://developer.salesforce.com/signup?d=70130000000td6N");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter the first name and last name of the user
		driver.findElementById("first_name").click();
		driver.findElementById("first_name").sendKeys("Rohith");
		
		driver.findElementById("last_name").click();
		driver.findElementById("last_name").sendKeys("Nandakumar");
		
		//Enter the email ID
		driver.findElementById("email").click();
		driver.findElementById("email").sendKeys("xyzabc@gmail.com");
		
		//Select the role in the drop down
		WebElement elements = driver.findElementById("job_role");
		Select element = new Select(elements);
		element.selectByValue("IT Manager/Executive");
		
		//Select the country in the drop down
		WebElement country = driver.findElementById("country");
		Select nation = new Select(country);
		nation.selectByIndex(9);
		
		//Enter the postal code
		driver.findElementById("postal_code").click();
		driver.findElementById("postal_code").sendKeys("600087");
		
		//Enter the company e-mail Id
		driver.findElementById("username").click();
		driver.findElementById("username").sendKeys("rnkxyz@abc.com");
		
		//Click the check box
		//driver.findElementByXPath("//*[@id='deorg_form']/div[7]/label").click();
		
		Thread.sleep(3000);
		
		System.out.println("That's it, mate!");
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
