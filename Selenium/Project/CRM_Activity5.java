package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity5{
	

	//declare driver
		WebDriver driver;
		WebDriverWait wait;
		
		
		@BeforeClass
		  public void beforeClass() {
			  driver = new ChromeDriver();
			  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			  
		  }
		
  @Test
  public void getColor() {
	  //Login
	  CRM_Activity4 login = new CRM_Activity4();
	  login.verifyLogin(driver);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*//div[@class='desktop-toolbar']")));

	  Color toolbarColor = Color.fromString(driver.findElement(By.cssSelector("div.desktop-toolbar")).getCssValue("color"));
	  System.out.println("The color of navigation toolbar is : "+toolbarColor.asHex());
	  
	  
	 Assert.assertEquals(toolbarColor.asHex(), "#534d64");
	  
	  
	  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  
	  if (driver != null) {
          driver.quit();
  }
  }
  
}
