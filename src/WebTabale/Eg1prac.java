package WebTabale;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Eg1prac {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        // How to find no of rows.
        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));// give the list of webelement.
     //   System.out.println("Total No of Rows are "+rows);//it give the xpath id
        int NumofRows = rows.size();//to find how many row---->i.e nothing but integer value
        System.out.println("The total no of row is "+NumofRows);
        
        // How to find no of columns
       List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
       int NumofColumns = columns.size();
       System.out.println("The total no of Columns "+NumofColumns);
       
       // How to read header
       for(WebElement header:columns)
       {
    	 //  System.out.println(header.getText()+" ");// " "For providing space of Element----->it give me result one by one
    	   System.out.print(header.getText()+" ");// It give me result systematic.
       }
       System.out.println("============================");
       // How to read All Rows
       Iterator<WebElement> it = rows.iterator();
       while(it.hasNext())
       {
    	   System.out.print(it.next().getText()+" ");//without println give me sys in one line.
    	   System.out.println();// for print data in sys line.
       }
       
       
       

	}

}
