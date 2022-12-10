package seleniumBasicsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		//WebElement we=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
			driver.navigate().to("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			// this method is also used to open a new website
			
		//methods of navigation interface are useful to go back and forward using history
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	
			
	}

}
