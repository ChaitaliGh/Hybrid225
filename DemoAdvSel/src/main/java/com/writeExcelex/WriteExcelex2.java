package com.writeExcelex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelex2 {
	
	public static Sheet sh;
	public static Row row;
	public static Cell c;
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		if(wb.getSheet("login")==null) {
			sh=wb.createSheet("login");
			row=sh.createRow(2);
			c=row.createCell(2);
			}
		sh=wb.getSheet("login");
		
		if(sh.getRow(2)==null) {
			row=sh.createRow(2);
			c=row.createCell(2);
		}
		
			row=sh.getRow(2);
			if(row.getCell(2)==null)
				c=row.createCell(2);
		
		c=row.getCell(2);
		c.setCellValue("Gajanan");
		FileOutputStream fos=new FileOutputStream("TestData.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
	}

}
