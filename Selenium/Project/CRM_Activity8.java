package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CRM_Activity8 {
	
	WebDriver driver;
	Actions builder;
	WebDriverWait wait;
	
  @Test
  public void traverseTable() {
	  
	//Login
		 CRM_Activity4 login = new CRM_Activity4();
		 login.verifyLogin(driver);
	  
	  //Navigate to Sales
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_0")));
	  WebElement sales = driver.findElement(By.id("grouptab_0"));
	  builder.moveToElement(sales).build().perform();
	  
	  //Select Accounts option
	  driver.findElement(By.xpath("*//a[@id='grouptab_0']/following-sibling::ul/li[2]")).click();
	  
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("*//table[contains(@class,'table-responsive')]")));
	  
	  //Printing names from table
	  for(int i=1; i<=10 ; i++)
	  {
		  if (i%2 == 1)
				  {
	  String nameText = driver.findElement(By.xpath("*//table[contains(@class,'table-responsive')]/tbody/tr["+i+"]/td[3]")).getText();
	  System.out.println(nameText);
				  }
	  }
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
	  builder = new Actions(driver);
	  wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
