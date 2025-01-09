package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class TestActivity4 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        String h3 = driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
        System.out.println("3rd header on the page is : "+h3);
        
        String color = driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
        Color fifthcolor = Color.fromString(color);
        
        System.out.println("The color of h5 in RGB is : "+fifthcolor.asRgb());
        System.out.println("The color of h5 in RGB is : "+fifthcolor.asHex());
        
        String classes = driver.findElement(By.cssSelector("button.bg-purple-200")).getDomAttribute("class");
        System.out.println("The classes of purple button is : "+classes);
        
        String slate = driver.findElement(By.cssSelector("button.text-slate-900")).getText();
        System.out.println("The text in slate button is : "+slate);
        
        driver.quit();

	}

}
