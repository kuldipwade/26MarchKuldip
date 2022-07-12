package WebTabale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabale3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
        Thread.sleep(2000);
        
        //row count
       // driver.findElement(By.)
//        
//        
//      
//        			
//        			
//        			
//        			//rows count
//        			
//        			List<WebElement> nosOfRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//        			
//        			int totalNumOfRows=nosOfRow.size();
//        			System.out.println("Total number of rows in table" + totalNumOfRows);
//        			
//        			//cell counts
//        			List<WebElement> nosOfCol = driver.findElements(By.xpath("//table[@id='customers']//th"));
//        			int totalNumOfcol=nosOfCol.size();
//        			System.out.println("Total number of rows in table" + totalNumOfcol);
//        			
//        			System.out.println("=====================================");
//        			for(WebElement AllHead:nosOfCol)
//        			{
//        				System.out.print(AllHead.getText() + " ");
//        				
//        			}
//        			
//        			List<WebElement> allDATA = driver.findElements(By.xpath("//table[@id='customers']//td"));
//        			
//        			Iterator<WebElement> it = allDATA.iterator();
//        			while(it.hasNext())
//        			{
//        				
//        			
//        				System.out.println(it.next().getText() +" ");
//        				
//        			}	
//        			System.out.println(" ");
//        			System.out.println("===================================");
//        	}	
        }

        
        
        

}