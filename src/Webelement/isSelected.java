package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkbox1 = driver.findElement(By.name("checkBoxOption1"));
	//2.	checkbox1.click();------->o/p is "Checkbox is Already selected"
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox is Already selected");
		}
		else
		{
			checkbox1.click();
			System.out.println("Checkbox is selected Now");
		}
		//1.Checkbox is selected Now.
		

	}

}
