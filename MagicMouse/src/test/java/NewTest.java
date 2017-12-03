package test.java;

import org.testng.annotations.Test;

import pageObjects.Accessories_Page;
import pageObjects.Checkout_Page;
import pageObjects.Continue_Page;
import pageObjects.Home_Page;
import pageObjects.Transaction_Results_Page;
import utility.Test_Data;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Log;

public class NewTest {
	
    static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }
	
	public WebDriver driver;
	
	  @Test (description="STEP 1: Go to http://store.demoqa.com/")
	  public void launchSite() throws InterruptedException {
		    Log.startTestCase("STEP 1: Go to http://store.demoqa.com/");
		    
		    try {
		    	
		    
			driver.get("http://store.demoqa.com");
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.titleContains("ONLINE STORE"));
	    
			assertEquals(driver.getTitle(), "ONLINE STORE | Toolsqa Dummy Test site");
			
		    }catch (Exception e){

		        Log.error("Error while executing Step 1 Test");
		    }    
		    
		    finally {
		    	
		    	Log.endTestCase("STEP 1");
		    	
		    }
	  }
		
	  @Test (description="STEP 2: Go to Product category and select Accessories")
	  public void selectAccessories() throws InterruptedException {

		    Log.startTestCase("STEP 2: Go to Product category and select Accessories");
		    
		    try {
			Actions actions = new Actions(driver);
			WebElement menu = Home_Page.product_Category_tab(driver);
			actions.moveToElement(menu);
			WebElement subMenu = Home_Page.lnk_accessories(driver);
			actions.moveToElement(subMenu);
			actions.click().build().perform();
			Log.info("Go to Accessories pages");
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.titleContains("Accessories"));
			
			assertEquals(driver.getTitle(), "Accessories | ONLINE STORE");
			
		    }catch (Exception e){

		    	Log.error("Error while executing Step 2 Test");
		    	
		    } 
		    
		    finally {
		    	
			Log.endTestCase("STEP 2");
			
		    }
	  }
	  
	  @Test (description="STEP 3: Click on “Add to Cart” for just Magic Mouse")
	  public void addMagicMouseToCart() throws InterruptedException {
		  
		  	Log.startTestCase("STEP 3: Click on “Add to Cart” for just Magic Mouse");
		  	
		  	try {
		  		
			Accessories_Page.magic_Mouse_Add_To_Cart_Button(driver).click();
			Log.info("Click Add to Cart Button");
			assertTrue(Accessories_Page.item_Has_been_added_show(driver));
			
		  	}catch (Exception e){

		    	Log.error("Error while executing Step 3 Test");
		    	
		    } 
		  	
		  	finally {
		  		Log.endTestCase("STEP 3");
		  	}
			
			
	  }
	  
	  @Test (description="STEP 4: Click on “Checkout” and confirm you have 1 Magic Mouse in your Check-Out Page")
	  public void checkoutAndConfirmMagicMouse() throws InterruptedException {
		  
		  	Log.startTestCase("STEP 4: Click on “Checkout” and confirm you have 1 Magic Mouse in your Check-Out Page");
		  	
		  	try {
			Home_Page.lnk_Checkout(driver).click();
			Log.info("Click Checkout Button");
			
			//Confirm have 1 magic mouse in checkout page
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.titleContains("Checkout"));
			
			assertEquals(driver.getTitle(), "Checkout | ONLINE STORE");
			assertEquals(Checkout_Page.get_Top_Product_Name(driver),Test_Data.Product_Name);
			assertEquals(Checkout_Page.get_Top_Product_Quantity(driver),"1");
			
			Log.info("Confirm Have 1 Magic Mouse In Checkout Page");
			
		  	} catch (Exception e){

		    	Log.error("Error while executing Step 4 Test");
		    	
		    } 
			
		  	finally {
		  		Log.endTestCase("STEP 4");
		  	};

	  }	
	  
	  @Test (description="STEP 5: After confirming, click on Continue")
	  public void clickOnContinue() throws InterruptedException {
		  
		  	Log.startTestCase("STEP 5: After confirming, click on Continue");
		  	
		  	try {
			
			Checkout_Page.lnk_continue(driver).click();
			Log.info("Click on Continue Button");
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.titleContains("Checkout"));
		    
			assertEquals(driver.getTitle(), "Checkout | ONLINE STORE");
			
		  	} catch (Exception e){

		    	Log.error("Error while executing Step 5 Test");
		    	
		    } 
			
			finally {
		  		Log.endTestCase("STEP 5");
		  	};

	  }
	  
			
	  @Test (description="STEP 6: Enter test data needed for email,  billing/contact details and billing/contact details and click Purchase")
	  public void enterBillDataAndPurchase() throws InterruptedException {
		  
		  	Log.startTestCase("STEP 6: Enter test data needed for email,  billing/contact details and billing/contact details and click Purchase");
		  	
		  	try {
		  	
			Continue_Page.txtbx_Billingemail(driver).sendKeys(Test_Data.User_Email);
			Continue_Page.txtbx_Billingfirstname(driver).sendKeys(Test_Data.User_First_Name);
			Continue_Page.txtbx_Billinglastname(driver).sendKeys(Test_Data.User_Last_Name);
			Continue_Page.txtbx_Billingaddress(driver).sendKeys(Test_Data.User_Address);
			Continue_Page.txtbx_Billingcity(driver).sendKeys(Test_Data.User_City);
			Continue_Page.txtbx_Billingphone(driver).sendKeys(Test_Data.User_Telephone);
			Continue_Page.dropdown_Billingcountry(driver).selectByVisibleText(Test_Data.User_Country);
			Continue_Page.txtbx_Billingstate(driver).sendKeys(Test_Data.User_State);
			Continue_Page.txtbx_Shippingstate(driver).sendKeys(Test_Data.User_State);
			
			Log.info("Finish Filling Test User Data");
			
			Continue_Page.purchase_btn(driver).click();
			
			Log.info("Click Purchase Button");
		  	} catch (Exception e){

		    	Log.error("Error while executing Step 6 Test");
		    	
		    }
		  	
		  	finally {
		  		Log.endTestCase("STEP 6");
		  	};
			
			
	  }	
			
	  @Test (description="STEP 7: Confirm that you have placed the Order in ‘Transaction Results’ page")
	  public void confirmOrder() throws InterruptedException {
		  
		  	Log.startTestCase("STEP 7: Confirm that you have placed the Order in ‘Transaction Results’ page");
		  	
		  	try {
		  	
		  	WebDriverWait wait = new WebDriverWait(driver, 15);
		    wait.until(ExpectedConditions.titleContains("Transaction Results"));
		  
		  	assertEquals(driver.getTitle(), "Transaction Results | ONLINE STORE");
		  	assertEquals(Transaction_Results_Page.get_Top_Product_Name(driver), Test_Data.Product_Name);
		  	assertEquals(Transaction_Results_Page.get_Top_Product_Quantity(driver), "1");
		  	
		  	Log.info("Finish Confirming the Order");
		  	
		  	} catch (Exception e){

		    	Log.error("Error while executing Step 7 Test");
		    	
		    }
		  	
		  	finally {
		  		Log.endTestCase("STEP 7");
		  	};
		  
	  }
		  
		  
		  
	  
	  
	  @BeforeSuite(alwaysRun = true)
	  @Parameters("broswer")
	  public void setupBeforeSuite(String broswer) {
		  try {
			  
			 if(broswer.equalsIgnoreCase("chrome")) {
				 
				 String OS = System.getProperty("os.name").toLowerCase();
				 
				 if(OS.indexOf("win") >= 0);
				 System.setProperty("webdriver.chrome.driver", "resource/windowsDrivers/chromedriver.exe");
				 
				 if(OS.indexOf("mac") >= 0);
				 System.setProperty("webdriver.chrome.driver", "resource/macDrivers/chromedriver");
					
				 driver = new ChromeDriver();
			 }
			 
			 else if(broswer.equalsIgnoreCase("firefox")) {
				 
				 String OS = System.getProperty("os.name").toLowerCase();
				 
				 if(OS.indexOf("win") >= 0);
				 System.setProperty("webdriver.gecko.driver", "resource/windowsDrivers/geckodriver.exe");
				 
				 if(OS.indexOf("mac") >= 0);
				 System.setProperty("webdriver.gecko.driver", "resource/macDrivers/geckodriver");

			     driver = new FirefoxDriver();
			 }
		
			driver.manage().timeouts().implicitlyWait(Test_Data.Implicit_Wait_Time_Seconds, TimeUnit.SECONDS);
			
		  } catch(Exception e) {
			  throw new IllegalStateException("Can't start broweser driver", e);
		  }
		  
		//maximize window
	     driver.manage().window().maximize();

	  }

	  @AfterSuite(alwaysRun = true)
	  public void setupAfterSuite() {
		  // Close the driver
		  
	      driver.quit();
		  
	  }
	  

}
