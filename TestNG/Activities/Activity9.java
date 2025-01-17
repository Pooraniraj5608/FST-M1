package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Activity9 {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		
		Reporter.log("Test case setup started |");
		  driver.switchTo().defaultContent();
	  }
	
  @Test(priority=1)
  public void simpleAlertTestCase() {
	  
	  Reporter.log("Simplealert() test case started |");
	  
	  driver.findElement(By.id("simple")).click();
	  Reporter.log("Alert opened |");
	  
	  Alert simpleAlert = driver.switchTo().alert();
	  Reporter.log("Shifted focus to alert |");
	  
	  String simpleAlertText = simpleAlert.getText();
	  Reporter.log("Alert text is : "+simpleAlertText +" |");
	  
	  Assert.assertEquals("You've just triggered a simple alert!", simpleAlertText);
	  simpleAlert.accept();
	  Reporter.log("Alert closed |");
	  
	  Reporter.log("test case ended |");
	  
  }
  
  @Test(priority=2)
  public void confirmAlertTestCase() {
Reporter.log("Confirmationalert() test case started |");
	  
	  driver.findElement(By.id("confirmation")).click();
	  Reporter.log("Alert opened |");
	  
	  Alert confirmationAlert = driver.switchTo().alert();
	  Reporter.log("Shifted focus to alert |");
	  
	  String confirmationAlertText = confirmationAlert.getText();
	  Reporter.log("Alert text is : "+confirmationAlertText +" |");
	  
	  Assert.assertEquals("You've just triggered a confirmation alert!", confirmationAlertText);
	  confirmationAlert.accept();
	  Reporter.log("Alert closed |");
	  
	  Reporter.log("test case ended |");
  }
  
  @Test(priority=3)
  public void promptAlertTestCase() {
Reporter.log("Promptalert() test case started |");
	  
	  driver.findElement(By.id("prompt")).click();
	  Reporter.log("Alert opened |");
	  
	  Alert promptAlert = driver.switchTo().alert();
	  Reporter.log("Shifted focus to alert |");
	  
	  String promptAlertText = promptAlert.getText();
	  Reporter.log("Alert text is : "+promptAlertText +" |");
	  
	  Assert.assertEquals("I'm a Prompt! Type something into me!", promptAlertText);
	  promptAlert.sendKeys("Awesome!");
	  Reporter.log("Entered text into prompt alert |");
	  
	  promptAlert.accept();
	  Reporter.log("Alert closed |");
	  
	  Reporter.log("test case ended |");
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  
	  Reporter.log("Starting Test |");
	  driver.get("https://training-support.net/webelements/alerts");
	  
	  Reporter.log("Page title is : "+driver.getTitle() +" |");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("Ending test |");
	  driver.close();
  }

}
