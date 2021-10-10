package com.Amazon.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Amazon.Pages.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyAmazonSearchTest2 {
	
	public static String targetURL;
	public static String itemName ;

  @Test
  public void verifyValidSearchTest2() {
	  
			WebDriverManager.chromedriver().setup(); //setup any driver and we don't need to give the path and download as its is all handles by web driver manager
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			//reading the data from config.properties stored in resources.
			
			 ResourceBundle rb = ResourceBundle.getBundle("config2");
			 String targetURL = rb.getString("url");
			 String itemName = rb.getString("itemName");
			 
			
			
			//PropertiesFile.readPropertyFile();		//reading the data from properties file stored the same package 		
			
			driver.get(targetURL);
			
			SearchPage search = new SearchPage(driver);
			
			search.countItemsHome();
			
			search.searchItem(itemName);
			search.addItem();
			
			//PropertiesFile.writePropertyFile();
			
			
			driver.quit();
		}
  }

