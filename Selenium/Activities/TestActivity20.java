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

public class TestActivity20 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
				
				driver.get("https://training-support.net/webelements/alerts");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		       WebElement alertButton = driver.findElement(By.id("prompt"));
		       alertButton.click();
		        
		        Alert promptAlert = driver.switchTo().alert();
		        System.out.println(promptAlert.getText());
		        
		        promptAlert.sendKeys("Awesome!");
		        promptAlert.accept();
		        System.out.println("Action performed : " +driver.findElement(By.id("result")).getText());
		        
		        alertButton.click();
		        promptAlert.dismiss();
		        System.out.println("Action performed : " +driver.findElement(By.id("result")).getText());
		        
		        
		        driver.quit();
	}

}
