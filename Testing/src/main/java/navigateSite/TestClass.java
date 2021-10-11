package navigateSite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass {
	static WebDriver driver;
	
	//main execution
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String targetURL="https://www.amazon.in/";
		driver.get(targetURL);
		driver.manage().window().maximize();
		System.out.println("Launched url:'"+targetURL+"' successfully");
		WebElement mobileNavigation = fetchObject(Objects.mobileNav);
		mobileNavigation.click();
		System.out.println("Clicked on 'Mobiles' link in top navigation.");
		WebElement mobileNAccessories = fetchObject(Objects.mobileNAccessories);
		mobileNAccessories.click();
		
		System.out.println("Clicked on 'Mobiles & Accessories' link in submenu.");
		
		WebElement smartPhones = fetchObject(Objects.smartPhones);
		smartPhones.click();
		System.out.println("Clicked on Smartphones & Basic Mobiles");
		
		WebElement selectPhone = fetchObject(Objects.selectPhone);
		selectPhone.click();
		System.out.println("Select the first samsung phone");
		
		WebElement addToCart = fetchObject(Objects.addToCart);
		addToCart.click();
		System.out.println("Click on Add to Cart button");
		
		WebElement goToCart = fetchObject(Objects.goToCart);
		goToCart.click();
		System.out.println("Click on Cart button");
		
		
		
	//	WebElement laptopNAccessories = fetchObject(pageObjects.laptopNAccessories);
	//	laptopNAccessories.click();
		
	//	System.out.println("Clicked on 'Laptops & Accessories' link in submenu.");
	//	WebElement computerComponents = fetchObject(pageObjects.computerComponents);
	//	computerComponents.click();
	//	System.out.println("Clicked on 'Components' filer item.");
		System.out.println("****Execution Completed*****");
		
		//driver.close();
		//driver.quit();
	}
	
	//TO fetch objects and check if they are visible on page
	private static WebElement fetchObject(String objRef) {
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(objRef)));
		
		WebElement reqObj = driver.findElement(By.xpath(objRef));
		if(reqObj!=null)
			return reqObj;
		else
			System.out.println("Required object not found on page.");
			System.exit(1);
		return null;
		
	}
}
