package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingUsingSelenuim {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        
        //Scrolling by Normal Use
     
//        e.executeScript("window.scrollBy(90,800)");
        
        // Scroll into view.
       WebElement katraj=driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
       JavascriptExecutor e = (JavascriptExecutor)driver;
             e.executeScript("arguments[0].scrollIntoView(true)",katraj);
             
            //Practice Page
//             driver.findElement(By.tagName("Click to Start Selenium Practice Now")).click();
//             Thread.sleep(2000);
             
  
        
        
        

	}

}
