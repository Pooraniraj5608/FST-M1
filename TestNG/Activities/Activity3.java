package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity3 {
	 WebDriver driver;
    
  
  @BeforeClass
  public void beforeClass() {
	// Create a new instance of the Firefox driver
      driver = new FirefoxDriver();

      // Open the browser
      driver.get("https://training-support.net/webelements/login-form");
  }
  
  @Test(priority=1)
  public void pageTitleTest() {
	  String pageTitle = driver.getTitle();
	  System.out.println(pageTitle);
	  
	  assertEquals(pageTitle,"Selenium: Login Form");
  }
  
  @Test(priority=2)
  public void loginFormTest() throws InterruptedException {
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
	  Thread.sleep(2000);
	  
	//Verify login messsage
	  String message = driver.findElement(By.tagName("h2")).getText();
	  assertEquals(message,"Welcome Back, Admin!");
	  System.out.println(message);
	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
	// Close the browser
      driver.close();
  }

}
