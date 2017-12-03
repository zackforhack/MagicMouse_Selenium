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
	
	}catch (Exception e){
	
	Log.error("Textbox Username is not found");
	
	throw(e);
	
	}

	return element;
}

	public static WebElement txtbx_Password(WebDriver driver){
		
		try {

		element = driver.findElement(By.id("pwd"));
		
		}catch (Exception e){
		
		Log.error("Textbox Password is not found");
		
		throw(e);
		
		}
		
        return element;
}

    public static WebElement btn_LogIn(WebDriver driver){
    	
    		try {

    		element = driver.findElement(By.id("login"));
    		
    		}catch (Exception e){
    		
    		Log.error("Login Button is not found");
    		
    		throw(e);
    		
    		}

    		return element;
}

}