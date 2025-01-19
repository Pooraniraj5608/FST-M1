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

public class CRM_Activity7 {
	
	//declare driver
	WebDriver driver;
	Actions action;
	WebDriverWait wait;

	
	@BeforeClass
	  public void beforeClass() {
		
		//Initializing
		  driver = new ChromeDriver();
		  action = new Actions(driver);
		  wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
	  }
	
  @Test
  public void readAddInfo() {
	  
	  //Login
		 CRM_Activity4 login = new CRM_Activity4();
		 login.verifyLogin(driver);
		 
		 //Navigate Sales->Leads
		 WebElement sales = driver.findElement(By.xpath("*//a[@id='grouptab_0']"));
		 action.moveToElement(sales).click().build().perform();
		 WebElement leads = driver.findElement(By.xpath("*//a[@id='grouptab_0']//following-sibling::ul[@class='dropdown-menu']/li/a[text()='Leads']"));
		 leads.click();
		 action.pause(5000L).build().perform();
		 WebElement info = driver.findElement(By.xpath("*//table[contains(@class,'table-responsive')]/tbody/tr[1]/td[10]"));
		 action.pause(5000L).moveToElement(info).click().build().perform();
		 action.pause(5000L).build().perform();
		 
		 //get phone number
		 String phone = driver.findElement(By.xpath("*//span[@class='phone']")).getText();
		 System.out.println("Phone number : "+phone);
		 
		 Assert.assertEquals(phone, "9000001234");
		 
  }
  
  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }
  
}
