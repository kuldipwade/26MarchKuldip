package Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test
  public void p() 
  {
	 // Assert.fail();
	  Reporter.log("p is running ",true);
  }
  @Test(groups = {"Sanity"})
  public void q() 
  {
	  Reporter.log("q is running , Sanity ",true);
  }
  @Test (groups = {"Regression"})
  public void r() 
  {
	  Reporter.log("r is running ,Regression ",true);
  }
  @Test (groups = {"Sanity"})
  public void s() 
  {
	  Reporter.log("s is running ,Sanity ",true);
  }
}
