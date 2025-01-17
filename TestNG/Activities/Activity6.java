package activities;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  @Parameters({"username", "password","message"})
  public void test(String username, String password, @Optional("Login Success!") String message) {
	  
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	  
	  wait.until(ExpectedConditions.titleContains("Success"));
	  
	  String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
	  
	  Assert.assertEquals("Welcome Back, Admin!", loginMessage);
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new FirefoxDriver();
	  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	  driver.get("https://training-support.net/webelements/login-form");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
  

}
