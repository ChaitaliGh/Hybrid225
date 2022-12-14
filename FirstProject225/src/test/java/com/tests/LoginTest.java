package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UserPage;

public class LoginTest {
	WebDriver driver=null;
	LoginPage lp=null;
	DashboardPage dp=null;
	UserPage up=null;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 lp=new LoginPage(driver);
		 
		}
	
	@Test
	public void test01() {
		lp.loginToApplication("kiran@gmail.com","123456");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		}
	
	@Test
	public void test02() {
		String actualHeader=dp.getHeader();
		Assert.assertEquals(actualHeader, "Java By Kiran");
		}
	
	@Test
	public void test03() {
		up=dp.clickUser();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
}
