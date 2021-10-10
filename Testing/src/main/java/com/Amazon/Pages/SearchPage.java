/**
 * 
 */
package com.Amazon.Pages;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * @author Sam
 *
 *
 *This class will store all the locators and methods of Search Page
 */
public class SearchPage {
	
	WebDriver driver;
	
	By searchBox = By.id("twotabsearchtextbox");
	By searchButton = By.xpath("//input[@id ='nav-search-submit-button']");
	By phoneLink = By.partialLinkText("Apple iPhone 13 Mini (256GB)");
	By addToCartButton = By.cssSelector("input#add-to-cart-button");
	By goToCart = By.cssSelector("span#nav-cart-count");
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
		
	
	public void countItemsHome() {
		
		//int numberofItems = driver.findElements(By.className("feed-carousel-card _deals-shoveler-v2_style_dealCard__1HqkZ")).size();
		//System.out.println(numberofItems);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Links : "+Links.size()); 
		
		for (WebElement el:Links ) {
			
			System.out.println("Name of link is  "+ el.getText());
			if (el.getText().equals("Sam")) {
				
				el.click();
				break;
			}
			
		}
		
		
	}
	
	public void searchItem(String itemName) 
	{
		driver.findElement(searchBox).sendKeys(itemName);
		driver.findElement(searchButton).click();
	}
	
	public void addItem() {
		
		
		//clicking the link of the iPhone
		
		driver.findElement(phoneLink).click();
		
		// shows the title of the page opened
	
		System.out.println("Title of the Page is:" + driver.getTitle());
		
		// code to store the number of open windows
		
		Set <String> s = driver.getWindowHandles();   //returns the ids or key values of the browser/window
		
		
		//code to switch to a window and to close a window
		
		for (String i:s)
		{
		 //String t = driver.switchTo().window(i).getTitle();
		 driver.switchTo().window(i);
		 
		 	//if(t.contains("iPhone"))
		 	//{
		 	//	driver.close();
		 	//}
		 
		} 	
		
		
		
		//Click on add to cart
		driver.findElement(addToCartButton).click();
		
		//navigate to cart
		
		driver.findElement(goToCart).click();
		
		if(driver.getTitle().contains("Cart") == true)
			System.out.println("iPhone added to cart - test case successfull.");
//		else
//			System.out.println("Required object not found on page.");
//			System.exit(1);
//		return null;
		
		
		
		
	}
	
//	public static WebElement  waitForElementPrensence(WebDriver driver,By locator ,int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//		return driver.findElement(locator);
//		
//		
//	}

}
