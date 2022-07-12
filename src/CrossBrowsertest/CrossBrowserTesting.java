package CrossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
    @Parameters ("browserName")
	@Test
  public void myMethod(String name) throws InterruptedException
    {
    	WebDriver driver = null;
    	
    	if(name.equals("firefox"))
    	{
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\geckodriver-v0.31.0-win64\\geckodriver.exe");
          driver=new FirefoxDriver();
         
    	}
    	else if(name.equals("chrome"))
    	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
 		  driver = new ChromeDriver();
    	}
    	driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        driver.close();
       
      
         
         
         
         
    	
    	
	  
  }
}
