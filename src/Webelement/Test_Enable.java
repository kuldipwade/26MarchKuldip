package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Enable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
          
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
                 WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
           driver.get("https://www.redbus.in/");
           Thread.sleep(4000);
           driver.findElement(By.xpath("//input[@id='src']")).click();
           Thread.sleep(1000);
        

}
}
