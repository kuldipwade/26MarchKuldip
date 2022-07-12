package ExeclShetReeding;

import java.io.File;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	private static final Object TotalnumofRows = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile= new File("C:\\\\Users\\\\kuldip wade\\\\Downloads\\\\Kuldip.001\\\\kul.01.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int TotalnumofRows = Mysheet.getLastRowNum();// Will Give Total Row Number.
		int	rowCount=TotalnumofRows;// Num Of Row ---->21,28 For Loop Use only.
		
		System.out.println("The Total Num Of Rows are "+TotalnumofRows); // Counting 0 Start
		System.out.println("=====================================================");
		
		// For Column
		short totalnumofCell = Mysheet.getRow(TotalnumofRows).getLastCellNum();//23
		
		int cellcount = totalnumofCell-1;// Get Actual No Of Column.
		
		//System.out.println("Total Num Of Cell Are "+totalnumofColumn);//It Count From 1---> Selenuim Not Understand.25 line create
		System.out.println("Total Num Of Cell Are "+cellcount);
		System.out.println("=====================================================");
		
		// Dynamic Coding For Excel Sheet.
		for(int i=0;i<=rowCount;i++)
		{
		for(int j=0;j<=cellcount;j++)
		{
			Cell cellvalue = Mysheet.getRow(i).getCell(j);
			CellType dataType = cellvalue.getCellType();
			if(dataType==CellType.STRING)
			{
				 String Value = cellvalue.getStringCellValue();
				System.out.print(Value+" ");//Remove ln to maintain one line.
			}
			else if(dataType==CellType.NUMERIC)
			{
				double value = cellvalue.getNumericCellValue();//value Refrance Variable is local variable scope is---->
				System.out.print(value+" ");
			}
			else if(dataType==CellType.BOOLEAN)
			{
				 boolean value = cellvalue.getBooleanCellValue();//value Refrance Variable is local variable scope is---->
				System.out.print(value+" ");
			}
			else if(dataType==CellType.BLANK)
			{
				
				System.out.print(" ");
			}
		
	    }
		System.out.println();
		}
	
		
		
	 

	}

}
