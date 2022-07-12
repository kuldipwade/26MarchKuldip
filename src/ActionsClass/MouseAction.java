package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException 
	{
		// Mouse Action
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
    //    seleniumButton.click();// using web Element method.
        
        // Create an object of Actions Class and Pass Driver Object
        Actions Act=new Actions(driver);
        // using One of the  Required action to complete the process.
//        Act.moveToElement(seleniumButton).perform();// tewo line code
//        Act.click().perform();
     //   Act.moveToElement(seleniumButton).click().build().perform();// one line code
       Act.click(seleniumButton).perform();// More than 2 method then use of build.
       
        
        // Right Click(ContextClick) using Action Class
        WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
   //     Act.moveToElement(rightclickbutton).contextClick().build().perform();
    //    Act.contextClick(rightclickbutton).perform();
        
        // Double Click
        WebElement Doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    //    Act.moveToElement(Doubleclick).doubleClick().build().perform();
      //  Act.doubleClick(Doubleclick).perform();
       
        
        

	}

}
