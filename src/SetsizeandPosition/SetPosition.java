package SetsizeandPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		// width-->Horizontal(X)  height---->Vertical(Y)--->Pixcal Unit.
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://vctcpune.com/selenium/practice.html");
		        Thread.sleep(2000);
		        System.out.println(driver.manage().window().getPosition());//size Will Be dispaly in console.
		        
		        //to set Position we need to creatw an object of Point Class and Pass widhth(X) and height(Y)
		        Point p=new Point(200, 10);
		        //Using set Postion method we can set the position of broeser.
		        
		        driver.manage().window().setPosition(p);

	}

}
