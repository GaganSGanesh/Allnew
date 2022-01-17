package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws IOException {
		String path=".\\data\\demoData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
	
		Iterator iterator = sheet.iterator();//util
		while(iterator.hasNext())
		{
			XSSFRow row = (XSSFRow) iterator.next();
			Iterator celliterator = row.cellIterator();
			
			while(celliterator.hasNext())
			{
				XSSFCell cell=(XSSFCell) celliterator.next();
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.println(cell.getStringCellValue());break;
				case BOOLEAN:System.out.println(cell.getStringCellValue());break;
				
				}
				System.out.print("|");
			}System.out.println();
		}
		 
	
	
	
	
	
	}

}
