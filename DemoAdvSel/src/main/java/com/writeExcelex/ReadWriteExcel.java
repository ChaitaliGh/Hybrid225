package com.writeExcelex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteExcel {
	
	public static Sheet sh;
	public static Row row;
	public static Cell c;
	
	public static void writeCell(String sheet,int r,int col,String data) throws Exception {
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		if(wb.getSheet(sheet)==null) {//first if is to check if sheet is there or not
			sh=wb.createSheet(sheet);
			row=sh.createRow(r);
			c=row.createCell(col);
		}
		
		sh=wb.getSheet(sheet);//to read existing sheet
		
		if(sh.getRow(r)==null){//second if is to check row is there or not
			row=sh.createRow(r);
			c=row.createCell(col);
			
		}
		
		row=sh.getRow(r);//to read existing row
		
		if(row.getCell(col)==null) {
			c=row.createCell(col);
		}
		c=row.getCell(col);
		
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("TestData.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		
		
		
	}

}
