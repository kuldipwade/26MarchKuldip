package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKey {

	public static void main(String[] args) throws InterruptedException 
	
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
       WebElement textbox = driver.findElement(By.id("autocomplete"));
  //     textbox.sendKeys("KULDIP WADE");// By using WebElement
       
       //By Using Actions Class SendKeys
       // Create AN object of Actions Class with pass driver
       Actions act=new Actions(driver);
      act.sendKeys(textbox, "Good Night").perform();
       
     
      
       
       //How to handle DropDowm using Actions Class
       WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
       
       // Using Action Class Method handling dropdown.
   //   act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
      act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       
       
       
	}

}

