package KiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage
{
  //1.Data Member
  @FindBy(xpath = "//span[@class='user-id']")private WebElement userName;
  @FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
  
  //2.Consgtructor
  public kiteHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  // 3.Methods
  public void validateUserName()
  {
	 String expectedUserName="ELR321";
	 String actualUserName=userName.getText();
	 if(expectedUserName.equals(actualUserName))
	 {
		 System.out.println("Actual An Expected user id are Matching TC is Passed");
	 }
	 else
	 {
		 System.out.println("Actual An Expected user id are not Matching TC is failed");
	 }
  }
  public void logOut() throws InterruptedException
  {
	 userName.click();
	 Thread.sleep(1000);
	 logOutButton.click();
  }
  
}
