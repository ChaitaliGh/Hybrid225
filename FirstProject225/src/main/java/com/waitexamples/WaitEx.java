package com.waitexamples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx {
	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		//browser level wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//Wait for 20 sec to load whole apge,if not throw TimeOut Exception
		
		//browser level wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Wait for 20 sec to load all web elements on whole browser.if not throw NoSuchElement Exception
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
		
		//Element specific wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(logo));
		//Element specific wait
		Wait w=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).
				pollingEvery(3,TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		w.until(ExpectedConditions.visibilityOf(logo));
		}

}
