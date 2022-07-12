package verificationUsingTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleVerification {
  @Test
  public void MyMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	  
	  //Hard Assert ------>It Show Only one Value if Test Case Is Fail.
	  Assert.assertNotEquals(a,b,"Tc is Failed Values Are Equal");
	  Assert.assertNotNull(b,"Tc is Failed Value is Null");
  }
}
