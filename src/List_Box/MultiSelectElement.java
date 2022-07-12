package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement MultiSelectElement = driver.findElement(By.name("cars"));
		Select s=new Select(MultiSelectElement);
		System.out.println("Muli select element is "+s.isMultiple());// to check is the multiselect or not.
		s.selectByVisibleText("Volvo");//----->With help of text.> <
		Thread.sleep(100);
		s.selectByIndex(1);
		Thread.sleep(100);
		s.selectByValue("opel");//by value----->Value name.
		Thread.sleep(100);
		s.selectByIndex(3);// by index--->Manually
		Thread.sleep(100);
		// Dissect all
	//	s.deselectAll();
		Thread.sleep(100);
		s.deselectByIndex(3);
		Thread.sleep(100);
		s.deselectByValue("opel");
		Thread.sleep(100);
		s.deselectByIndex(1);
		Thread.sleep(100);
		s.deselectByVisibleText("Volvo");
		

		System.out.println(s.getFirstSelectedOption());
		s.getAllSelectedOptions();
	//	s.deselectAll();
	
		
		
		
		
	
		
		

	}

}
