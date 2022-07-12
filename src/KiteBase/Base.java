package KiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{ 
	 protected WebDriver driver;
	public void openBrowser()
	{
       
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
    	
    	ChromeOptions opt = new ChromeOptions();
    	opt.addArguments(" Incognito");
    	opt.addArguments("disable-notifications");
        driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Reporter.log("Launching Browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public void getScreenShot(WebDriver driver2, String value) {
		// TODO Auto-generated method stub
		
	}
}
