package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg_3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.honda2wheelersindia.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(1000);
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File destination= new File("C:\\\\Users\\\\kuldip wade\\\\Videos\\\\KVideo\\\\ScreenShot\\\\myscreenshot1.png");
       FileHandler.copy(source, destination);
    
        
	}

}
