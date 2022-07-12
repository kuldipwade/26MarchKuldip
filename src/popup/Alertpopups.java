package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        // to handle alert pop up we need to change selenuim focus main page to 
        
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println(alt.getText());
        Thread.sleep(1000);
        alt.accept();
        

	}

}