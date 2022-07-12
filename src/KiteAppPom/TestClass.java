package KiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        KiteLoginPage login=new KiteLoginPage(driver);
        login.sendUsername();
        login.sendPassword();
        login.clickOnLoginbutton();
        Thread.sleep(2000);
        
        kitePinPage pin=new kitePinPage(driver);
        pin.sendPin();
        pin.clickOnContinueButton();
        Thread.sleep(2000);
        
        kiteHomePage home=new kiteHomePage(driver);
        home.validateUserName();
        home.logOut();
        driver.close();
	}

}
