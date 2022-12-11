package com.utils;

//this class is used to take screenshots
import com.base.BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DriverUtils extends BaseClass{
	
	public static String getScreenshot(String name) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;//TakesScreenshot is a interface so while creating object
		//we type casts it with driver
		File src=ts.getScreenshotAs(OutputType.FILE);//getScreenshotAs is method of TakesScreenshot interface 
		//which returns file so we stored it in src
		
		String path=System.getProperty("user.dir")+"/screenshots/" +name+ ".jpg";//we created path for the file
		//to be stored
		
		File dest=new File(path);//file created at mentioned path
		FileUtils.copyFile(src, dest);//file in src will be saved in dest
		
		return path;
		
		}

}
