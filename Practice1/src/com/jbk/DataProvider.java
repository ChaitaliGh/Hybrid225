package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver=null;
	
	@Test(dataProvider="dp")
	public void function(String uname,String password) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button")).click();
		
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}

	
			
}
