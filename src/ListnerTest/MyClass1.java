package ListnerTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerTest.Listner.class)
public class MyClass1
{
	//A.only class level he listen----->for xml leval myClass2
	// I want to 1 test case passed , 1 test case failed, skipped.
	
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Hi This is Method1",true);
  }
  @Test
  public void myMethod2() 
  {
	  Reporter.log("Hi This is Method2",true);
      Assert.fail();
  }
  @Test(dependsOnMethods = {"myMethod2"})
  public void myMethod3() 
  {
	  Reporter.log("Hi This is Method3",true);
  }

}
