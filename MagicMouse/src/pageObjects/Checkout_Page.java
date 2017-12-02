package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout_Page {

    private static WebElement element = null;
    
    public static WebElement lnk_continue(WebDriver driver){

	    element = driver.findElement(By.xpath("//a[span[contains(text(),'Continue')]]"));

	    return element;

	}
}
