package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse 
{
	// Without priority all run with priotise .By Default 0,Integer,duplicate,
  @Test(priority = -2)
  public void d() 
  {
	  Reporter.log("d is running ",true);
  }
  @Test (enabled = false)
  public void a() 
  {
	  Reporter.log("a is running ",true);
  }
  @Test (priority = -1)
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
