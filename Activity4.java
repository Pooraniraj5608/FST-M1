package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity4 {
	
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
  	  
    	// Desired Capabilities
    	UiAutomator2Options options = new UiAutomator2Options();
    	options.setPlatformName("android");
    	options.setAutomationName("UiAutomator2");
    	options.setAppPackage("com.android.contacts");
    	options.setAppActivity(".activities.PeopleActivity");

    	// Server Address
    	URL serverURL = new URI("http://localhost:4723").toURL();
    	
    	// Driver Initialization
    	driver = new AndroidDriver(serverURL, options);
    	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  	  
    }
  @Test
  public void addContact() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Create new contact")).click();
	  driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Aditya");
	  driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Varma");
	  driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("999148292");
	  driver.findElement(AppiumBy.accessibilityId("com.android.contacts:id/editor_menu_save_button")).click();
	  
	// Wait for contact to save
      wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
      
   // Assertion
      String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
      Assert.assertEquals(contactName, "Aaditya Varma");

  }
  

  @AfterClass
  public void afterClass() {
	  
	// Close the app
      driver.quit();
      
  }

}
