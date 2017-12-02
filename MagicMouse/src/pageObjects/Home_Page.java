package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Log;

 public class Home_Page {

	 
    private static WebElement element = null;
    

 public static WebElement lnk_MyAccount(WebDriver driver){

    element = driver.findElement(By.id("account"));
    
    Log.info("Link to My Account found");

    return element;

    }

 public static WebElement lnk_LogOut(WebDriver driver){

    element = driver.findElement(By.id("account_logout"));
    
    Log.info("Link to logout found");

    return element;

    }
 
 public static WebElement product_Category_tab(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[contains(text(),'Product Category')]"));
	    
	    Log.info("Product Category Tab found");

	    return element;

	}
 
 public static WebElement lnk_accessories(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
	    
	    Log.info("Link to Accessories found");

	    return element;

	}
 
 public static WebElement lnk_Checkout(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//a[@title='Checkout']"));
	    
	    Log.info("Link to Checkout found");

	    return element;

	}

}