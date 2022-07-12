package KitePomUsingTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	//1.Data Memeberm-----> Only in TestClass is Main Method .------>All Classes In Without main method.
	
  @FindBy(id = "userid")private WebElement userName;
  @FindBy(id = "password")private WebElement passWord;
  @FindBy(xpath = "//button[@type='submit']")  private WebElement loginButton;
  
  //2.Constructor---->(int X)
 
  public KiteLoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //Methods.--->Non Staic method
  public void sendUsername(String UserName) //Write Any name With String Parameter and pass with same below.
  {
	  userName.sendKeys(UserName);
  }
  public void sendPassword(String PassWord)
  {
	  passWord.sendKeys(PassWord);
  }
  public void clickOnLoginbutton()
  {
	  loginButton.click();
  }
}
