package verificationUsingTesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualUse {
  @Test
  public void MyMethod() 
  {
	  String a="Pune";
	  String b="Pune";
//	  
//	  Assert.assertEquals(a, b,"a and b values are not matching Tc failed");
//	  Reporter.log("a and b values are  matching Tc passed",true);
	  
	  Assert.assertNotEquals(a, b,"a and b values are not  matching Tc passed");
	  Reporter.log("a and b values  matching Tc passed",true);
	  
}
}
