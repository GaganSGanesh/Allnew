package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {
public static void main(String[] args) throws IOException { 
XSSFWorkbook workbook=new XSSFWorkbook(); 
XSSFSheet sheet=workbook. createSheet( "Emp Info");
//------------------Storing data using 2 dimensional array-----------
/*Object empdata[][]= { 
{ " EmplD" , "Name " , " Job"}, 
{101, "David" , " Enginner"}, 
{102, "Smith" , "Manager" } , 
{103, "Scott" , "Analyst"} };
*/
//---------------Storing data using arrayList----------
ArrayList<Object[]> empdata=new ArrayList<Object[]>(); 
empdata.add(new Object[] {"Empid","Name","Job"}); 
empdata.add(new Object[] {"100","Patric","Production"}); 
empdata.add(new Object[] {"101","Jordan","Singer"}); 
empdata.add(new Object[] {"102","Chainz","Artist"}); 

//-----------Using for loop[Cannot use for arrayList]----------------- 
/*
int rows=empdata.length; 
int cols=empdata[0].length; 
System. out. println(rows) ; //4 
System. out. println(cols); //3 
//using for loop
/*
for (int r=0;r<rows;r++) {
	XSSFRow row=sheet.createRow(r); 
	for(int c=0;c<cols;c++) {
		XSSFCell cell=row.createCell(c); 
		Object value=empdata [r][c];
		if(value instanceof String) 
		cell.setCellValue((String) value); 
		if(value instanceof Integer) 
			cell.setCellValue( (Integer)value) ; 
		if(value instanceof Boolean) 
			cell.setCellValue( (Boolean)value) ; 
	}
}*/

//-----------for each loop for ARRAYLIST-------------------------------
int rowCount=0; 
for(Object emp[]:empdata) {
XSSFRow row=sheet . createRow(rowCount++); 
int columnCount=0; 
for(Object value:emp) {
XSSFCell cell=row.createCell(columnCount++); 
if(value instanceof String) 
cell.setCellValue((String)value); 
if(value instanceof Integer) 
	cell.setCellValue( (Integer)value) ; 
if(value instanceof Boolean) 
	cell.setCellValue( (Boolean)value) ; 
}
}
//--------------------------------------------------------------------------

//-----------------using for each loop[for 2 dimensional Array]--------------
/*
int rowCount=0; 
for(Object emp[]: empdata) 
{
XSSFRow row=sheet.createRow(rowCount++); 
int columnCount=0; 
for(Object value:emp) {
	
XSSFCell cell=row.createCell(columnCount++); 
if(value instanceof String) 
	cell.setCellValue((String)value); 
if(value instanceof Integer) 
	cell.setCellValue( (Integer)value) ; 
if(value instanceof Boolean) 
cell.setCellValue( (Boolean)value);
}
}*/
//-----outpath-----------
		String filePath=".\\data\\employeeUsingArrayList.xlsx" ; 
		FileOutputStream outstream=new FileOutputStream(filePath) ; 
		workbook. write(outstream); 
		outstream.close(); 
		System.out.println("written successfully");
	}

}

