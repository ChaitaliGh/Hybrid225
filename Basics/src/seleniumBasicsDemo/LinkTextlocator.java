package seleniumBasicsDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class LinkTextlocator {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		// Below mentioned two locators are only used for anchor tags
		driver.findElement(By.linkText("Register a new membership")).click();
		driver.findElement(By.partialLinkText("Register")).click();
		
	}
	

}
