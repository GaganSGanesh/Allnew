package demoDataCheck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifydata {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\demoData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int count=sh.getLastRowNum();
		System.out.println(count);//8-as 8 names are present
		String expdata="partha";
		for (int i=1;i<=count;i++)
		{
			Row row=sh.getRow(i);
			String ActData=row.getCell(0).getStringCellValue();
			System.out.println(ActData);
			if (ActData.equals(expdata))
			{
				System.out.println("data matches");
				break;
			}
		}
	}

}
