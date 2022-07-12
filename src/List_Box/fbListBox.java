package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.name("firstname")).sendKeys("Kuldip");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Wade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9767939642");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Kuldip@321");
		Thread.sleep(2000);
		//---->Select Day
		WebElement daybox = driver.findElement(By.name("birthday_day"));
		Select s1=new Select(daybox);
		s1.selectByVisibleText("18");
		Thread.sleep(2000);
		// ----->Select Month
		WebElement Monthbox = driver.findElement(By.name("birthday_month"));
	    Select s2=new Select(Monthbox);
		s2.selectByIndex(4);
		Thread.sleep(2000);
		//--------->Select Year
		WebElement yearbox = driver.findElement(By.name("birthday_year"));
		Select s3=new Select(yearbox);
		s3.selectByValue("1997");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);	
	//	driver.findElement(By.name("websubmit")).click();
		
				

		
		

		
		
	
		
	
		
		
		
		
		
		

	}

}
