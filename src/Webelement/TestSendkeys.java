package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569897%7Ce%7Cfb%20login%7C&placement=&creative=589460569897&keyword=fb%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-320262102914%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw4ayUBhA4EiwATWyBrmUu96yXCVc4MYOsPdUbreo70hesfexw1TRhZ57N0qyzBabe3a0BwBoCgQQQAvD_BwE");
        Thread.sleep(1000);
 //       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kuldip");
        Thread.sleep(1000);
       
   //     driver.findElement(By.xpath("//select[@id='day']")).click();
 //       driver.findElement(By.xpath("//input[@name='firstname']")).clear();
        
        // 3 way find the text of an element.
        System.out.println(driver.findElement(By.xpath("//div[text()='Create a new account']")).getText());//1.way
        String text = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();//2 way
        System.out.println(text);
        WebElement Element = driver.findElement(By.xpath("//div[text()='Create a new account']"));//3 way
        System.out.println(Element.getText());
        
        
        
       
        
        
       

}
}