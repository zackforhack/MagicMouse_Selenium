package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accessories_Page {
    private static WebElement element = null;
    
    public static WebElement magic_Mouse_col(WebDriver driver){

	    element = driver.findElement(By.xpath("//div[h2[a[contains(text(),'Magic Mouse')]]]"));

	    return element;

	}

    public static WebElement magic_Mouse_Add_To_Cart_Button(WebDriver driver){

	    element = magic_Mouse_col(driver).findElement(By.xpath("//input[@name='Buy']"));

	    return element;

	}
    
    
    



}
