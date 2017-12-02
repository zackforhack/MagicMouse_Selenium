package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Transaction_Results_Page {
	
	private static WebElement element = null;
	
    public static String get_Top_Product_Name(WebDriver driver){

	    element = driver.findElement(By.xpath("//table[@class='wpsc-purchase-log-transaction-results']"));
	    
	    Log.info("Top Product Name found");
	    
    return element.findElement(By.xpath("//td[1]")).getText();

    }
    
    public static String get_Top_Product_Quantity(WebDriver driver){

	    element = driver.findElement(By.xpath("//table[@class='wpsc-purchase-log-transaction-results']"));
	    
	    Log.info("Top Product Quantity found");
	    
    return element.findElement(By.xpath("//td[3]")).getText();

    }
}
