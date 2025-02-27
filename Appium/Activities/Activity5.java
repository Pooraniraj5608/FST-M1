package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
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

public class Activity5 {
	
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;
	
	 @BeforeClass
	  public void setUp() throws MalformedURLException, URISyntaxException {
	  	  
		// Desired Capabilities
		 UiAutomator2Options options = new UiAutomator2Options();
		 options.setPlatformName("android");
		 options.setAutomationName("UiAutomator2");
		 options.setAppPackage("com.google.android.apps.messaging");
		 options.setAppActivity(".ui.ConversationListActivity");
		 options.noReset();

		 // Server Address
		 URL serverURL = new URI("http://localhost:4723").toURL();
		 
		 // Driver Initialization
		 driver = new AndroidDriver(serverURL, options);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  	  
	    }
	 
  @Test
  public void smsTest() {
	  
	// Find and click the add button
      driver.findElement(AppiumBy.accessibilityId("Start chat")).click();

      // Wait for elements to load
      wait.until(ExpectedConditions.elementToBeClickable(
              AppiumBy.xpath("//android.widget.EditText[@resource-id='ContactSearchField']")
      ));

      // Find the element to add recipient
      driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='ContactSearchField']")).sendKeys("18282832912");
      // Press ENTER
      driver.pressKey(new KeyEvent(AndroidKey.ENTER));
      
   // Wait for textbox to appear
      wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("compose_message_text")));

      // Enter text to send
      driver.findElement(AppiumBy.id("compose_message_text")).sendKeys("Hello from Appium");
      
   // Press Send
      driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
      
      wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id='message_text']")));

      // Assertion
      String messageTextSent = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='message_text']")).getText();
      Assert.assertEquals(messageTextSent, "Hello from Appium");
	  
  }
 

  @AfterClass
  public void tearDown() {
	  
	// Close the app
      driver.quit();
  }

}
