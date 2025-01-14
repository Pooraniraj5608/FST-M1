package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity13 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
				
				driver.get("https://training-support.net/webelements/tables");
		        // Print the title of the page
		        System.out.println("Page title: " + driver.getTitle());
		        
		        //Print number of rows and cols
		        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		        
		        System.out.println("Number of rows : " +rows.size());
		        System.out.println("Number of columns : " +cols.size());
		        
		        //Print the 3rd row of table
		        WebElement thirdRow = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[3]"));
		        System.out.println("Third row : "+thirdRow.getText());
		        
		        //Print the second row,second cell value
		        
		        WebElement row2Cell2 = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[2]/td[2]"));
		        System.out.println("Second row and 2nd cell : "+row2Cell2.getText());
		        driver.quit();
	}

}
