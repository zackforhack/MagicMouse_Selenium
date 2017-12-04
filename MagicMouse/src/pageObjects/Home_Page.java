package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

 public class Home_Page {

	 
    private static WebElement element = null;
    

 public static WebElement lnk_MyAccount(WebDriver driver){
	 
	try {

    element = driver.findElement(By.id("account"));
    
    Log.info("Link to My account found.");
    
    return element;
    
    }catch (Exception e){

        Log.error("Link to My account is not found.");

        throw(e);

    }

    }

 public static WebElement lnk_LogOut(WebDriver driver){
	 
	try {

    element = driver.findElement(By.id("account_logout"));
    
    Log.info("Link to logout found");
    
    return element;
    
	}catch (Exception e){
    
		Log.error("Link to logout is not found");
		
		throw(e);
    
	}

    }
 
 public static WebElement product_Category_tab(WebDriver driver){
	 
	 	try {

	    element = driver.findElement(By.xpath("//a[contains(text(),'Product Category')]"));
	    
	    Log.info("Product Category tab found");
	    
	    return element;
	    
	 	}catch (Exception e){
	 	    
			Log.error("Product Category tab is not found");
			
			throw(e);
	    
		}

	}
 
 public static WebElement lnk_accessories(WebDriver driver){
	 
	 	try {
	 
	    element = driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
	    
	    Log.info("Link to Accessories found");
	    
	    return element;
	    
	 	}catch (Exception e){
	    
	 		Log.error("Link to Accessories is not found");
	 		
			throw(e);
		    
		}

	}
 
 public static WebElement lnk_Checkout(WebDriver driver){
	 
	 	try {
	 
	    element = driver.findElement(By.xpath("//a[@title='Checkout']"));
	    
	    Log.info("Link to Checkout found");
	    
	    return element;
	    
	 	}catch (Exception e){
	    
	    Log.error("Link to Checkout is not found");

		throw(e);
	    
	    }

	}

}