package excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceldata2 {
		public static void main (String[] args) throws Exception { 
		// TODO Auto-generated method stub 
		File src=new File(".\\data\\employeeUsingArrayList.xlsx"); 
		FileInputStream fis=new FileInputStream(src); 
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet=wb.getSheetAt(0); 
		int rowcount=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum(); 
		System.out.println("Total rows is"+rowcount); 
		for(int i=0;i<rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int c=0;c<=cols;c++) {
				XSSFCell cell=row.getCell(c);
		String data0=sheet.getRow(i).getCell(c).getStringCellValue(); 
			System.out.println("data from row"+i+"is"+data0);
		wb.close();
		}
}
}
}