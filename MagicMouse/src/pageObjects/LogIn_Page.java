 package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver){
		
	try {

	element = driver.findElement(By.id("log"));
	
	Log.info("Textbox Username found");
	
	return element;
	
	}catch (Exception e){
	
	Log.error("Textbox Username is not found");
	
	throw(e);
	
	}

}

	public static WebElement txtbx_Password(WebDriver driver){
		
		try {

		element = driver.findElement(By.id("pwd"));
		
		Log.error("Textbox Password found");
		
		return element;
		
		}catch (Exception e){
		
		Log.error("Textbox Password is not found");
		
		throw(e);
		
		}
		
        
}

    public static WebElement btn_LogIn(WebDriver driver){
    	
    		try {

    		element = driver.findElement(By.id("login"));
    		
    		Log.info("Login Button found");
    		
    		return element;
    		
    		}catch (Exception e){
    		
    		Log.error("Login Button is not found");
    		
    		throw(e);
    		
    		}

}

}