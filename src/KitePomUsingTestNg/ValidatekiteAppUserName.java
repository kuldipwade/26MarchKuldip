package KitePomUsingTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatekiteAppUserName 
{
	
	WebDriver driver;
	Sheet Mysheet;
	
	//A.Object Declare
	KiteLoginPage login;
	kitePinPage pin;
	kiteHomePage home;
	   
	@BeforeClass
    public void  launchBrowser() throws EncryptedDocumentException, IOException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
    	
    	
    	ChromeOptions opt = new ChromeOptions();
  //  	opt.addArguments("headless");
    //	opt.addArguments(" Incognito");
    	opt.addArguments("disable-notifications");
    //	opt.addArguments("make-default-browser");
    //	opt.addArguments("version");
    //	opt.addArguments("disable-infobars");
        driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Reporter.log("Browser Launching",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        File Myfile= new File("C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\kul.01.xlsx");
		
        Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2"); 
        
      //B.Object Initializing
        
        login=new KiteLoginPage(driver);
        pin=new kitePinPage(driver);
        home=new kiteHomePage(driver);
        

	 }
	
	@BeforeMethod 
	public void loginToKiteApp()
	{
	   String UN = Mysheet.getRow(6).getCell(0).getStringCellValue();
	   String PWD = Mysheet.getRow(6).getCell(1).getStringCellValue();
	   String PIN = Mysheet.getRow(6).getCell(2).getStringCellValue();  
	  
	  //1st page
	   login.sendUsername(UN);
	   Reporter.log("sending userName",true);
	   login.sendPassword(PWD);
	   Reporter.log("sending passWord",true);
	   login.clickOnLoginbutton();
	   Reporter.log("clicking on loginButton",true);
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)); // Go through the next page.
	  
	  //2nd Page
	   pin.sendPin(PIN);
	   Reporter.log("sendingPin",true);
	   pin.clickOnContinueButton();
	   Reporter.log("clicking on contiueButton",true);
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 //  Assert.fail();
	  
		
	}
	
	@Test
  public void ValidateUserName() {
		
		String expectedUN = Mysheet.getRow(6).getCell(0).getStringCellValue();
		//Actual UN
		
		String ActualUN = home.getActualUserName();
		
		//use hard asert we can validate only one user name
		//insted of if else use we use assert.
		Assert.assertEquals(ActualUN, expectedUN , "Actual and Expected UserId are not Matching TestCase Failed");
		Reporter.log("Actual and Expected UserId are Matching TestCase Passed",true);
		
  }
	
	@AfterMethod
	public void logoutFromKiteApp() throws InterruptedException
	{ 
		home.logOut();
		Reporter.log("Browser logout--",true);		
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
		Reporter.log("Closing Browser",true);
	}
}
