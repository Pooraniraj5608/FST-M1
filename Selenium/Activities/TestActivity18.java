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

public class TestActivity18 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
				
				driver.get("https://training-support.net/webelements/alerts");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        driver.findElement(By.id("simple")).click();
		        
		        Alert simpleAlert = driver.switchTo().alert();
		        System.out.println(simpleAlert.getText());
		        simpleAlert.accept();
		        
		        System.out.println("Action performed : " +driver.findElement(By.id("result")).getText());
		        
		        
		        driver.quit();
	}

}
