package Selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_method {

	public static void main(String[] args) throws InterruptedException {
		Object webdriver;
		// driver Method
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("https://paytm.com/");//----->1.To Open An Application.
          driver.close();//2.close the current tab
          driver.manage().window().maximize();//3.maximize and minimize.
          driver.manage().window().minimize();//------->Maximize the web page.
         
           driver.navigate().back(); // 5.Navigate method
           Thread.sleep(1000);// synchronisation ke liye choose option.
//           driver.navigate().forward();
//           driver.navigate().back();
//           driver.navigate().refresh();
          driver.get("https://www.redbus.in/");
           String Title = driver.getTitle(); // 6.Get title method
           System.out.println("Title is "+Title);
         String url = driver.getCurrentUrl();//7. get url method
         System.out.println("the url is "+url);
          
           
        
          
          
           
           
           
        
          
          
	

	}

}
