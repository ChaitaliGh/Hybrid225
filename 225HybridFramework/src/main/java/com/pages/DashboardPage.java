package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pages.UserPage;

public class DashboardPage extends BaseClass{
public WebDriver driver;
	
	@FindBy(xpath="//[text()='Java By Kiran']")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public UserPage clickUser() {
		userBtn.click();
		return new UserPage(driver);//when we click on user ,it will open User Page so , it returns UserPage object
	}

	public String checkHeader() {
		return header.getText();
	}

}
