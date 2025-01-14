package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity17 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
				
				driver.get("https://training-support.net/webelements/selects");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        WebElement multipleSelect = driver.findElement(By.xpath("//select[@multiple='']"));
		        Select select1 = new Select(multipleSelect);
		        
		        select1.selectByVisibleText("HTML");
		        
		        
		        for(int i=3;i<=5;i++)
		        {
		        select1.selectByIndex(i);
		        }
		        
		        
		        select1.selectByValue("nodejs");
		        
		       
		        select1.deselectByIndex(4);
		        
		        
		        List<WebElement> allOptions = select1.getAllSelectedOptions();
		        
		        for(WebElement list1 : allOptions)
		        	System.out.println("options are : "+list1.getText());
		        
		        driver.quit();
	}

}
