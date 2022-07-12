package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        WebElement Source = driver.findElement(By.xpath("//a[text()=' 5000']"));
        
        WebElement destination = driver.findElement(By.id("amt8"));
        
        //How to drag an drop using Actions Class.
        
        // Create an object of object  Class pass the driver object.
        
        
        Actions Act=new Actions(driver);
        // By using Action Class Method Perform desired Action.
   //     Act.moveToElement(Source).clickAndHold().moveToElement(destination).release().build().perform();
        Act.dragAndDrop(Source, destination).perform();
        

	}

}
