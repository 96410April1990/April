package cucumberStepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javapracticeone.CommonVariables;
import javapracticeone.CommonWebElements;

public class TestSteps extends CommonWebElements {
	
	FirefoxDriver driver = new FirefoxDriver();
	
	@Given("^The User verifies if the Login page is displayed$")
	public void The_User_verifies_if_the_Login_page_is_displayed() throws Throwable {
		status = PASS;
	    try {
			driver.manage().window().maximize();
			driver.navigate().to(twitterUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Verifying if the login page is displayed or not");
			if (driver.findElementByTagName(twitterLoginPageText).getText().contains("What’s happening?")) {
				System.out.println("The Login page is displayed!");
			} else {
				System.out.println("The Login page is not displayed!");
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The User verifies if the Login page is displayed:"+" "+status);
		}	   
	}
	
	@When("^The User enters the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void The_User_enter_the_username_and_password(String username, String password) throws Throwable {
		status = FAIL;
		try {
			driver.findElementByXPath(twitterLoginBtnXpath).click();
			System.out.println("Entering the username and password");
			driver.findElementByXPath(twitterLoginIdXpath).click();
			driver.findElementByXPath(twitterLoginIdXpath).clear();
			driver.findElementByXPath(twitterLoginIdXpath).sendKeys(username);
			driver.findElementByXPath(twitterLoginPwdXpath).click();
			driver.findElementByXPath(twitterLoginPwdXpath).clear();
			driver.findElementByXPath(twitterLoginPwdXpath).sendKeys(password);	
			driver.findElementByXPath(twitterLoginBtnOneXpath).click();
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The User enter the username and password:"+" "+status);
		}	    
	}
	
	@Then("^The User verifies if the Homepage is displayed$")
	public void The_User_verifies_if_the_Homepage_is_displayed() throws Throwable {
	    status = PASS;
	    try {
	    	System.out.println("Verifying if the home page is displayed or not");
	    	if (driver.findElementByXPath(twitterHomeBtnXpath).getText().contains("Home")) {
	    		System.out.println("The Home page is displayed!");
			} else {
				System.out.println("The Home page is not displayed!");
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("The User verifies if the Homepage is displayed:"+" "+status);
		}	    
	}
	
	@Then("^The User logs out of the application$")
	public void The_User_logs_out_of_the_application() throws Throwable {
	    status = PASS;
	    try {
			driver.findElementByXPath(twitterLogoutBtnXpath).click();
			driver.findElementByXPath(twitterLogoutBtnOneXpath).click();
			if (driver.findElementByXPath(twitterLogoutPageXpath).getText().contains("Have an account?")) {
				System.out.println("The Logout page is displayed!");
				driver.quit();
			} else {
				System.out.println("The Logout page is not displayed!");
				driver.quit();
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("The User logs out of the application:"+" "+status);
		}		
	}
	
	@When("^The User enters the username as \"([^\"]*)\" and the invalid password as \"([^\"]*)\"$")
	public void The_User_enters_the_username_as_and_the_invalid_password_as(String username, String password) throws Throwable {
	    status = FAIL;
	    try {
			driver.findElementByXPath(twitterLoginBtnXpath).click();
			System.out.println("Entering the username and password");
			driver.findElementByXPath(twitterLoginIdXpath).click();
			driver.findElementByXPath(twitterLoginIdXpath).clear();
			driver.findElementByXPath(twitterLoginIdXpath).sendKeys(username);
			driver.findElementByXPath(twitterLoginPwdXpath).click();
			driver.findElementByXPath(twitterLoginPwdXpath).clear();
			driver.findElementByXPath(twitterLoginPwdXpath).sendKeys(password);	
			driver.findElementByXPath(twitterLoginBtnOneXpath).click();
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The User enter the username and password:"+" "+status);
		}	    
	}
	
	@Then("^The User verifies if the invalid credentials message is displayed$")
	public void The_User_verifies_if_the_invalid_credentials_message_is_displayed() throws Throwable {
		status = FAIL;
		try {
	    	System.out.println("Verifying if the invalid credentials message is displayed or not");
	    	if (driver.findElementByXPath(twitterInvalidCredentialsMsgXpath).getText().contains("The email and password you entered did not match our records. Please double-check and try again.")) {
	    		System.out.println("The Invalid credentials message is displayed!");
	    		driver.quit();
	    		status = PASS;
			} else {
				System.out.println("The Invalid credentials message is not displayed!");				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("The User verifies if the invalid credentials message is displayed:"+" "+status);
		}	    
	}
	
	@Given("^The User verifies if the login page of twitter\\.com is displayed$")
	public void the_User_verifies_if_the_login_page_of_twitter_com_is_displayed() throws Throwable {
		status = PASS;
	    try {
			driver.manage().window().maximize();
			driver.navigate().to(twitterUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("Verifying if the login page is displayed or not");
			if (driver.findElementByXPath(twitterLoginPageTextXpath).getText().contains("What’s happening?")) {
				System.out.println("The Login page is displayed!");
			} else {
				System.out.println("The Login page is not displayed!");
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The User verifies if the Login page is displayed:"+" "+status);
		}
	}
	
	@Then("^The User verifies if the homepage is displayed$")
	public void the_User_verifies_if_the_homepage_is_displayed() throws Throwable {
		status = PASS;
	    try {
	    	System.out.println("Verifying if the home page is displayed or not");
	    	if (driver.findElementByXPath(twitterHomeBtnXpath).getText().contains("Home")) {
	    		System.out.println("The Home page is displayed!");
			} else {
				System.out.println("The Home page is not displayed!");
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("The User verifies if the Homepage is displayed:"+" "+status);
		}	
	}
	
	@When("^The User enters the username as \"(.*?)\" and the password as \"(.*?)\"$")
	public void the_User_enters_the_username_as_and_the_password_as(String loginId, String loginPassword) throws Throwable {
		status = FAIL;
	    try {
			driver.findElementByXPath(twitterLoginBtnXpath).click();
			System.out.println("Entering the username and password");
			driver.findElementByXPath(twitterLoginIdXpath).click();
			driver.findElementByXPath(twitterLoginIdXpath).clear();
			driver.findElementByXPath(twitterLoginIdXpath).sendKeys(loginId);
			driver.findElementByXPath(twitterLoginPwdXpath).click();
			driver.findElementByXPath(twitterLoginPwdXpath).clear();
			driver.findElementByXPath(twitterLoginPwdXpath).sendKeys(loginPassword);	
			driver.findElementByXPath(twitterLoginBtnOneXpath).click();
			status = PASS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("The User enter the username and password:"+" "+status);
		}
	}
	
	@Then("^The User logs out of twitter\\.com$")
	public void the_User_logs_out_of_twitter_com() throws Throwable {
		status = PASS;
	    try {
			driver.findElementByXPath(twitterLogoutBtnXpath).click();
			driver.findElementByXPath(twitterLogoutBtnOneXpath).click();
			if (driver.findElementByXPath(twitterLogoutPageXpath).getText().contains("Have an account?")) {
				System.out.println("The Logout page is displayed!");
				driver.quit();
			} else {
				System.out.println("The Logout page is not displayed!");
				driver.quit();
				status = FAIL;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("The User logs out of the application:"+" "+status);
		}
	}
}
