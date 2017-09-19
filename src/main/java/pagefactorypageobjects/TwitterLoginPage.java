package pagefactorypageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwitterLoginPage {
	
	final WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3]")
	public WebElement login_Btn_One;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input")
	public WebElement login_userId;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input")
	public WebElement login_password;
	@FindBy(how=How.XPATH, using="//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]")
	public WebElement login_Btn_Two;
	
	public TwitterLoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}	

}
