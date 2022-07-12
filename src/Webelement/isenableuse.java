package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenableuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		WebElement getotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(getotp.isEnabled());// False.
		//org.openqa.selenium.InvalidSelectorException
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		Thread.sleep(1000);
		System.out.println(getotp.isEnabled());
		getotp.click();// True.
		

	}

}
