package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActivity8 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        
        WebElement lockButton = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement tomlButton = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement src = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));
        
        
        
      //left click .lock button and then click .toml button
        builder.click(lockButton).moveToElement(tomlButton).click().build().perform();
        
        //print the message
        System.out.println(driver.findElement(By.id("result")).getText());
        
        //double click src and right click target and select open
        builder.doubleClick(src).contextClick(target).build().perform();
        
        WebElement openOption = driver.findElement(By.xpath("//div[@id='menu']//ul/li[1]"));
        //openOption.click();
        builder.click(openOption).pause(2000L).build().perform();
        
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();

	}

}
