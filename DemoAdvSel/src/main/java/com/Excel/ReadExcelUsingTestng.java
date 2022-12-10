package com.Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelUsingTestng {
	
	public String getCellData() throws Exception {
		DataFormatter df=new DataFormatter();//It gives us the formatted value of a cell as string regardless 
		//of the cell type
		FileInputStream fis=new FileInputStream("TestData.xls");//It gives the excel file
		Workbook wb=WorkbookFactory.create(fis);//workbook means group of sheets
		Sheet sh=wb.getSheet("data");//it gives the required sheet from workbook
		int rows=sh.getLastRowNum();//gives last row no with data
		for(int i=0;i<=rows;i++) {
			int cols=sh.getRow(i).getLastCellNum();//it gives the total columns
			for(int j=0;j<cols;j++) {
				Cell c=sh.getRow(i).getCell(j);//it gives the cell at mentioned row & column
				System.out.print(df.formatCellValue(c)+ " ");//it converts data type of every value at mentioned
				//cell to String 
			}
			System.out.println();
		}
		
		
		return null;
	}



@Test
public void test1() throws Exception {
	getCellData();
}
}