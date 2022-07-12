package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/");
        Thread.sleep(1000);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(2000));
        
        
        WebElement Aboutus = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
      wait.until(ExpectedConditions.visibilityOf(Aboutus));
        Aboutus.click();
     
        
        
		

	}

}
