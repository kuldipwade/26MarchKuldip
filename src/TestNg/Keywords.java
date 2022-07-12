package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords {
  @Test
  public void a() 
  {
	 Reporter.log("Regression Testing",true); 
  }
  @Test
  public void c() 
  {
	 Reporter.log("Retesting Testing",true); 
  }
  @Test
  public void b() 
  {
	 Reporter.log("Regression Testing",true); 
  }
  @Test
  public void d() 
  {
	 Reporter.log("d is running",true); 
  }
}
