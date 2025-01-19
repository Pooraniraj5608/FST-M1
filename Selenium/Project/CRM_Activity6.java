package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity6 {
	
	//declare driver
			WebDriver driver;
		
			
			@BeforeClass
			  public void beforeClass() {
				
				//Initializing
				  driver = new ChromeDriver();
				  
			  }
				
  @Test
  public void verifyActivityMenu() {
	  
	  //Login
	 CRM_Activity4 login = new CRM_Activity4();
	 login.verifyLogin(driver);
	  
	  
	  //Verify Activity menu exists
	 String activityText = driver.findElement(By.xpath("*//a[text()='Activities']")).getText();
	 Assert.assertEquals(activityText, "ACTIVITIES");
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
  
}
