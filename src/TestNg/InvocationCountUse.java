package TestNg;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountUse {
	@BeforeClass
	public void before()
	{
		Reporter.log("Before Method Running", true);
	}
	@Test (invocationCount = 5)
  public void TC1() {
	  Reporter.log("TC1 Running", true);
  }
//	@Before
//	public void TC2()
//	{
//		Reporter.log("TC2 Running", true);
//	}
}
	


