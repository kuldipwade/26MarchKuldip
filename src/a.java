import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) throws InterruptedException {
		// webdriver.
		//1.get
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        Thread.sleep(1000);
        //2.Close.----->Quit()
  //      driver.close();
        //4.maximiz; minimize.-------->
        driver.manage().window().maximize();//----> to change browesr Position. 
        Thread.sleep(1000);
        //Navigate----->
        // get title
       String title = driver.getTitle();
       System.out.println(title);//validate.
        
        String url = driver.getCurrentUrl();
        System.out.println(url);
       
     
        

	}

}
