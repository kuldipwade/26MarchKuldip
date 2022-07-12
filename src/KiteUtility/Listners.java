package KiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.BaseCrossBrowListner;
import KiteBase.BaseProp;

public class Listners extends BaseCrossBrowListner implements ITestListener
{
	
	
       @Override
       public void onTestSuccess(ITestResult result) 
      {
       Reporter.log("Congratulations Your Tc is Passed,Passed TC is "+result.getName(),true);

      }
       @Override
    public void onTestFailure(ITestResult result) 
       {
    	   Reporter.log("Tc is Failed,Failed TC is "+result.getName(),true);
    	   String value = result.getName();
    	   try 
    	{
    		   CrossBroUtilityList.getScreenShot(driver, value);
		}
    	 catch (IOException e) 
    	   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
       }
 
       @Override
    public void onTestSkipped(ITestResult result)
       {
    	   Reporter.log("TC is Skipped,Skipped TC is "+result.getName(),true);
       }
}
       
