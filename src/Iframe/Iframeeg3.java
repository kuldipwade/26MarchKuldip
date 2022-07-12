package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
     //   driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
        // Switch selenium focus main page to frame.
        driver.switchTo().frame("frame1");
        //selenium.NoSuchElementException
        String text = driver.findElement(By.id("topic")).getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("Kuldip");
        Thread.sleep(1000);
        // switch to change focus from frame1 to frame3
        driver.switchTo().frame("frame3");
         String text1 = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
         System.out.println(text1);
         Thread.sleep(2000);
         // click the checkbox
         driver.findElement(By.id("a")).click();
         // get text of Topic
         driver.switchTo().parentFrame();
         String text2 = driver.findElement(By.id("topic")).getText();
         System.out.println(text2);
         Thread.sleep(1000);
         //switch to text animal
         driver.switchTo().frame("frame2");
         driver.findElement(By.xpath("//select[@id='animals']")).click();
         Thread.sleep(1000);
         
         
         
      
         
          
        
        

	}

}
