package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulIframeeg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
     //   driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
       WebElement text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']"));
       System.out.println(text.getText());
       Thread.sleep(1000);
       // switch selenium focus main page to frame1
       driver.switchTo().frame("frame1");
       WebElement text1 = driver.findElement(By.xpath("//b[@id='topic']"));
       System.out.println(text1.getText());
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input)[1]")).sendKeys("Kuldip");
       driver.switchTo().parentFrame();       // shift to focus frame to listbox.
       driver.switchTo().frame("frame2");
      WebElement animal = driver.findElement(By.className("col-lg-3"));
      // handling list box /     
      Thread.sleep(2000);
       Select s1=new Select(animal);
       s1.selectByValue("babycat");
       Thread.sleep(1000);
       // Switch Selenuim focus from main page
       driver.switchTo().parentFrame(); 
       WebElement text3 = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']"));
       System.out.println(text3.getText());
      
        
       
      
       
       
        
   
      
       
	}

}
