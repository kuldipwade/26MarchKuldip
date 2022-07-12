package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifFrameEg2 {

	public static void main(String[] args) throws InterruptedException {
		// eg.2
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://skpatro.github.io/demo/iframes/");
        Thread.sleep(2000);
        String text = driver.findElement(By.linkText("Pavilion")).getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.switchTo().frame("Frame1");// Iframe id or Name.
        String text1 = driver.findElement(By.xpath("//p[text()='I am inside Frame'] ")).getText();
        System.out.println(text1);
        // Changing frame to main Frame.
        driver.switchTo().parentFrame();
        String text2 = driver.findElement(By.xpath("//a[text()='Blogger'] ")).getText();
        System.out.println(text2);
        Thread.sleep(2000);
        driver.switchTo().frame("Frame2");
        String text3 = driver.findElement(By.linkText("Category3")).getText();
        System.out.println(text3);
        Thread.sleep(4000);
        driver.switchTo().parentFrame();
       String text4 = driver.findElement(By.linkText("Pavilion")).getText();
       System.out.println(text4);
        
	}

}
