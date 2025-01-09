package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
				
				driver.get("https://training-support.net/webelements/keyboard-events");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        WebElement textBox = driver.findElement(By.xpath("//h1[@class='mt-3 text-center text-4xl font-semibold text-black']"));
		        builder.sendKeys("Hi from selenium").sendKeys(Keys.ENTER).build().perform();
		        
		        System.out.println(textBox.getText());
		        
		        driver.quit();

	}

}
