package com.javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	
	static WebDriver driver;
	RemoteWebDriver re;
	
	public void waitForElement(WebElement element, long time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void moveAndClick(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click(element).build().perform();
	}
	
	public static void scrollingToView(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;//type casting
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	@Test
	public void test01()throws Exception{
		
		WebElement uname,pass;
		RemoteWebDriver rd;
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;//object of JavascriptExecutor is created using
		//type casting as JavascriptExecutor is a interface
		
		System.out.println(driver.getCurrentUrl());//using selenium
		System.out.println("URL printed by jS:" +js.executeScript("return document.URL;"));//using JavascriptExecutor
		
		System.out.println(driver.getTitle());
		System.out.println("Title printed by js:" +js.executeScript("return document.title;"));
			
		//changing title by js
		js.executeScript("document.title='updated title';");
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//refreshing browser by normal method
		js.executeScript("history.go(0);");//refreshing browser by js
		
		//clicking element by js
		js.executeScript("arguments[0].click();", uname=driver.findElement(By.id("email")));
		
		//instead of .sendKeys() we can use following method of js to send values
		js.executeScript("document.getElementById('email').value='kiran@gmail.com';");
		
		
		js.executeScript("arguments[0].click();",pass=driver.findElement(By.id("password")));
		
		js.executeScript("document.getElementById('password').value='123456';");
		
		//creating alert by js
		js.executeScript("alert('Hello World');");
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		Thread.sleep(5000);
		al.accept();
		
		//Navigating to other url by js
		js.executeScript("window.location='https://www.amazon.in/'");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement footer_logo=driver.findElement(By.xpath("//a[@href='/ref=footer_logo']"));
		js.executeScript("arguments[0].scrollIntoView(true);", footer_logo);//scrolling
		
	}

}
