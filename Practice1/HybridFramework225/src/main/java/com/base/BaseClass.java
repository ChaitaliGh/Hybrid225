package com.base;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.PropertyUtils;
import com.base.BaseClass;

public class BaseClass {

	public static WebDriver driver=null;
	
	public static ExtentReports report=null;  //to initialize these reports ,reportInit() method is there below
	public static ExtentSparkReporter spark=null;  //to initialize these reports ,reportInit() method is there below
	public static ExtentTest test=null;  //to initialize these reports ,reportInit() method is there below

	
	public static Logger Log=Logger.getLogger(BaseClass.class);
	//here getlogger is a static method of Logger class
	//which return object of Logger class
	
	
	public static void initialization() throws Exception {
		
        System.out.println("reading property file for browser name");
		
		Log.info("reading property file for browser name");//this is a replacement of sop statement above, it 
		// will print message on console as well as save it in file
		String browserName=PropertyUtils.readProperty("browser");
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
		driver.manage().window().maximize();
		driver.get(PropertyUtils.readProperty("url"));
	}
	
	public void reportInit() {
		report=new ExtentReports();
		spark=new ExtentSparkReporter(System.getProperty("user.dir") +"/target/ExtentReport.html");
		//above we are providing path where report file will be created
		report.attachReporter(spark);//report and spark are attached here. This method runs when suite starts ,so it is called in Listener class
	}
	
	
	
	
}
