package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	
	//declare driver
	WebDriver driver;
	
	@BeforeClass
	  public void setUp() {
		  driver = new FirefoxDriver();
		  driver.get("https://training-support.net");
		  
	  }
	
  @Test(priority=1)
  public void pageTitleTest() {
	  String pageTitle = driver.getTitle();
	  
	  assertEquals(pageTitle,"Training Support");
  }
  
  
  @Test(priority = 2)
  public void aboutUsLinkTest() {
	  driver.findElement(By.linkText("About Us")).click();
  }
  

  @AfterClass
  public void tearDown() {
	  //driver.quit();
  }

}
