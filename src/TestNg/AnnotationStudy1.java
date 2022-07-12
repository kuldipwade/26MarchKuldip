package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy1
{
	//Standerd Sequence---> only Before an After Method Run Two Time.becuse two test case
	//Class Will be execute only one.
	
  @Test
  public void RechargePhone()
  {
	  Reporter.log("Recharge Succesfull",true);
  }
  @BeforeMethod
  public  void loginToRechargePortal()
  {
	  Reporter.log("login success",true);
  }
  @AfterMethod
  public void logoutRechargePortal()
  {
	  Reporter.log("logout Done",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("launched Browser",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser Closed",true);
  }
  
}
