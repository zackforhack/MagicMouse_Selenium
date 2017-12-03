package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Transaction_Results_Page {
	
	private static WebElement element = null;
	
    public static String get_Top_Product_Name(WebDriver driver){
    	
    	try {

	    element = driver.findElement(By.xpath("//table[@class='wpsc-purchase-log-transaction-results']"));
	    
    	}catch (Exception e){
	    
	    Log.info("Top Product Name is not found");
	    
		throw(e);
	    
	}
	    
    return element.findElement(By.xpath("//td[1]")).getText();

    }
    
    public static String get_Top_Product_Quantity(WebDriver driver){
    	
    	try {

	    element = driver.findElement(By.xpath("//table[@class='wpsc-purchase-log-transaction-results']"));
	    
    	}catch (Exception e){
	    
	    Log.info("Top Product Quantity found");
	    
		throw(e);
	    
	}
	    
    return element.findElement(By.xpath("//td[3]")).getText();

    }
}
