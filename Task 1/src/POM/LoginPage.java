package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

public class LoginPage {
	private static WebElement element = null;
    public static final String URL_LOGIN = "https://www.pelotoncycle.com/login";
    
    /*
     * Pre: Web Driver
     * 
     * Post: sends you to login screen
     * */
    public static void goToLoginScreen(WebDriver driver) {
    		driver.get(URL_LOGIN);
    }
    /*
     * Pre: Web Driver
     * 
     * Post: hits enter as a user would 
     * */
    public static void login(WebDriver driver) {
    		element.sendKeys(Keys.RETURN);
    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    /*
     * Pre: Web Driver
     * 
     * Post: gets the text box the user would type their username into
     * */
    public static WebElement username (WebDriver driver) {

        element = driver.findElement(By.name("usernameOrEmail"));
        
        return element;
    }
    /*
     * Pre: Web Driver
     * 
     * Post: gets the text box the user would type their password into
     * */
    public static WebElement password (WebDriver driver) {
        element = driver.findElement(By.name("password"));
        
        return element;
    }

}
