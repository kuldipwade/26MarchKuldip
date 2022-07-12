package SetsizeandPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeEg1 {

	public static void main(String[] args) throws InterruptedException {
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(driver.manage().window().getSize());// To find default size.
        
        // to set size we need to ctrate an object of Dimension Class, and pass the Parameter  width and height
        
        Dimension d= new Dimension(1111, 500);
        driver.manage().window().setSize(d);


	}

}
