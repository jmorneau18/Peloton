package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigat {
	private static WebElement element = null;
		
    /*
     * Pre: Web Driver
     * 
     * Post: clicks the shop link in the nav bar
     * */
	public static WebElement goToShop(WebDriver driver){
		element = driver.findElement(By.linkText("SHOP"))	;
		return element;
	}
    /*
     * Pre: Web Driver
     * 
     * Post: clicks the Choose Options button on the default shop option
     * */
	public static WebElement options(WebDriver driver) {
		element = driver.findElement(By.linkText("CHOOSE OPTIONS"));
		return element;	
	}
    /*
     * Pre: Web Driver
     * 
     * Post: clicks add to cart for the default shop option with the default settings
     * */
	public static WebElement cart(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='shop-footer__btn-inner']"));
		return element;
	}

}
