package DynamicXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(10000);
        driver.findElement(By.name("q")).sendKeys("vivo t1 5g");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
    //    WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
    //    System.out.println(review.getText());
        driver.findElement(By.xpath("(//div[@class='gUuXy-'])[1]")).click();//To click perticular review and ratings.
        Thread.sleep(1000);
        List<WebElement> review = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
        System.out.println(review.size());
        //for Each loop
        
        for(WebElement ov:review)
        {
        	System.out.println(ov.getText());
        }
        
        
        
        
		

	}

}
