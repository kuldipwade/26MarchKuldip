package ListnerTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerTest.Listner.class)
public class MyClass2
{
	//A.only class level he listen----->for xml leval myClass2
	// I want to 1 test case passed , 1 test case failed, skipped.
	
  @Test
  public void myMethod5() 
  {
	  Reporter.log("Hi This is Method5",true);
  }
  @Test
  public void myMethod6() 
  {
	  Reporter.log("Hi This is Method6",true);
      Assert.fail();
  }
  @Test(dependsOnMethods = {"myMethod6"})
  public void myMethod7() 
  {
	  Reporter.log("Hi This is Method7",true);
  }

}
