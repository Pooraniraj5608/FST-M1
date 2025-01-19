package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CRM_Activity4 {
	
	//declare driver
		WebDriver driver;
		
		@BeforeClass
		  public void beforeClass() {
			driver = new ChromeDriver();
			  
		  }
			  
  @Test
  public void verifyLogin(WebDriver driver) {
	  
	//Launch application
	  Reporter.log("Launching application |");
	  driver.get("https://alchemy.hguy.co/crm/");
	  
	//login to application
	  driver.findElement(By.id("user_name")).sendKeys("admin");
	  driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	  driver.findElement(By.id("bigbutton")).click();
	  driver.manage().window().maximize();
	  
	  //verify homepage
	  String dashboard = driver.findElement(By.xpath("*//a[@id='tab0']")).getText();
	 Assert.assertEquals(dashboard, "SUITECRM DASHBOARD");
	  
	  
  }
  

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
