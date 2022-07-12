package ExeclShetReeding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
      File Myfile=new File("C:\\Users\\kuldip wade\\Downloads\\Kuldip.001\\kul.01.xlsx");
		
	 Workbook book = WorkbookFactory.create(Myfile);// Return type is Workbook.
                    Sheet Mysheet = book.getSheet("Sheet1");//Return type is Sheet.
                    Row MyRow = Mysheet.getRow(0);// Return Row Value
                    Cell MyCell = MyRow.getCell(0); //Return Column Value
                  System.out.println(MyCell.getCellType());// It give only wich type of value in it.
                  System.out.println("======================================");
                  
                  //Code for Reading Whole Excel Data From Excel sheet.
                  Sheet MySheet2 = book.getSheet("Sheet2");
               
                  // Manually Calculted how many row an cell----> Static Coding.
                  
                  //NullPointer Exception------>Static Coding.
                  //Illegal State Exception ------->Data Type Mismatch.---String ----Numeric value.
                  
                  for(int i=0;i<=1;i++)//Outer for loop ---->for Row
                  {
                	  for(int j=0;j<=2;j++)//Inner for loop ---->for Cell
                	  {
                		  String Value = MySheet2.getRow(i).getCell(j).getStringCellValue();
                		  System.out.print(Value+" ");// Remove ln to print one line.
                	  }
                	  System.out.println();
                  }
                  System.out.println("======================================");
	}

}
