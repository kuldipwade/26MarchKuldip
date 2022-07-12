package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	 
		// TestNg Follow the Standerd Sequnece.
	  @Test
	  public void UserNameValidate() 
	  {
		  Reporter.log("User Name Validate",true);
	  }
	  @Test
	  public void UserIdValidate()
	  {
		  Reporter.log("User Id Validate",true);
	  }
	  
	  @BeforeMethod
	  public void enterpass()
	  {
		  Reporter.log("Enter Valid Password",true); 
	  }
	  @BeforeClass
	  public void enterUrl()
	  {
		  Reporter.log("Enter Url Sucesfully",true); 
	  }

	  @AfterClass
	  public void closeBrowser()
	  {
		  Reporter.log("Browser Close",true); 
	  }
	  @AfterMethod
	  public void logout()
	  {
		  Reporter.log("logout SuucessFully",true); 
	  }
	  
	}


