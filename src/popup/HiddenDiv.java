package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv {

	public static void main(String[] args) throws InterruptedException {
		//Hidden division popup.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        //org.openqa.selenium.ElementClickInterceptedException ---> if we take action before set of popups.
       driver.findElement(By.name("q")).sendKeys("oneplus mobile10r");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    

	}

}
