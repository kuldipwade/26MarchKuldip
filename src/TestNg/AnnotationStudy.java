package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  // Order of Insertion Maintain.----->It Follow Standerd sequence.
	//Standerd Sequence---> only Before an After Method Run Two Time.becuse two test case
		//Class Will be execute only one.
	@Test   
  public void validateUserId() 
  {
	  Reporter.log("User Id Validated ",true);
  }
	@Test   
	  public void validateDashBoard() 
	  {
		  Reporter.log("DashBoard Validate",true);
	  }
  @BeforeMethod
  public void logintoKiteApp()
  {
	  Reporter.log("Login Success",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser Launched",true);
  }
  @AfterMethod
  public void logoutFromKite()
  {
	  Reporter.log("Logout successfullly",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser Closed",true);
  }

}
