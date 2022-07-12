package verificationUsingTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VarifyRadioButton {
  @Test
  public void MyMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://vctcpune.com/selenium/practice.html");
         WebElement Radiobutton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
         Thread.sleep(1000);
           Radiobutton1.click();
//         if(Radiobutton1.isSelected())
//         {
//        	 Reporter.log("TC is pass Radio Button is Selected",true);
//         }
//     else
//         {
//    	 Reporter.log("TC is Faild Radio Button is not Selected",true);
//         }
         // 2nd Way to write a code
         Assert.assertTrue(Radiobutton1.isSelected(), "TC is Pass Radio Button is  Selected");
}
}