package com.Excel;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUsingMain {
	
	public static String readExcel() throws Exception{
		DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("login");
		
		int rows=sh.getLastRowNum();// here rows starts with 0, so the value of rows is 2
		System.out.println("Rows=" +rows);
		for(int i=0;i<=rows;i++) {
		  int cols=sh.getRow(i).getLastCellNum();
		  for(int j=0;j<=cols;j++) {
			  Cell c=sh.getRow(i).getCell(j);
			  System.out.print(df.formatCellValue(c)+ " ");
		  }
		  System.out.println();
		}
			
		
		
		
		return null;
		}
	
	public static void main(String[] args) throws Exception {
		readExcel();
		
	}

}
