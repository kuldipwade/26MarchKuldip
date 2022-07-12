package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hii kuldip");
//	    Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();// 1.previous value clear 2.if we wantto clear data.
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	    

	}

}
