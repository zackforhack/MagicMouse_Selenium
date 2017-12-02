package test;

import java.util.concurrent.TimeUnit;
import pageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MagicMouse {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/amandayang/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Step 1
		driver.get("http://store.demoqa.com");
		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Step 2
		Actions actions = new Actions(driver);
		WebElement menu = Home_Page.product_Category_tab(driver);
		actions.moveToElement(menu);
		WebElement subMenu = Home_Page.lnk_accessories(driver);
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Step 3
		
		Accessories_Page.magic_Mouse_Add_To_Cart_Button(driver).click();;
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		//Step 4
		Home_Page.lnk_Checkout(driver).click();
		
		//Confirm have 1 magic mouse in checkout page
		
		Thread.sleep(5000);
		
		//Step 5
		
		Checkout_Page.lnk_continue(driver).click();
		
		Thread.sleep(5000);
		
		//Step 6
		Continue_Page.txtbx_Billingemail(driver).sendKeys("zackforhack@gmail.com");
		Continue_Page.txtbx_Billingfirstname(driver).sendKeys("Ziqian");
		Continue_Page.txtbx_Billinglastname(driver).sendKeys("Huang");
		Continue_Page.txtbx_Billingaddress(driver).sendKeys("197 Cameron Ave");
		Continue_Page.txtbx_Billingcity(driver).sendKeys("North York");
		Continue_Page.txtbx_Billingphone(driver).sendKeys("4163179500");
		Continue_Page.dropdown_Billingcountry(driver).selectByVisibleText("Canada");
		Continue_Page.txtbx_Billingstate(driver).sendKeys("Ontario");
		Continue_Page.txtbx_Shippingstate(driver).sendKeys("Ontario");
		Continue_Page.purchase_btn(driver).click();
		Thread.sleep(10000);
		
		
		//STEP 7
		
		
		//driver.quit();
		
	}

}
