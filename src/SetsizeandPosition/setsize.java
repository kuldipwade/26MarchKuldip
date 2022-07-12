package SetsizeandPosition;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) throws InterruptedException {
		// width-->Horizontal(X)  height---->Vertical(Y)--->Pixcal Unit.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        System.out.println(driver.manage().window().getSize());//size Will Be dispaly in console.
         
       //to set size we need to creatw an object of Dimension Class and Pass widhth and height
       org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(1111, 100);
       driver.manage().window().setSize(d);
    
    

	}

}
