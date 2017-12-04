package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class Accessories_Page {
    private static WebElement element = null;
    
    public static WebElement magic_Mouse_col(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//div[h2[a[contains(text(),'Magic Mouse')]]]"));
	    
	    Log.info("Link to Magic Mouse Product Column found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Link to Magic Mouse Product Column is not found");
	    
	    throw(e);
	    
    		}

	}

    public static WebElement magic_Mouse_Add_To_Cart_Button(WebDriver driver){
    	
    		try {

	    element = driver.findElement(By.xpath("//input[@name='Buy']"));
	    
	    Log.info("Magic Mouse Add To Cart Button found");
	    
	    return element;
	    
    		}catch (Exception e){
	    
	    Log.error("Magic Mouse Add To Cart Button is not found");
	    
	    throw(e);
	    
    		}

	}
    
    public static Boolean item_Has_been_added_show(WebDriver driver){
    
    if(driver.findElement(By.xpath("//div[@class='alert addtocart' and @style='display: block;']"))!= null)
    {  	Log.info("Item Has Been Added Box SHow");
    	 	return true;
    }
    	
    else return false;
    	}

}
