package seleniumBasicsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		//Actions class is used to perform actions like right click, double click,copy and paste
		Actions act=new Actions(driver);
		//act.contextClick().perform();
		
		WebElement we=driver.findElement(By.xpath("/html/body/div/div[2]/p"));
		act.doubleClick(we).perform();
		//act.contextClick(we).perform();
		
		//BELOW three lines are there to copy the code
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//Below lines are there to paste the code
		WebElement we1=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		act.keyDown(Keys.CONTROL);
		act.sendKeys(we1, "v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//perform backspace operation
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		//perform tab operation
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
