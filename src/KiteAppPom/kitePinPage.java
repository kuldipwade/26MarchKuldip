package KiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage 
{
   //1.DataMember
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	//2.Constructor
	public kitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.Methods
	public void sendPin()
	{
		PIN.sendKeys("982278");
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
}
