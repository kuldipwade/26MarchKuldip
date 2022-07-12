package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotEg_2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// 2nd method.-----> Crate random string along with extension.
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
       String str = RandomString.make(3);
       File destination=new File("C:\\Users\\kuldip wade\\Videos\\KVideo\\ScreenShot"+str+".png");
       FileHandler.copy(source, destination);
       
       
       

       
	}

}
