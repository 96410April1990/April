package javapracticeone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonVariables extends GlobalVariables {
	
	int i, m = 2, flag = 0;
	int n = 50;
	int startPatternI, startPatternJ;
	int xoffSet = 100;
	int yoffSet = 100;
	RemoteWebDriver driver;
	RemoteWebDriver driverOne;
	RemoteWebDriver driverTwo;
	RemoteWebDriver driverThree;
	RemoteWebDriver driverFour;
	RemoteWebDriver driverFive;
	RemoteWebDriver driverSix;
	RemoteWebDriver driverSeven;
	RemoteWebDriver driverEight;
	RemoteWebDriver driverNine;
	RemoteWebDriver driverTen;
	RemoteWebDriver driverEleven;
	RemoteWebDriver driverTwelve;
	RemoteWebDriver driverThirteen;
	RemoteWebDriver driverFourteen;
	RemoteWebDriver driverFifteen;
	RemoteWebDriver driverSixteen;
	RemoteWebDriver driverSeventeen;
	RemoteWebDriver driverEighteen;
	RemoteWebDriver driverNineteen;
	RemoteWebDriver driverTwenty;
	RemoteWebDriver driverTwentyOne;
	String firefoxBrowser = "firefox";
	String chromeBrowser = "chrome";
	String googleUrl = "https://www.google.co.in";
	String salesForceUrl = "https://developer.salesforce.com/signup?d=70130000000td6N";
	protected String twitterUrl = "https://twitter.com/";
	protected String twitterLoginPageText = "Twitter. It's what's happening.";
	String itctcUrl = "https://www.irctc.co.in/eticketing/userSignUp.jsf";
	String gmailUrl = "https://www.google.com/gmail/about/";
	String w3schoolsUrl = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	String jqueryUrl = "http://jqueryui.com/draggable/";
	String jqueryUrlOne = "http://jqueryui.com/";
	String jqueryUrlTwo = "http://jqueryui.com/selectable/";
	String jqueryUrlThree = "http://jqueryui.com/";
	String w3schoolsPromptUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	String popupTestUrl = "http://www.popuptest.com";
	String countingFramesUrl = "http://layout.jquery-dev.com/demos/iframes_many.html";
	String closeFramesUrl = "http://layout.jquery-dev.com/demos/iframe_local.html";
	String quoraUrl = "https://www.quora.com/";
	String jqueryDraggableText = "Drag me around";
	String handlingPromptsText = "JavaScript Prompt";
	String handlingPromptsVerifyText = "Hello Rohith Nandakumar! How are you today?";
	String jqueryHomePageText = "Draggable";
	String jqueryUiDraggableText = "Drag me around";
	String gmailEmailId = "rohithkumar1990@gmail.com";
	String gmailPassword = "rohith270419909940096410";
	DesiredCapabilities dc;
	List<WebElement> allLinks;
	List<WebElement> searchLinks;
	List<WebElement> searchLinksOne;
	List<WebElement> countDropdown;
	List<WebElement> googleLinks;
	WebElement gmailGetLink;
	Alert w3schoolAlert;
	int j, k = 2, l = 200;
	int o, p, q;
	WebElement role;
	WebElement tryItButton;
	WebElement draggable;
	WebElement listOne;
	WebElement listTwo;
	WebElement listThree;
	WebElement listFour;
	WebElement draggableOne;
	WebElement droppableOne;
	Select selectRole;
	int selectRoleOne = 3;
	WebElement country;
	Select selectCountry;
	String selectCountryOne = "IN";
	String popupTestPrimaryWindow;
	Set<String> popupTestWindowHandles;
	Set<String> popupTestWindowHandlesOne;
	Set<String> popupTestWindowHandlesTwo;
	Set<String> popupTestWindowHandlesThree;
	String secondWindowHandle;
	String thirdWindowHandle;
	String fourthWindowHandle;
	File snap;
	File file;
	File fileOne;
	Properties prop;
	Properties propOne;
	FileInputStream fis;
	FileInputStream fisOne;
	Actions builder;
	FileOutputStream fosExcelOne;
	FileInputStream fisExcelOne;
	XSSFWorkbook wbookOne;
	XSSFWorkbook wbookTwo;
	XSSFSheet wsheetOne;
	XSSFSheet wsheetTwo;
	XSSFRow row;
	XSSFRow rowHeaderOne;
	XSSFRow rowHeaderTwo;
	XSSFRow rowHeaderThree;
	XSSFRow rowHeaderFour;
	XSSFRow rowHeaderFive;
	XSSFRow rowHeaderSix;
	XSSFRow rowHeaderSeven;
	XSSFRow rowHeaderEight;
	XSSFRow rowHeaderNine;
	XSSFRow rowHeaderTen;
	XSSFRow rowHeaderEleven;
	XSSFRow rowHeaderTwelve;
	XSSFRow rowHeaderThirteen;
	XSSFRow rowHeaderFourteen;
	XSSFRow rowHeaderFifteen;
	XSSFRow rowHeaderSixteen;
	XSSFRow rowHeaderSeventeen;
	XSSFRow rowHeaderEighteen;
	XSSFRow rowHeaderNineteen;
	XSSFRow rowHeaderTwenty;
	XSSFRow rowHeaderTwentyone;
	XSSFCell cell;
	XSSFCell cellOne;
	XSSFCell cellTwo;
	XSSFCell cellThree;
	XSSFCell cellFour;
	XSSFCell cellFive;
	XSSFCell cellSix;
	XSSFCell cellSeven;
	XSSFCell cellEight;
	XSSFCell cellNine;
	XSSFCell cellTen;
	XSSFCell cellEleven;
	XSSFCell cellTwelve;
	XSSFCell cellThirteen;
	XSSFCell cellFourteen;
	XSSFCell cellFifteen;
	XSSFCell cellSixteen;
	XSSFCell cellSeventeen;
	XSSFCell cellEighteen;
	XSSFCell cellNineteen;
	XSSFCell cellTwenty;
	XSSFCell cellTwentyone;
	XSSFCell cellTwentytwo;
	XSSFCell cellTwentythree;
	XSSFCell cellTwentyfour;
	XSSFCell cellTwentyfive;
	XSSFCell cellTwentysix;
	XSSFCell cellTwentyseven;
	XSSFCell cellTwentyeight;
	XSSFCell cellTwentynine;
	XSSFCell cellThirty;
	XSSFCell cellThirtyone;
	XSSFCell cellThirtytwo;
	XSSFCell cellThirtythree;
	XSSFCell cellThirtyfour;
	XSSFCell cellThirtyfive;
	XSSFCell cellThirtysix;
	XSSFCell cellThirtyseven;
	XSSFCell cellThirtyeight;
	XSSFCell cellThirtynine;
	XSSFCell cellFourty;
	int rowCount;
}
