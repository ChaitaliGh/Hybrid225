package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtils{
	
	public static String readProperty(String key) throws Exception {
	
	String path=System.getProperty("user.dir") + "/src/main/resources/config.properties";
	
	/*Above total path of property file is "C:\Users\Chaitali\eclipse-workspace\OJT Selenium\HybridFramework225\src\main\resources\config.properties" 
	but this cannot work for everyone as local path will be different so we copied path from src will be same for all
	so we kept it as it is and System.getProperty("user.dir") will give respective local path for everyone
	*/
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(path);//for file reading and writing file we need FileInputStream
	prop.load(fis);
	return prop.getProperty(key);
}
	
	
}

