package Grouping;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestclass1 {
  @Test
  public void a()
  {
	//  Assert.fail();// Forcefully i fail test case.
	  Reporter.log("a is running ",true);
  }
  @Test (groups = {"Regression"})
  public void b()
  {
	  Reporter.log("b is running ,Regression ",true);
  }
  @Test (groups = {"Sanity"})
  public void c()
  {
	  Reporter.log("c is running ,Sanity ",true);
  }
  @Test (groups = {"Regression"})
  public void d()
  {
	  Reporter.log("d is running , Regression ",true);
  }
}
