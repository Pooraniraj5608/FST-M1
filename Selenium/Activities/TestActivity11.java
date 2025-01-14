package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
				
				driver.get("https://training-support.net/webelements/dynamic-controls");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        //Find the checkbox element
		        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
		        WebElement toggle = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		        
		        //toggle the visibility
		        toggle.click();
		        
		        //wait for the checkbox to dissappear
		        wait.until(ExpectedConditions.invisibilityOf(checkbox));
		        
		        //toggle the visibility
		        toggle.click();
		        //wait for checkbox to appear and click it
		        wait.until(ExpectedConditions.visibilityOf(checkbox));
		        
		        driver.quit();

	}

}
