package verificationUsingTesting;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod()
  {
	  String a="Kuldip";
	  String b="Kuldip";
	  
	  // to use soft assert we need to create an object of Soft Assert Class.
	  SoftAssert soft=new SoftAssert();
	  soft.assertNotEquals(a, b,"Both Are Equal TC is Failed");
	  soft.assertNull(b,"Both Are Not Null TC is Failed");
	    
	  //if we Are not given to aserrt all then TestNg Not Executed.
	  soft.assertAll();
  }
}
