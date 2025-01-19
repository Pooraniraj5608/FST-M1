package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity2 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  driver = new ChromeDriver();
		  
	  }

	  
  @SuppressWarnings("deprecation")
@Test
  public void getHearderImageUrl() {
	  
	//Launch application
	  Reporter.log("Launching application |");
	  driver.get("https://alchemy.hguy.co/crm/");
	  
	  //Verify url and print to console
	  String headerText = driver.findElement(By.xpath("*//div/img[@alt='SuiteCRM']")).getAttribute("src");
	  System.out.println("The header url is : "+headerText);
	  Assert.assertEquals(headerText,"https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g");
	  
	  
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}
