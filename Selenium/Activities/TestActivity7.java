package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity7 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement textbox = driver.findElement(By.xpath("//input[@name='textInput']"));
        System.out.println("Is the textbox enabled "+ textbox.isEnabled());
        
        driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
        System.out.println("Is the textbox enabled "+ textbox.isEnabled());
        
        driver.quit();
        

	}

}
