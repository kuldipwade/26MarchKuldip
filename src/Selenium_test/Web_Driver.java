package Selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// to get open an application of browser
		driver.get("https://paytm.com/");
//		driver.close();
//        driver.manage().window().maximize();
        driver.manage().window().minimize();
	}

}
