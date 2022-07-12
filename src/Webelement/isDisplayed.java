package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement textbox = driver.findElement(By.name("show-hide"));//--->Show/ Hide Element
		WebElement hide = driver.findElement(By.id("hide-textbox"));// show text box.
		WebElement show = driver.findElement(By.id("show-textbox"));//hide text box.
		if(textbox.isDisplayed())// op is--->Thank you Text box is already Dispaly
		{
			System.out.println("Thank you Text box is already Dispaly");
		}
		else
		{
			System.out.println("Cant find Text box");
		}
        hide.click();
    	if(textbox.isDisplayed())
		{
			System.out.println("Thank you Text box is already Dispaly");
		}
		else
		{
			System.out.println("Cant find Text box");
		}
        
	}

}
