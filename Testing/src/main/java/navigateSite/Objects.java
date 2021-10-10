package navigateSite;

//to store object references
public class Objects {	
	public static final String mobileNav = "//div[@id='nav-main']//div[@class='nav-fill']//a[text()='Mobiles']";
	public static final String mobileNAccessories = "//*[@id='nav-progressive-subnav']//a[contains(.,'Mobiles & Accessories')]";
	public static final String laptopNAccessories = "//*[@id='nav-progressive-subnav']//a[contains(.,'Laptops & Accessories')]";
	public static final String computerComponents = "//ul[contains(@class,'a-unordered-list')]//span[@class='a-list-item' and contains (.,'Components')]";
	public static final String smartPhones = "//div[@id='s-refinements']//span[text()='Smartphones & Basic Mobiles']";
	public static final String selectPhone = "(//*[contains(@class,'octopus-best-seller-card')]//span[contains(text(),'Samsung')])[1]";
	public static final String addToCart = "//input[@id ='add-to-cart-button']";
	public static final String goToCart ="//span[@id='attach-sidesheet-view-cart-button']";

			
	
}
