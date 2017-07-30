package POM;

import org.openqa.selenium.WebDriver;

public class Validation {
	public static final String USERNAME = "pelotonqa@gmail.com";
	public static final String PASSWORD = "ILoveToRide";
	
	public static final String BADURL = "https://www.pelotoncycle.com/login?redirect=/profile/";
	public static final String GOODURL = "https://www.pelotoncycle.com/profile/";
	
    /*
     * Pre: uname- username to test
     * 		password - password to test 
     * 		driver - a webdriver
     * 
     * Post: outputs whether the test passed or failed in the console
     * */
	
	public static void Validate(String uname, String password, WebDriver driver) {
//		String currentURL = driver.getCurrentUrl();
		if(uname != null || PASSWORD != null ) {
			if(uname == USERNAME && PASSWORD == password ) {
				 System.out.println(" Login Successfull - pass" /* && currentURL == GOODURL*/);
			}
			
			else if(uname != USERNAME || PASSWORD != password /* && currentURL == BADURL*/) {
				System.out.println(" Login Unsuccessfull - pass");
			}
			else if(uname == USERNAME && PASSWORD == password /* && currentURL == BADURL*/) {
				System.out.println(" Login Unsuccessfull - FAIL");
			}
			else if(uname != USERNAME || PASSWORD != password /* && currentURL == GOODURL*/) {
				System.out.println("SOMETHING IS WRONG! PEOPLE CAN LOG IN WITHOUT PROPER CREDENTIALS - FAIL");
			}
			
			else {
		
				System.out.println("input was null - FAIL");
				
			}
		}
		else {
			System.out.println("One of the inputs was null - please fix.");
		}
	}
}
