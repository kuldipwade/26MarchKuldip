package KitePomUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		// Creating File Class
        File Myfile= new File("C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\kul.01.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2"); 
		String UN = Mysheet.getRow(6).getCell(0).getStringCellValue();
		String PWD = Mysheet.getRow(6).getCell(1).getStringCellValue();
		String PIN = Mysheet.getRow(6).getCell(2).getStringCellValue();
		
		
		// Same As Calling Method;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\chromedriver_103\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        
        KiteLoginPage login=new KiteLoginPage(driver);
        login.sendUsername(UN);
        login.sendPassword(PWD);
        login.clickOnLoginbutton();
        Thread.sleep(2000);
        
        kitePinPage pin=new kitePinPage(driver);
        pin.sendPin(PIN);
        pin.clickOnContinueButton();
        Thread.sleep(2000);
        
        kiteHomePage home=new kiteHomePage(driver);
        home.validateUserName(UN);
        home.logOut();
        driver.close();
	}

}
