package com.Excel;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//In industry sometimes we need only one/cell value from function like to login to website then we use this code
public class ReadExcelSingleVal {
	
	
	
	public static String getCellData(int row,int col) throws Exception {
		DataFormatter df=new DataFormatter();
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("login");
		Cell c=sh.getRow(row).getCell(col);
		return df.formatCellValue(c);
		}
	
	public static int getRows() throws Exception {
		FileInputStream fis=new FileInputStream("TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("login");
		return sh.getLastRowNum();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getCellData(1,1));
		
	}

}
