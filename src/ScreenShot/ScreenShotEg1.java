package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEg1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{  
		//A. due to override at the end of the day save only 1 screenshot.
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        driver.findElement(By.name("dropdown-class-example"));
        Thread.sleep(5000);
        File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// Take Screen Shot.
        File destination=new File("C:\\Users\\kuldip wade\\Videos\\KVideo\\ScreenShot\\myscreenshot1.png");//2.giving path to screenshot.
        // Giving path to Along with extension My screenshot.
        FileHandler.copy(Source, destination);//3. Copy the ScreenShot
        
        

	}

}
