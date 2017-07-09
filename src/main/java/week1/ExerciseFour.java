package week1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

//selenium code to sign up on IRCTC

public class ExerciseFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		//Launch the IRCTC website
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Enter the user details
		//driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("Rohith_1990");
		
		driver.findElementById("userRegistrationForm:password").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Taurus1990");
		
		driver.findElementById("userRegistrationForm:confpasword").click();
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Taurus1990");
		
		//Select the security question
		driver.findElementById("userRegistrationForm:securityQ").click();
		
		WebElement secque = driver.findElementById("userRegistrationForm:securityQ");
		Select que = new Select(secque);
		que.selectByIndex(6);
		
		//Answer the security question		
		driver.findElementById("userRegistrationForm:securityAnswer").click();
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Pulsar");
		
		//Select the preferred language
		WebElement lan = driver.findElementById("userRegistrationForm:prelan");
		Select lang = new Select(lan);
		lang.selectByIndex(0);
		
		//Enter the first name, middle name and last name
		driver.findElementByName("userRegistrationForm:firstName").click();
		driver.findElementByName("userRegistrationForm:firstName").sendKeys("Rohith");
		
		driver.findElementByName("userRegistrationForm:middleName").click();
		driver.findElementByName("userRegistrationForm:middleName").sendKeys("Nanda");
		
		driver.findElementByName("userRegistrationForm:lastName").click();
		driver.findElementByName("userRegistrationForm:lastName").sendKeys("Kumar");
		
		//Select the gender		
		driver.findElementById("userRegistrationForm:gender:0").click();
				
		//Select the marital status
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		//Select the Date of Birth
		
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select dat = new Select(date);
		dat.selectByValue("27");
		
		WebElement mon = driver.findElementById("userRegistrationForm:dobMonth");
		Select mth = new Select(mon);
		mth.selectByIndex(3);
		
		WebElement yr = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select ye = new Select(yr);
		ye.selectByValue("1990");
		
		//Select the occupation
		WebElement ocp = driver.findElementById("userRegistrationForm:occupation");
		Select oct = new Select(ocp);
		oct.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:uidno").click();
		driver.findElementById("userRegistrationForm:uidno").sendKeys("10045100");
		
		driver.findElementById("userRegistrationForm:idno").click();
		driver.findElementById("userRegistrationForm:idno").sendKeys("A415210");
		
		driver.findElementById("userRegistrationForm:email").click();
		driver.findElementById("userRegistrationForm:email").sendKeys("rohithkumar90@ymail.com");
		
		driver.findElementById("userRegistrationForm:mobile").click();
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9940096410");
		
		//selecting the country in the drop down list
		
		WebElement natl = driver.findElementById("userRegistrationForm:nationalityId");
		Select nlty = new Select(natl);
		nlty.selectByValue("94");
		
		//Enter the residential address
		
		driver.findElementById("userRegistrationForm:address").click();
		driver.findElementById("userRegistrationForm:address").sendKeys("No.47D, Aparajitha Apartments");
		driver.findElementById("userRegistrationForm:street").click();
		driver.findElementById("userRegistrationForm:street").sendKeys("C.V.Koil Street");
		driver.findElementById("userRegistrationForm:area").click();
		driver.findElementById("userRegistrationForm:area").sendKeys("Alwarthirunagar");
		
		WebElement con = driver.findElementById("userRegistrationForm:countries");
		Select coun = new Select(con);
		coun.selectByValue("94");
		
		WebElement usekeys = driver.findElementById("userRegistrationForm:pincode");
		usekeys.click();
		usekeys.sendKeys("600087");
		usekeys.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select district = new Select(city);
		district.selectByValue("Tiruvallur");
		city.sendKeys(Keys.TAB);
				
		Thread.sleep(2000);
		
		WebElement post = driver.findElementById("userRegistrationForm:postofficeName");
		Select office = new Select(post);
		office.selectByValue("Alwarthirunagar S.O");
		
		driver.findElementById("userRegistrationForm:landline").click();
		driver.findElementById("userRegistrationForm:landline").sendKeys("9940096410");
		Thread.sleep(2000);
		
		//Close the browser
		driver.close();

	}
	
}
