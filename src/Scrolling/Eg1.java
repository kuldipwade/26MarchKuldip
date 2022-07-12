package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        
        //ScrollBy View
        WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
        JavascriptExecutor e = (JavascriptExecutor)driver;
        e.executeScript("arguments[0].scrollIntoView(true)",Radio1);
        Radio1.click();
        Thread.sleep(2000);
        
        

	}

}
