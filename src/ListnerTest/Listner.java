package ListnerTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Base;
import KiteBase.BaseProp;

public class Listner extends Base implements ITestListener
{
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Sorry Tc Is Failed ,plese Take ScreenShot",true);
		Reporter.log("Failed Tc Case name Is "+result.getName(),true);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Tc Is Passed ",true);
		Reporter.log("Success Tc Name Is "+result.getName(),true);
    }
	
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC IS Skipped ",true);
		Reporter.log("Skipped TC Name is "+result.getName(),true);
	}
       
}