package seleniumBasicsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		System.out.println(driver.getTitle());
		
		
		//using tagname locator
		String s=driver.findElement(By.tagName("b")).getText();
		System.out.println(s);
		
		//whenever there is a anchor tag is there in inspect then we can two locators in selenium which wre mentioned below
		//driver.findElement(By.linkText("Register a new membership")).click();
	}

}
