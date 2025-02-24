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
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;
  
  @BeforeClass
  public void setUp() throws MalformedURLException, URISyntaxException {
	  
	// Desired Capabilities
	  UiAutomator2Options options = new UiAutomator2Options();
	  options.setPlatformName("android");
	  options.setAutomationName("UiAutomator2");
	  options.setAppPackage("com.android.chrome");
	  options.setAppActivity("com.google.android.apps.chrome.Main");
	  options.noReset();

	  // Server Address
	  URL serverURL = new URI("http://localhost:4723").toURL();
	  
	  // Driver Initialization
	  driver = new AndroidDriver(serverURL, options);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	// Open the browser with the URL
		  driver.get("https://training-support.net");
	  
  }
  
  @Test
  public void chromeTest() {
	  
	// Wait for contact to save
      wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")));
	  
	// Locate heading on page and print it
	  String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
	  System.out.println("Heading: " + pageTitle);
	  
	  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).click();
	  
	  String aboutUsTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
	  System.out.println("Heading: " + aboutUsTitle);
	  
  }

  @AfterClass
  public void afterClass() {
	  
	// Close the app
      driver.quit();
      
  }

}
