package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My1stClass
{
  @Test
  public void MyMethod() 
  {
	  System.out.println("Good Morning");// it show only console
	  Reporter.log("Hii"); // its show in emailable report
	  Reporter.log("Hii Its Morning",true);// it show both.
  }
}
