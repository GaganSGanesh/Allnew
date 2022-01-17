package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtility {
	public static FileInputStream fis;
	public static  Workbook wb;
	public static Sheet sh;
	public static Row rw;
	public static Cell cel;
	public String getData(String sheet,int row,int cell) throws Throwable {
		String value = null;
	try {
		fis=new FileInputStream("./data/demoData.xlsx");
		wb = WorkbookFactory.create(fis);
	Cell cel=	wb.getSheet(sheet).getRow(row).getCell(cell);
	value=cel.getStringCellValue();
		
	} catch (EncryptedDocumentException e) {
		System.out.println("unable to fetch the data");
	}
	System.out.println(value);
	return value;
	}

}
