package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity21 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
				
				driver.get("https://training-support.net/webelements/tabs");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        //Print current page handle
		        System.out.println("page handle is : "+driver.getWindowHandle());
		        
		        //Find the button to open a new tab and click it
		        driver.findElement(By.xpath("//button[contains(text(),'Open')]")).click();
		        
		        //Switch to the new tab
		        for(String handle: driver.getWindowHandles())
		        {
		        	driver.switchTo().window(handle);
		        }
		        
		        //print the new page title
		        System.out.println("Page title is : "+driver.getTitle());
		        
		        //Print current page handle
		        System.out.println("page handle is : "+driver.getWindowHandle());
		        
		        //Print the message on the page
		        System.out.println("Page missing is:" +driver.findElement(By.cssSelector("h2.mt-5")).getText());
		        
		      //Find the button to open a new tab and click it
		        driver.findElement(By.xpath("//button[contains(text(),'Another')]")).click();
		        
		      //Switch to the new tab
		        for(String handle: driver.getWindowHandles())
		        {
		        	driver.switchTo().window(handle);
		        }
		        
		        //print the new page title
		        System.out.println("Page title is : "+driver.getTitle());
		        
		        //Print current page handle
		        System.out.println("page handle is : "+driver.getWindowHandle());
		        
		      //Print the message on the page
		        System.out.println("Page missing is:" +driver.findElement(By.cssSelector("h2.mt-5")).getText());
		        
		        
		        driver.quit();
	}

}
