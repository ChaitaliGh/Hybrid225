package com.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Excel.ReadExcelSingleVal;//imported class ReadExcelSingleVal from com.Excel package
import com.writeExcelex.ReadWriteExcel;////imported class ReadWriteExcel from com.Excel package

public class LoginWithExcel {

	int count=1;
	@Test
	public void loginTest() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/add_user.html");
		
		while(count<=ReadExcelSingleVal.getRows()) {
		
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

		String username=ReadExcelSingleVal.getCellData(count, 0);//using getCellData() from ReadExcelSingleVal class
		String password=ReadExcelSingleVal.getCellData(count, 1);//using getCellData() from ReadExcelSingleVal class

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		
		if(driver.getTitle().contains("Dashboard"))
			ReadWriteExcel.writeCell("login",count,2,"PASS");//using writeCell() from readWriteExcel class
		else
			ReadWriteExcel.writeCell("login",count,2,"FAIL");//using writeCell() from readWriteExcel class
		count++;
		}	
		
	}
}
