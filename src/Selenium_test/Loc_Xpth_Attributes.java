package Selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc_Xpth_Attributes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();//---->click Action
		driver.findElement(By.xpath("//input[@id='autocomplete'] ")).sendKeys("Mulla lover");//----->write Action.
		driver.findElement(By.xpath("//input[@value='option2'] ")).click();
		

	}

}
