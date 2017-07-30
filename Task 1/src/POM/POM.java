/*
 * Pre: Must have Eclipse IDE for Java EE Developers installed on your computer
 * 	Open Eclipse & Click File "Open" -> navigate to "Task 1 -> src -> POM -> open all .java files
 * 
 * To run: in the POM.java file click the large green play button in the top left corner 
 * 	(
 * 
 * Post: Look at the output in Eclipse to see if your test passed or failed
 * */

package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPage;
import POM.Validation;
import POM.Navigat;

/*Public Class POM*/
public class POM {
	private static WebDriver driver = null;
	public static final String USERNAME = "pelotonqa@gmail.com";
	public static final String PASSWORD = "ILoveToRide";
	public static final String USERNAME1 = "peloton@gmail.com";
	public static final String PASSWORD1 = "ILoveMyJob";
	

	/*POM main*/
	/*
	 * Runs the Navigate Test once,
	 * Runs the Login Test 3 times
	 * 
	 * Will return the Pass/Fail results to the Console 
	 * */
	public static void main(String[] args) {
		System.setProperty("chromedriver", "./");
		
		driver = new ChromeDriver();
		navigateTest();
		
		driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    test(USERNAME, PASSWORD);
	       
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    test(USERNAME, PASSWORD1);
	    
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    test(USERNAME1, PASSWORD);
		
		

	}
	/*
	 * Pre: uname - The username the tester would like to input into the username field
	 * 		pass - the password the tester would like to input into the password field
	 * 
	 * Post: Logs whether the Login was successful and if the test passed or failed to the console
	 * 
	 * */
	public static void test(String uname, String pass) {
		
		 LoginPage.goToLoginScreen(driver);
		 
	     LoginPage.username(driver).sendKeys(uname);
	 
	     LoginPage.password(driver).sendKeys(pass);
	 
	     LoginPage.login(driver); 
	     
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     Validation.Validate(uname, pass, driver);	     
	 
	     driver.quit();
	}
	
	/*
	 * Pre: none
	 * 
	 * Post: Runs the navigate test to add the default bike to your cart
	 * 
	 * *IMPORTANT* driver.quit() is commented out to show the user the proper bike is in your cart
	 * 	** UNCOMMENT IF YOU WANT THE TEST BROWSER TO CLOSE
	 * 
	 * */
	public static void navigateTest()
	{
		 LoginPage.goToLoginScreen(driver);
		 
	     LoginPage.username(driver).sendKeys(USERNAME);
	 
	     LoginPage.password(driver).sendKeys(PASSWORD);
	 
	     LoginPage.login(driver);
	     
	     Navigat.goToShop(driver).click();
	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	     Navigat.options(driver).click();
	     Navigat.cart(driver).click();
//	     driver.quit();
	     
	}
}
