package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FBKey {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
       
        WebElement birthday = driver.findElement(By.name("birthday_day"));
        
        //Create an class of action Class
        Actions Act=new Actions(driver);
        Act.click(birthday).perform();
        for(int i=1;i<=7;i++)
        {
        	Act.sendKeys(Keys.ARROW_DOWN).perform();// 8 times perform.
        	 Thread.sleep(100);
        }
        Act.sendKeys(Keys.ENTER).perform();
       
        // Manually Perform When u enter the Name.
        WebElement Firstname = driver.findElement(By.name("firstname"));
     //   Firstname.sendKeys("Kuldip");-----> By using action Class.
     //   Act.keyDown(Firstname, Keys.SHIFT).sendKeys("k").build().perform();
        Act.keyDown(Firstname, Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("uldip").build().perform();
        System.out.println("Hii This Is My first Code");
        
        

	}

}
