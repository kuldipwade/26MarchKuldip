package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteApp {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
       // Manually Testing
        WebElement UserId = driver.findElement(By.id("userid"));
        WebElement passWord = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        UserId.sendKeys("ELR321");
        passWord.sendKeys("Dhana1111");
        loginbutton.click();
        Thread.sleep(2000);
        WebElement pin = driver.findElement(By.id("pin"));
        WebElement ContinueButton = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
        pin.sendKeys("982278");
        ContinueButton.click();
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
        String ActualuserId = userName.getText();
        String ecpecteduserId = "ELR3211";
        
        if(ActualuserId.equals(ecpecteduserId))
        {
        	System.out.println("User Id Matching Test Case Passed");
        }
        else
        {
        	System.out.println("User Id Not Matching Test Case  Failed");
        }
        
        
        userName.click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[@target='_self']")).click();
        Thread.sleep(2000);
        driver.close();
        
       

	}

}
