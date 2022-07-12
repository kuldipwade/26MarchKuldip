package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutUse {
	  @Test(timeOut = 100)
	  public void d() throws InterruptedException 
	  {
		  Reporter.log("d is running ",true);
		  Thread.sleep(2000);
	  }
	  @Test
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
