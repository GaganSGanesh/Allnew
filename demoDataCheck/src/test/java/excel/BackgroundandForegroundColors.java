package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BackgroundandForegroundColors {
	public static void main(String[] args) throws IOException { 
		XSSFWorkbook workbook=new XSSFWorkbook(); 
		XSSFSheet sheet=workbook. createSheet("Sheetl"); 
		XSSFRow row=sheet . createRow(1); 
		// Setting Background color 
		XSSFCellStyle style=workbook.createCellStyle(); 
		style.setFillBackgroundColor( IndexedColors.BRIGHT_GREEN.getIndex() ) ; 
		style.setFillPattern(FillPatternType.BIG_SPOTS); 
		XSSFCell cell= row. createCell(1); 
		cell .setCellValue( "welcome" ) ; 
		cell .setCellStyle(style) ; 
		// Setting Foreground color 
		style=workbook . createCellStyle( ); 
		style.setFillBackgroundColor( IndexedColors.YELLOW.getIndex() ) ; 
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		XSSFCell cell1= row. createCell(2);
		cell1 .setCellValue( "Tester" ) ; 
		cell1 .setCellStyle(style) ; 
		
		FileOutputStream fos=new FileOutputStream(".\\data\\styles.xlsx") ; 
		workbook. write(fos); 
		workbook.close(); 
		fos.close();
	}
}
