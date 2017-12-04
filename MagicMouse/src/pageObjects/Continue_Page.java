package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class Continue_Page {
	
    private static WebElement element = null;
    private static Select dropdown = null;
    
    public static WebElement txtbx_Billingemail(WebDriver driver){
    	
    		try {
    	
    	    WebDriverWait wait = new WebDriverWait(driver, 15);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='billingemail']")));
        
        Log.info("Textbox Billingemail found");
        
        return element;
        
    		} catch (Exception e){

	    Log.error("Textbox Billingemail is not found");
	    
	    throw(e);
	    
    		}

	    

	}
    
    public static WebElement txtbx_Billingfirstname(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@title='billingfirstname']"));
	    
	    Log.info("Textbox Billingfirstname found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billingfirstname is not found");
	    
		throw(e);
	    
    		}

	}
    
    public static WebElement txtbx_Billinglastname(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@title='billinglastname']"));
	    
	    Log.info("Textbox Billinglastname found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billinglastname is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static WebElement txtbx_Billingaddress(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//textarea[@title='billingaddress']"));
	    
	    Log.info("Textbox Billingaddress found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billingaddress is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static WebElement txtbx_Billingcity(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@title='billingcity']"));
	    
	    Log.info("Textbox Billingcity found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billingcity is not found");
	    
	    throw(e);
	    
    		}

	}

    public static WebElement txtbx_Billingphone(WebDriver driver){
    	
    	try {

	    element = driver.findElement(By.xpath("//input[@title='billingphone']"));
	    
	    Log.info("Textbox Billingphone number found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billingphone number is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static Select dropdown_Billingcountry(WebDriver driver){
    	
    		try {

    	    dropdown = new Select(driver.findElement(By.id("wpsc_checkout_form_7")));
    	    
    	    Log.info("Dropdown box Billingcountry found");
    	    
    	    return dropdown;
    	    
    		}catch (Exception e){
    	    
    	    Log.error("Dropdown box Billingcountry is not found");
    	    
    	    throw(e);
    	    
    		}

	}
    
    public static WebElement txtbx_Billingstate(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@title='billingstate']"));
	    
	    Log.info("Textbox Billingstate number found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Billingstate number is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static WebElement txtbx_Shippingstate(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@title='shippingstate']"));
	    
	    Log.info("Textbox Shippingstate number found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Textbox Shippingstate number is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static WebElement purchase_btn(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@value='Purchase']"));
	    
	    Log.info("Purchase button found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Purchase button is not found");
	    
	    throw(e);
	    
    		}

	}
}
