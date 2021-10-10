/**
 * 
 */
package com.Amazon.Pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.Amazon.TestCases.VerifyAmazonSearch;

/**
 * @author sam
 *
 */
public class PropertiesFile {
	
	public static Properties prop = new Properties();
	
	
	public static void readPropertyFile() {
		
		
		try {
			InputStream input = new FileInputStream("/Users/Samriddhi/eclipse-workspace/Testing/src/main/java/com/Amazon/Pages/config.properties");
			prop.load(input);
			prop.getProperty("url");
			prop.getProperty("itemName");
			
			VerifyAmazonSearch.itemName = prop.getProperty("itemName");
			VerifyAmazonSearch.targetURL = prop.getProperty("url");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public static void writePropertyFile() {
		
		
		try {
			OutputStream output = new FileOutputStream("/Users/Samriddhi/eclipse-workspace/Testing/src/main/java/com/Amazon/Pages/config.properties");
			prop.setProperty("DoneBy", "Sam");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}



