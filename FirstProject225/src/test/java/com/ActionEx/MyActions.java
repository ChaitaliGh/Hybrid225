package com.ActionEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActions {
	WebDriver driver=null;
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		WebElement logo=driver.findElement(By.xpath("/html/body/div/center/img"));
		Actions act=new Actions(driver);
		act.contextClick(logo).perform();
		driver.close();
		
		 driver=new ChromeDriver();
		 Actions act1=new Actions(driver);
		driver.get("http://javabykiran.com/playground/");
		WebElement link=driver.findElement(By.xpath("//a[text()='UPDATE User']"));
		act1.moveToElement(link).perform();
		
		WebElement link1=driver.findElement(By.xpath("//a[text()='CREATE User']"));

		act1.moveToElement(link1).pause(2000).contextClick(link1).build().perform();
		
	}

}
