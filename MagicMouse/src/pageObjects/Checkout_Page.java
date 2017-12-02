package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout_Page {

    private static WebElement element = null;
    
    public static WebElement lnk_continue(WebDriver driver){
    	
    	    WebDriverWait wait = new WebDriverWait(driver,10);

    	    element = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[span[contains(text(),'Continue')]]"))));

	    return element;

	}
}
