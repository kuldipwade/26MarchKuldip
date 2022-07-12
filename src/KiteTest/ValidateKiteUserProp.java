package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteBase.Base;
import KiteBase.BaseProp;
import KitePomNew.KiteLoginPage;
import KitePomNew.kiteHomePage;
import KitePomNew.kitePinPage;
import KiteUtility.Utility;
import KiteUtility.UtilityProp;

public class ValidateKiteUserProp extends BaseProp

{
	
	kiteHomePage home;
	kitePinPage pin;
	KiteLoginPage login;
	String TCID ="999";
	
 
	@BeforeClass
	public void launchBrowser() throws IOException 
	{
		openBrowser();
			
		login=new KiteLoginPage(driver);
		pin=new kitePinPage(driver);
		home=new kiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(UtilityProp.getDataFromPropFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropFile("PWD"));
		login.clickOnLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(UtilityProp.getDataFromPropFile("PIN"));
		pin.clickOnContinueButton();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	
	@Parameters
	@Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropFile("UN"));
	    UtilityProp.getScreenShot(driver, TCID);
		
		
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
