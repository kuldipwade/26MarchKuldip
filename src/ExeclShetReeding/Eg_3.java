package ExeclShetReeding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File Myfile= new File("C:\\\\Users\\\\kuldip wade\\\\Downloads\\\\Kuldip.001\\\\kul.01.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int TotalnumofRows = Mysheet.getLastRowNum();// Will Give Total Row Number.
		int	rowCount=TotalnumofRows;// Num Of Row ---->21,28 For Loop Use only.
		
		System.out.println("The Total Num Of Rows are "+rowCount); // Counting 0 Start
		System.out.println("=====================================================");
		
		// For Column
		short TotalnumofCells = Mysheet.getRow(rowCount).getLastCellNum();
	//	System.out.println(TotalnumofCells);
		int cellCounts = TotalnumofCells-1;
		System.out.println("Total no of cells are "+cellCounts);

    	System.out.println("=====================================================");
		
		// Dynamic Coding For Excel Sheet.
		for(int i=0;i<=rowCount;i++)//Outer For loop For Row
		{
		for(int j=0;j<=cellCounts;j++)// Inner For loop For Cell.
			{
			Cell cellValue = Mysheet.getRow(i).getCell(j);
			CellType dataType = cellValue.getCellType();
			if(dataType==CellType.STRING)
			{
				String value = cellValue.getStringCellValue();// Value is local refrance variable--------> Scope is 
				System.out.print(value+" ");// to get out put one line we remove ln.
			}
			
			else if(dataType==CellType.NUMERIC)
			{
				 double value = cellValue.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(dataType==CellType.BLANK)
			{
			    System.out.print(" ");
			}
			
			
			else if(dataType==CellType.BOOLEAN)
			{
				boolean value = cellValue.getBooleanCellValue();
				System.out.print(value+" ");
			}
		
		
		  }
		 System.out.println();
		
		
		}	
		
		

	}

}
