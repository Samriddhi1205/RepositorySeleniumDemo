
	package com.Amazon.TestCases;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import java.util.ResourceBundle;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.Amazon.Pages.SearchPage;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	/**
	 * @author Sam
	 *
	 */



	public class VerifyAddToCartTest {
		
		WebDriver driver;
		
		public static String targetURL;
		public static String itemName ;
		
		
		
		@BeforeMethod
		
		public void setup() {
			
			
			//WebDriverManager.chromedriver().setup(); //setup any driver and we don't need to give the path and download as its is all handles by web driver manager
			//WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			ResourceBundle rb = ResourceBundle.getBundle("config");
			 String targetURL = rb.getString("url");
			 driver.get(targetURL);		
		}
		
		@Test(priority=1)
		public void cartItem()	{
			
			//reading the data from config.properties stored in resources.
			 ResourceBundle rb = ResourceBundle.getBundle("config");
			 String itemName = rb.getString("itemName");
			//PropertiesFile.readPropertyFile();		//reading the data from properties file stored the same package 				
				 
			 SearchPage search = new SearchPage(driver);		
			 search.countItemsHome();		
			 search.searchItem(itemName);
			 search.addItem();
			
		}
		
		
		  @Test(priority=2) 
		  public void cartItem2() {
		  
		  //reading the data from config.properties stored in resources. 
			  ResourceBundle rb = ResourceBundle.getBundle("config"); 
			  String itemName = rb.getString("itemName2"); 
			  SearchPage search = new SearchPage(driver);
		      search.countItemsHome();
		      search.searchItem(itemName); 
		      search.addItem();
		  
		  }
		 
			
			
		@AfterMethod
		
		public void exitApp() {
			
			driver.quit();
		}

	}



