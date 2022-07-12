package includeExlude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
	  @Test
	  public void q() 
	  {
		  Reporter.log("q is running ",true);
	  }
	  @Test
	  public void p() 
	  {
		  Reporter.log("p is running ",true);
	  }
	  @Test 
	  public void s() 
	  {
		  Reporter.log("s is running ",true);
	  }
	  @Test
	  public void r() 
	  {
		  Reporter.log("r is running ",true);
	  }
}
