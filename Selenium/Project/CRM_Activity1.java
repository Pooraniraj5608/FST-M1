package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CRM_Activity1 {
	WebDriver driver;
	
  @Test
  public void verifyPageTitle() {
	  
	  //Launch application
	  Reporter.log("Launching application |");
	  driver.get("https://alchemy.hguy.co/crm/");
	  String title = driver.getTitle();
	  
	  //Verify title of page
	  Reporter.log("Verifying title |");
	  Assert.assertEquals(title, "SuiteCRM","pass");
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
