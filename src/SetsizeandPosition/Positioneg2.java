package SetsizeandPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positioneg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(driver.manage().window().getPosition());
        
        // Create an object of point class and the parameter and pass the parameter x(width) and y(height)
        
        Point p=new Point(8, 8);
        driver.manage().window().setPosition(p);

	}

}
