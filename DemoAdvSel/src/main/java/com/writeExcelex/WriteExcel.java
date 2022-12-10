package com.writeExcelex;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class WriteExcel {
	
	public static Sheet sh=null;
	public static Row row=null;
	public static Cell c=null;
	
	public static void main(String[] args)throws Exception {
		
		FileInputStream fis=new FileInputStream("TestData.xls");
		Workbook wb=WorkbookFactory.create(fis);
		
		if(wb.getSheet("data")==null) //if sheet is not there then we will create sheet,row and cell
		{
			sh=wb.createSheet("login");
			row=sh.createRow(4);
			c=row.createCell(3);
			
		}	
		else//if sheet is there, it will give us that sheet
			sh=wb.getSheet("data");
		
		if(sh.getRow(4)==null) {//if row is null then we create row and cell
			row=sh.createRow(4);
			c=row.createCell(3);
			
		}
		else {//to read existing row
			row=sh.getRow(4);
			if(row.getCell(3)==null) {//if cell is null then we will create cell
				c=row.createCell(3);
			}
		}
		c.setCellValue("selenium");
		
		FileOutputStream fos=new FileOutputStream("TestData.xls");
		wb.write(fos);
		wb.close();
		fos.close();
		
		
		
		
		
	}
}
