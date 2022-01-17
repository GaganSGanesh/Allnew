package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {
public static void main(String[] args) throws IOException { 
String excelFilePath=".\\data\\employeeUsingArrayList.xlsx"; 
FileInputStream inputstream=new FileInputStream(excelFilePath); 
XSSFWorkbook workbook=new XSSFWorkbook(inputstream); 
XSSFSheet sheet=workbook.getSheetAt(0); //XSSFSheet sheet=workbook.getsheet("Sheet1")
//----------- USING FOR LOOP----------------------------
int rows=sheet.getLastRowNum(); 
System.out.println(rows);
int cols=sheet.getRow(1).getLastCellNum(); 
System.out.println(cols);

for(int r=0;r<=rows;r++) {
	XSSFRow row=sheet.getRow(r);
	
	for(int c=0;c<cols;c++) {//if <,<= or some arthematic symbol change we will face "NULLPOINTER EXCEPTION" AND IT WILL SHOW THE ERROR IN DIFFERENT LINE
		XSSFCell cell=row.getCell(c);
		

switch(cell.getCellType()) 
{//if you dont specify this excel will throw error as nullpointer for the data type which is not mentioned,if no int means null
case STRING: System.out.print(cell.getStringCellValue()); break; 
case NUMERIC: System.out.print(cell.getNumericCellValue()); break; 
case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break; 
	}
System.out.print ( " |   ");
}System.out.println(); 

}
}
}

//--------------USING ITERATOR-------------------------
/*
Iterator<Row> iterator = sheet.iterator();

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
}
}
}*/