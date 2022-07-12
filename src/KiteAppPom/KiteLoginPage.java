package KiteAppPom;

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
  public void sendUsername()
  {
	  userName.sendKeys("ELR321");
  }
  public void sendPassword()
  {
	  passWord.sendKeys("Dhana1111");
  }
  public void clickOnLoginbutton()
  {
	  loginButton.click();
  }
}
