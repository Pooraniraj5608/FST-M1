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

public class TestActivity16 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		
				
				driver.get("https://training-support.net/webelements/selects");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        WebElement singleSelect = driver.findElement(By.xpath("//select[@class='h-10 w-64 rounded-lg border-2 border-black bg-purple-200 px-3 shadow-md transition hover:shadow-lg']"));
		        Select select1 = new Select(singleSelect);
		        
		        select1.selectByVisibleText("Two");
		        System.out.println("Selected option : "+select1.getFirstSelectedOption().getText());
		        
		        select1.selectByIndex(3);
		        System.out.println("Selected option : "+select1.getFirstSelectedOption().getText());
		        
		        select1.selectByValue("four");
		        System.out.println("Selected option : "+select1.getFirstSelectedOption().getText());
		        
		        List<WebElement> allOptions = select1.getOptions();
		        
		        for(WebElement list1 : allOptions)
		        	System.out.println("options are : "+list1.getText());
		        
		        driver.quit();
	}

}
