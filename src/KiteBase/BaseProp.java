package KiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import KiteUtility.UtilityProp;

public class BaseProp
{

      protected WebDriver driver;
    
	public void openBrowser() throws IOException
	{
		
     System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
	
   	 ChromeOptions opt = new ChromeOptions();
   
   
   	   opt.addArguments("disable-notifications");
       driver=new ChromeDriver(opt);
       driver.manage().window().maximize();
       driver.get(UtilityProp.getDataFromPropFile("URL"));
       Reporter.log("Launching Browser",true);
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}

