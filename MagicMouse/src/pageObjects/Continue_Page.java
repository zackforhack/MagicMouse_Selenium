package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Continue_Page {
	
    private static WebElement element = null;
    private static Select dropdown = null;
    
    public static WebElement txtbx_Billingemail(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billingemail']"));

	    return element;

	}
    
    public static WebElement txtbx_Billingfirstname(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billingfirstname']"));

	    return element;

	}
    
    public static WebElement txtbx_Billinglastname(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billinglastname']"));

	    return element;

	}
    
    public static WebElement txtbx_Billingaddress(WebDriver driver){

	    element = driver.findElement(By.xpath("//textarea[@title='billingaddress']"));

	    return element;

	}
    
    public static WebElement txtbx_Billingcity(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billingcity']"));

	    return element;

	}

    public static WebElement txtbx_Billingphone(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billingphone']"));

	    return element;

	}
    
    public static Select dropdown_Billingcountry(WebDriver driver){

    	    dropdown = new Select(driver.findElement(By.id("wpsc_checkout_form_7")));

	    return dropdown;

	}
    
    public static WebElement txtbx_Billingstate(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='billingstate']"));

	    return element;

	}
    
    public static WebElement txtbx_Shippingstate(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@title='shippingstate']"));

	    return element;

	}
    
    public static WebElement purchase_btn(WebDriver driver){

	    element = driver.findElement(By.xpath("//input[@value='Purchase']"));

	    return element;

	}
}
