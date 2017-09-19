package pagefactorypageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TwitterLogoutPage {
	
	final WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id='user-dropdown-toggle']")
	public WebElement logout_Btn_One;
	@FindBy(how=How.XPATH, using="//*[@id='signout-button']/button")
	public WebElement logout_Btn_Two;
	
	public TwitterLogoutPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	

}
