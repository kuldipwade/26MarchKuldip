package KitePomNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage
{
  // Data Member
  @FindBy(xpath = "//span[@class='user-id']")private WebElement userName;
  @FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
  
  // Consgtructor
  public kiteHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  //Methods
  public void validateUserName(String ExprctedUserID)
  {
	 String expectedUserName=ExprctedUserID;
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
      //A.Insted of If Else we Use Assert Method.
  //To get Actual UserName.
  public String getActualUserName() // Actual user name we use this syntax.
  {
	  String ExpectedUserName = userName.getText();
	  return ExpectedUserName;
  }
  
  public void logOut() throws InterruptedException
  {
	 userName.click();
	 Thread.sleep(1000);
	 logOutButton.click();
  }
  
}
