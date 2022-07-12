package ExeclShetReeding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelR {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		//Create Excel Sheet pass the path along with the extension in file.
		File Myfile=new File("C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\kul.01.xlsx");
		
		// using Work Book Factory Class Read Excel Sheet
		
		// How to read string value
		String Name = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(Name);
		
		// How to read Integer  value
		double Number = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		System.out.println(Number);
	
	// How to read boolean  value
		boolean value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.println(value);
		
		// How to read Character   value
				  String character = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
				System.out.println(character);
		
	}
}
