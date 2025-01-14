package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity12 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
				
				driver.get("https://training-support.net/webelements/dynamic-content");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        WebElement clickme = driver.findElement(By.xpath("//button[@id='genButton']"));
		        WebElement textElement = driver.findElement(By.id("word"));
		        
		        clickme.click();
		        
		        wait.until(ExpectedConditions.textToBePresentInElement(textElement, "release"));
		        
		        System.out.println(textElement.getText());
		        
		        driver.quit();

	}

}
