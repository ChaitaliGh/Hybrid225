package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginStepDef {

	WebDriver driver=null;
	@Given("^user should enter URL$")
	public void user_should_enter_URL() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver=new ChromeDriver();
	    driver.get("file:///C:/Users/Chaitali/Downloads/javabykiran-Selenium-Softwares(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	    
	}

	@Then("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	   Assert.assertEquals("JavaByKiran | Log in",driver.getTitle() );
	}
	
	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
	   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
	}

	@Then("^user should navigate dashboard page$")
	public void user_should_navigate_dashboard_page() throws Throwable {
	    
		Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}

	
}
