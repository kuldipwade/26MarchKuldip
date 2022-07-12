package verificationUsingTesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void MyMethod() 
  {
	  boolean a=true;
	  boolean b=false;
	  
//	  Assert.assertTrue(b, "Tc is Faild Value is False");
//	  Reporter.log("Tc is passed value is True",true);
	  
	  Assert.assertFalse(b,"Tc is Failed value is true");
	  Reporter.log("Tc is passed value is false",true);
	  

}
}