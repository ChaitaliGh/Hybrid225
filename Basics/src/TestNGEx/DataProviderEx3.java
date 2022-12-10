package TestNGEx;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataProviderEx3 {
	
	@Test(dataProvider="dp")
	public void f(String uname,String password) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.xpath("//button")).click();
	
	String expres="JavaByKiran | Dashboard";
	String actres=driver.getTitle();
	Assert.assertEquals(actres, expres);
}
	
	@DataProvider
	public Object[][] dp(){
		return new Object[][]{
			new Object[]{"jbk@gmail.com","123456"},
	        new Object[] {"kiran@gmail.com", "123456"},
		    new Object[] {"kiran@gmail.com","1234"},
				
		};
	

}
}