package project;

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

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class GoogleKeepNoteActivity {
	
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException, URISyntaxException {
		
		// Desired Capabilities
				UiAutomator2Options options = new UiAutomator2Options();
				options.setPlatformName("android");
				options.setAutomationName("UiAutomator2");
				options.setAppPackage("com.google.android.keep");
				options.setAppActivity(".activities.BrowseActivity");
				options.noReset();

				// Server Address
				URL serverURL = new URI("http://localhost:4723").toURL();
				// Driver Initialization
				driver = new AndroidDriver(serverURL, options);
				wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }
  
  @Test
  public void googleKeepTest() throws InterruptedException {
		// Open the Google Keep app and Click the Create New Note button to add a new
		// Note.
		driver.findElement(AppiumBy.id("com.google.android.keep:id/speed_dial_create_close_button")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();
		Thread.sleep(2000);
		// Add a title for the note and add a small description.
		// Find Title and enter a text in it
		driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/editable_title\"]")).sendKeys("Note1");
				// find the note section and add description into it.
				driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.keep:id/edit_note_text\"]")).sendKeys("This is the first Note");
				// Press the back button
				driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
				Thread.sleep(2000);
				// make an assertion to ensure that the note was added.
				String Noteadded = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"]")).getText();
				Assert.assertTrue(Noteadded.contains("Note1"));
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
