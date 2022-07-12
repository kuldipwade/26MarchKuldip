package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class depends 
{
	  @Test
	  public void d() 
	  {
		  Assert.fail(); // he skipped not fail because ,he didnt check------> He skipped (a)
		  Reporter.log("d is running ",true);
	  }
	  @Test(dependsOnMethods = {"d"},priority = -1)
	  public void a() 
	  {
		  Reporter.log("a is running ",true);
	  }
	  @Test 
	  public void v() 
	  {
		  Reporter.log("v is running ",true);
	  }
	  @Test
	  public void l() 
	  {
		  Reporter.log("l is running ",true);
	  }
}
