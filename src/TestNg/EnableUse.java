package TestNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
	  @Test 
	  public void d() 
	  {
	  Assert.fail();
		  Reporter.log("d is running ",true);
	  }
	  @Test (dependsOnMethods = {"d"}) // a is not fail because not execute.------>Skipped Method.
	  public void a()  // a is depend on d.and v
	  {
		
		  Reporter.log("a is running ",true);
	  }
	  @Test 
	  public void v() 
	  {
		  Reporter.log("v is running ",true);
	  }
	  @Test
	  public void l() // if i dont need to l then i use comment.
	  {
		  Reporter.log("l is running ",true);
	  }
}
