package popup;

import java.util.Iterator;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroweser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(2000);
        // First we need  to Window ID Of the main page
        String MainPageID = driver.getWindowHandle();//ID OF MAin Page.
        System.out.println(MainPageID);// Valid for section--->Unique Id
        System.out.println("===================================");
        //to open Child Window
        driver.findElement(By.name("NewWindow")).click();
         // To handle multiple window /to get multiple id
        Set<String> allpageID = driver.getWindowHandles();
        Thread.sleep(2000);
        Iterator<String> it = allpageID.iterator();
//        while(it.hasNext())
//        {
//        	System.out.println(it.next());
//        }
//        // if while loop not comment then no such element exception found.
       String MainPageid = it.next();// will return main page id
       String childpageid = it.next();// will return child page id
       
       // Changing Focus of main page to child page.
       driver.switchTo().window(childpageid);// Changing Focus main page to child page.
       driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
    //    driver.close();// will Close current focused tab.
    //    driver.quit();// will Close all tabs/pages opend by selenium.
        // Switch selenuim focus from child page to main page.
         driver.switchTo().window(MainPageid);
        WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
        System.out.println(myElement.getText());
        
        
        

	}

}
