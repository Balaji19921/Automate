package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {

		File file = new File(".//src//test//java//com//adactin/properties//Adactin.properties");
		FileInputStream fis = new FileInputStream(file);
		// Properties p =new Properties();
		p = new Properties();
		p.load(fis);

	}

	public static String getBrowserName() {
		String browserName = p.getProperty("browsername");
		return browserName;
	}

	
	  
	public static String getUrl1() {
		String url = p.getProperty("url");
		return url;

	}

}
