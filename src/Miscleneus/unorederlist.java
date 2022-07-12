package Miscleneus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorederlist {

	public static void main(String[] args) throws InterruptedException 
	{
		// Honda Showroom----->unorderlist
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(200);
        List<WebElement> serchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
        System.out.println(serchResult.size());// Size of result
        // wich of them---->get text
        for(WebElement r:serchResult)// Get text only
        {
        	System.out.println(r.getText());
        }
       for(WebElement result:serchResult)
       {
    	   String ActualResult = result.getText();
    	  String ExceptedResult = "honda city hybrid";
    	  if(ActualResult.equals(ExceptedResult))
    	  {
    		  result.click();
    		  break;
    	  }
       }
       driver.findElement(By.linkText("Images")).click();
	}

}
