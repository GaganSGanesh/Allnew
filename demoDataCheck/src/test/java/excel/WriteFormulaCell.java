package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell {
	//------This is mainly used to modify/change existing file--------
	public static void main(String[] args) throws IOException { 
		String path=".\\data\\writeFormulaCell.xlsx"; 
		FileInputStream fis=new FileInputStream(path); 
		XSSFWorkbook workbook=new XSSFWorkbook(fis); 
		XSSFSheet sheet=workbook. getSheetAt(0) ; 
		sheet.getRow(7).getCell(2).setCellFormula("SUM(C2:C6)");//(from c2 coloum to c6 column)
		fis.close(); 
		FileOutputStream fos=new FileOutputStream(path); 
		workbook.write(fos); 
		workbook.close(); 
		fos.close();
		System.out.println("done");//Once you get the done print --check xlsx file it will be updated
	}
}
