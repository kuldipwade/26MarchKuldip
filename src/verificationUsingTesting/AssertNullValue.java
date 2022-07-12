package verificationUsingTesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullValue {
  @Test
  public void MyMethod() 
  {
	  String a=null;
	  String b="Kuldip";
//      Assert.assertNull(b,"Value is not null TC is Failed");
//	  Reporter.log("Value is  null TC is passed",true);
	  Assert.assertNotNull(a, "Value is null Tc Is Failed");
	  Reporter.log("Value is not null Tc Is Passe",true);
	  
	  
  }
  
}
