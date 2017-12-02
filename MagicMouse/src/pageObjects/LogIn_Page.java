 package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import utility.Log;

public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver){

	element = driver.findElement(By.id("log"));
	
	Log.info("Textbox Username found");

	return element;
}

	public static WebElement txtbx_Password(WebDriver driver){

		element = driver.findElement(By.id("pwd"));
		
		Log.info("Textbox Password found");
		
        return element;
}

    public static WebElement btn_LogIn(WebDriver driver){

    		element = driver.findElement(By.id("login"));
    		
    		Log.info("Login Button found");

    		return element;
}

}