package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Log;

public class Checkout_Page {

    private static WebElement element = null;
    
    public static WebElement lnk_continue(WebDriver driver){

    	    element = driver.findElement(By.xpath("//a[span[contains(text(),'Continue')]]"));
    	    
    	    Log.info("Link to Continue found");

	    return element;

	}
    
    public static String get_Top_Product_Name(WebDriver driver){

	    return driver.findElement(By.xpath("//td[@class='wpsc_product_name wpsc_product_name_0']/child::*")).getText();

    }
    
    public static String get_Top_Product_Quantity(WebDriver driver){

	    element = driver.findElement(By.xpath("//td[@class='wpsc_product_quantity wpsc_product_quantity_0']/child::*"));
	    
	    Log.info("Top Product Quantity found");
	    
	    return element.findElement(By.xpath("//input[@name='quantity']")).getAttribute("value");

    }
}
