package com.Window;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandleEx {
	
	@Test
	public void test01(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		
		List<WebElement> links=driver.findElements(By.partialLinkText("More info"));//It gives 4 elements
		String mainWin=driver.getWindowHandle();
		
		for(WebElement link:links) 
			link.click(); //It will give 5 windows,1 main window & 4 child windows
		
		Set<String> allWins=driver.getWindowHandles();
		for(String win:allWins) {
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}
		}
		
		
		
		
	}

}
