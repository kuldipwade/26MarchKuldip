package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestNg {
  @Test
  public void MyMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://kite.zerodha.com/");
//      System.out.println("Hii this is printing statment");//it show only console not show in report status.
//      Reporter.log("hii this is reportar class statment");//its not show ,console but it show the Report status.
//      Reporter.log("hii this is reportar class statment true",true);//it show console and reoprt status.
         Thread.sleep(2000);
      
      
  }
  @Test
       public void MyMethod1() throws InterruptedException 
      {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://vctcpune.com/selenium/practice.html");
          Thread.sleep(2000);
      
      
      
      
  }
}
