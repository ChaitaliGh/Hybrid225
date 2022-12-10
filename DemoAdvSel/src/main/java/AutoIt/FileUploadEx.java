package AutoIt;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEx {
	
	WebDriver driver=null;
	
	@Test
	public void test01() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutoIt\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://javabykiran.com/playground/file-upload");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("D:/AutoIt/FileUpload.exe");
		
	}

}
