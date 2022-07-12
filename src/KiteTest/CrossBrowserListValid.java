package KiteTest;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KiteBase.Base;
import KiteBase.BaseCrossBrowListner;
import KiteBase.BaseProp;
import KitePomNew.KiteLoginPage;
import KitePomNew.kiteHomePage;
import KitePomNew.kitePinPage;
import KiteUtility.Utility;
import KiteUtility.UtilityProp;
@Listeners(KiteUtility.Listners.class)
public class CrossBrowserListValid extends BaseCrossBrowListner

{
	
	kiteHomePage home;
	kitePinPage pin;
	KiteLoginPage login;
//	String TCID ="333";
	
    @Parameters("Browsername")
	@BeforeClass
	public void launchBrowser(String name) throws IOException 
	{
		if(name.equals("Chrome"))
		{
			openchromeBrowser();
		}
		else if(name.equals("Firefox"))
		{
			openfirefoxBrowser();
		}
			
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
	
	
	@Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.fail();
		Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropFile("UN"));
	    //UtilityProp.getScreenShot(driver, TCID);
		
		
		
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
