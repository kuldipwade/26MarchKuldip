package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePomNew.KiteLoginPage;
import KitePomNew.kiteHomePage;
import KitePomNew.kitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserId extends Base {
	
	kiteHomePage home;
	kitePinPage pin;
	KiteLoginPage login;
	String TCID ="1234";
 
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login=new KiteLoginPage(driver);
		pin=new kitePinPage(driver);
		home=new kiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(Utility.readDataFromExcel(6, 0));
		login.sendPassword(Utility.readDataFromExcel(6, 1));
		login.clickOnLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(6, 2));
		pin.clickOnContinueButton();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	
	@Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(6, 0),"Actual And Expected are Not Matching TC is Failed");
		Utility.getScreenShot(driver, TCID);
		// this is applicable for pass test case if i want to fail test case it is static and lengthy.
    }
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
