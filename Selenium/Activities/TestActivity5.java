package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity5 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println("Is the checkbox visible "+ checkbox.isDisplayed());
        
        driver.findElement(By.xpath("//button[contains(text(),'Toggle')]")).click();
        System.out.println("Is the checkbox visible "+ checkbox.isDisplayed());
        
        driver.quit();
        

	}

}
