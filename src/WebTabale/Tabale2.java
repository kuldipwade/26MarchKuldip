package WebTabale;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabale2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        
     // How To find no of row in tables
        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        int Totalnoofrow = rows.size();
        System.out.println("Total num of rows are "+Totalnoofrow);
        
        //Total no of column 
        List<WebElement> columns = driver.findElements(By.xpath("//table//tr//th"));
        int TotalnoOfColumns = columns.size();
        System.out.println("Total no of Columns are "+TotalnoOfColumns);
        
        // how to read header
        for(WebElement header:columns)
        {
        	System.out.print(header.getText()+" ");// To draw in one line.
        }
        //How to read all table
        //how to read all rows from data
        List<WebElement> AllRowsData = driver.findElements(By.xpath("//table//tr"));
        Iterator<WebElement> it = AllRowsData.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next().getText()+" ");
        	System.out.println();
        }
        
        
        
        
        

	}

}
