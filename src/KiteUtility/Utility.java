package KiteUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
    //excel Reading
	//ScreenShots
	//Closing
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		 File Myfile= new File("C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\kul.01.xlsx");
		 Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2"); 
		 String value = Mysheet.getRow(row).getCell(cell).getStringCellValue();
		 return value;
	}
	public static void getScreenShot(WebDriver driver , String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\kuldip wade\\Pictures\\Saved Pictures\\MyScrn"+TCID+".png");
		FileHandler.copy(src, dec);
		
	}
	
	
}  


