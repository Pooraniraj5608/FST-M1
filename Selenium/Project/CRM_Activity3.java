package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CRM_Activity3 {
	
	//declare driver
			WebDriver driver;
			@BeforeClass
			  public void beforeClass() {
				  driver = new ChromeDriver();
				  
			  }
	
  @Test
  public void printCopyrightText() {
	  
	//Launch application
	  Reporter.log("Launching application |");
	  driver.get("https://alchemy.hguy.co/crm/");
	  
	  //Print and verify text copyright to console
	  String copyrightText = driver.findElement(By.id("admin_options")).getText(); 
	  System.out.println("The first copyrighttext in the footer is : "+copyrightText); 
	  Assert.assertEquals(copyrightText, "© Supercharged by SuiteCRM");
  }
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
