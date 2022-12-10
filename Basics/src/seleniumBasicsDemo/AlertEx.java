package seleniumBasicsDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();	
	
    System.out.println(driver.switchTo().alert().getText());	
    driver.switchTo().alert().accept();
    //System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();
	 //System.out.println(driver.switchTo().alert().getText());
	
	}
}
