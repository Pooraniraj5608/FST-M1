package examples;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class LocatorsExample {
	// Driver Declaration
    AndroidDriver driver;
    
  @BeforeClass
  public void setUp() throws MalformedURLException, URISyntaxException {
	  
	// Desired Capabilities
      UiAutomator2Options options = new UiAutomator2Options();
      options.setPlatformName("android");
      options.setAutomationName("UiAutomator2");
      options.setAppPackage("com.android.calculator2");
      options.setAppActivity(".Calculator");
      //options.setAppActivity("path/to/.apk");
      options.noReset();
      
      
   // Server Address
      URL serverURL = new URI("http://localhost:4723").toURL();

      // Driver Initialization
      driver = new AndroidDriver(serverURL, options);
  }
  
//Test method
  @Test
  public void addTest() {
      // Perform the calculation
      driver.findElement(AppiumBy.id("digit_3")).click();
      driver.findElement(AppiumBy.accessibilityId("plus")).click();
      driver.findElement(AppiumBy.id("digit_5")).click();
      driver.findElement(AppiumBy.accessibilityId("equals")).click();

      // Find the result
      String result = driver.findElement(AppiumBy.id("result")).getText();

      // Assertion
      Assert.assertEquals(result, "8");
  }
  
  @Test
  public void multiplyTest() {
      // Perform the calculation
      driver.findElement(AppiumBy.id("digit_3")).click();
      driver.findElement(AppiumBy.accessibilityId("×")).click();
      driver.findElement(AppiumBy.id("digit_5")).click();
      driver.findElement(AppiumBy.accessibilityId("equals")).click();

      // Find the result
      String result = driver.findElement(AppiumBy.id("result")).getText();

      // Assertion
      Assert.assertEquals(result, "15");
  }
  
//Tear down method
  @AfterClass
  public void tearDown() {
      // Close the app
      driver.quit();
  }

}
