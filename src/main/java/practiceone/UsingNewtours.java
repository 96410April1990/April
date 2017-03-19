package practiceone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class UsingNewtours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user_Name = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input";
		String user_Pwd = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input";
		String signIn_Click = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input";
		String click_RadioButtonOne = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
		String select_Psngr = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select";
		WebElement select_Psngr_one; 
		Select select_Psngr_two;
		String select_From_Loc = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select";
		WebElement select_From_Loc_One;
		Select select_From_Loc_Two;
		String select_Month = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]";
		WebElement select_Month_One;
		Select select_Month_Two;
		String select_Date = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]";
		WebElement select_Date_One;
		Select select_Date_Two;
		String select_Destination = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select";
		WebElement select_Destination_One;
		Select select_Destination_Two;
		String select_Month_Three = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]";
		WebElement select_Month_Four;
		Select select_Month_Five;
		String select_Day_Three = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]";
		WebElement select_Day_Four;
		Select select_Day_Five;
		String select_Preference = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
		String select_Airline = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select";
		WebElement select_Airline_One;
		Select select_Airline_Two;	
		String click_Continue = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input";
		String select_Depart_Airlines = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
		String select_Return_Airlines = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input";
		String click_Continue_One = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input";
		String first_Name = "Rohith";
		String last_Name = "Nandakumar";
		String select_Meal = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select";
		WebElement select_Meal_One;
		Select select_Meal_Two;
		String select_Credit_Card = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[1]/select";
		WebElement select_Credit_Card_One;
		Select select_Credit_Card_Two;
		String credit_Card_Number = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[2]/input";
		String enter_Credit_Card_Number = "1234567890123456";
		String select_Expiration_Mnth = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[1]";
		WebElement select_Expiration_Mnth_One;
		Select select_Expiration_Mnth_Two;
		String select_Expiration_Year = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[2]";
		WebElement select_Expiration_Year_One;
		Select select_Expiration_Year_Two;
		String enter_First_Name = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[1]/input";
		String enter_First_Name_One = "Rohith";
		String enter_Last_Name = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td/table/tbody/tr[2]/td[3]/input";
		String enter_Last_Name_One = "Nandakumar";
		String click_Secure_Purchase = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input";
		
		FirefoxDriver driver = new FirefoxDriver();
		
		try {
			driver.navigate().to("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElementByXPath(user_Name).click();
			driver.findElementByXPath(user_Name).sendKeys("academy");
			driver.findElementByXPath(user_Pwd).click();
			driver.findElementByXPath(user_Pwd).sendKeys("academy");
			driver.findElementByXPath(signIn_Click).click();
			driver.findElementByXPath(click_RadioButtonOne).click();
			//Select the number of passengers
			select_Psngr_one = driver.findElementByXPath(select_Psngr);
			select_Psngr_two = new Select(select_Psngr_one);
			select_Psngr_two.selectByIndex(1);
			//Select departing from location
			select_From_Loc_One = driver.findElementByXPath(select_From_Loc);
			select_From_Loc_Two = new Select(select_From_Loc_One);
			select_From_Loc_Two.selectByIndex(6);
			//Select the month
			select_Month_One = driver.findElementByXPath(select_Month);
			select_Month_Two = new Select(select_Month_One);
			select_Month_Two.selectByIndex(3);
			//Select the date
			select_Date_One = driver.findElementByXPath(select_Date);
			select_Date_Two = new Select(select_Date_One);
			select_Date_Two.selectByIndex(26);
			//Select the destination
			select_Destination_One = driver.findElementByXPath(select_Destination);
			select_Destination_Two = new Select(select_Destination_One);
			select_Destination_Two.selectByIndex(1);
			//Select return date
			select_Month_Four = driver.findElementByXPath(select_Month_Three);
			select_Month_Five = new Select(select_Month_Four);
			select_Month_Five.selectByIndex(3);
			//Select return date
			select_Day_Four = driver.findElementByXPath(select_Day_Three);
			select_Day_Five = new Select(select_Day_Four);
			select_Day_Five.selectByIndex(29);
			//Select preference
			driver.findElementByXPath(select_Preference);
			//Select Airline
			select_Airline_One = driver.findElementByXPath(select_Airline);
			select_Airline_Two = new Select(select_Airline_One);
			select_Airline_Two.selectByIndex(1);
			driver.findElementByXPath(click_Continue);
			driver.findElementByXPath(select_Depart_Airlines);
			driver.findElementByXPath(select_Return_Airlines);
			driver.findElementByXPath(click_Continue_One);
			//Select meal
			select_Meal_One = driver.findElementByXPath(select_Meal);
			select_Meal_Two = new Select(select_Meal_One);
			select_Meal_Two.selectByIndex(3);
			//Select credit card
			select_Credit_Card_One = driver.findElementByXPath(select_Credit_Card);
			select_Credit_Card_Two = new Select(select_Credit_Card_One);
			select_Credit_Card_Two.selectByIndex(2);
			//Enter the credit card number
			driver.findElementByXPath(credit_Card_Number).sendKeys(enter_Credit_Card_Number);
			//Select the expiration month and year
			select_Expiration_Mnth_One = driver.findElementByXPath(select_Expiration_Mnth);
			select_Expiration_Mnth_Two = new Select(select_Expiration_Mnth_One);
			select_Expiration_Mnth_Two.selectByIndex(12);
			select_Expiration_Year_One = driver.findElementByXPath(select_Expiration_Year);
			select_Expiration_Year_Two = new Select(select_Expiration_Year_One);
			select_Expiration_Year_Two.selectByIndex(11);
			//Enter the first name and last name
			driver.findElementByXPath(enter_First_Name).sendKeys(enter_First_Name_One);
			driver.findElementByXPath(enter_Last_Name).sendKeys(enter_Last_Name_One);
			//Click secure purchase
			driver.findElementByXPath(click_Secure_Purchase).click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
