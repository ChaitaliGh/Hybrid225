package com.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameEx {
	
	@Test
	public void test01() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		Thread.sleep(5000);
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234567");
		
		
	}

}
