package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class passwordprotected {
	public static void main(String [] args) throws IOException { 
		FileInputStream fis=new FileInputStream(".\\data\\passwordprotected.xlsx"); 
		String password="password"; 
		//XSSFWorkbook workbook—new XSSFWorkbook(fis); 
		XSSFWorkbook workbook=(XSSFWorkbook)WorkbookFactory.create(fis,password); 
		XSSFSheet sheet=workbook. getSheetAt(0) ; 
		int rows=sheet.getLastRowNum(); 
		System. out. println(rows); // 5 started from 0
		int cols=sheet.getRow(0).getLastCellNum(); 
		System.out.println(cols); //3	started from 1 
//---------------read data from sheet using FOR LOOP----------------------
/*		for(int r=0;r<=rows; r++) {
			XSSFRow row=sheet.getRow(r);  
		for(int c=0;c<cols;c++) {//IF you face 'NULLPOINTER EXCEPTION' check FOR LOOP once
			XSSFCell cell =row.getCell(c); 
			switch (cell.getCellType())
			{
			case STRING: System. out. print (cell.getStringCellValue()); break; 
			case NUMERIC: System. out. print (cell.getNumericCellValue());break; 
			case BOOLEAN: System. out. print (cell.getBooleanCellValue()); break; 
			}
			System.out.print ( " |   ");
			}System.out.println(); */
//---------USING ITERATOR-------------------
		Iterator iterator = sheet.iterator();

		while(iterator.hasNext()) 
		{
			XSSFRow row = (XSSFRow) iterator.next();//write rhs,then write xssfrow ,mouse hover on it.next and add caseee
		Iterator cellIterator = row.cellIterator(); 

		while (cellIterator.hasNext()) 
		{
			 XSSFCell cell = (XSSFCell) cellIterator.next(); 

		switch (cell.getCellType())
		{
		case STRING: System. out. print (cell.getStringCellValue()); break; 
		case NUMERIC: System. out. print (cell.getNumericCellValue());break; 
		case BOOLEAN: System. out. print (cell.getBooleanCellValue()); break; 
		}
		System.out.print ( " |   ");
		}System.out.println();
			workbook.close();
			fis.close();
	}
}
}
