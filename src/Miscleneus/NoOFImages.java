package Miscleneus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOFImages {

	public static void main(String[] args) throws InterruptedException 
	{
	// How many Images in perticular page.	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);	
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune University");
        Thread.sleep(200);
        driver.findElement(By.xpath("//div[@class='sbic vYOkbe']")).click();
        Thread.sleep(200);
        driver.findElement(By.linkText("Images")).click();
        List<WebElement> links = driver.findElements(By.tagName("img"));// tag name if images is img.
        System.out.println(links.size());
        
      
        
        
        
		
	}

}
