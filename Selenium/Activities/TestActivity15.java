package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
				
				driver.get("https://training-support.net/webelements/dynamic-attributes");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        //find full name field and enter details
		        driver.findElement(By.xpath("//input[starts-with(@id,'full-name-')]")).sendKeys("Poorani");
		        		
		        
		        //find email field and enter details
		        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Poorani10@gmail.com");
        		
		        
		        //find the date field and enter details YYYY-MM-DD
		        driver.findElement(By.xpath("//input[contains(@name,'event-date-')]")).sendKeys("2025-11-24");
        		
		        //find additional details field and enter details
		        driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]")).sendKeys("Hello");
        		
		        //find and click submit button
		        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		        
		        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		        
		        System.out.println(message);
		        
		        driver.quit();
	}

}
