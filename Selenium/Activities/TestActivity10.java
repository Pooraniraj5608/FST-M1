package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class TestActivity10 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		Actions builder = new Actions(driver);
		
				
				driver.get("https://training-support.net/webelements/drag-drop");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        WebElement ball = driver.findElement(By.id("ball"));
		        WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
		        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
		        
		        builder.click(ball).dragAndDrop(ball, dropZone1).pause(2000L).release().build().perform();
		        
		        String dropped1 = driver.findElement(By.xpath("*//div[@id='dropzone1']//span[text()='Dropped!']")).getText();
		        
		        if(dropped1.equalsIgnoreCase("Dropped!"))
		        		{
		        	System.out.println("Ball dropped in drop zone 1");
		        		}
		        
		        builder.click(ball).dragAndDrop(ball, dropZone2).pause(2000L).release().build().perform();
		        
		        String dropped2 = driver.findElement(By.xpath("*//div[@id='dropzone2']//span[text()='Dropped!']")).getText();
		        
		        if(dropped2.equalsIgnoreCase("Dropped!"))
        		{
		        	System.out.println("Ball dropped in drop zone 2");
        		}
		        
		        driver.quit();

	}

}
