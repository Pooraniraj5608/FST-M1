package examples;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUplod {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		File file = new File("/Users/pooranirajendran/eclipse-workspace/FST_Selenium/src/test/java/examples/uploadSample");
		
		
		
		driver.get("https://training-support.net/webelements/file-upload");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        
        //Find upload file
        WebElement uploadInput = driver.findElement(By.id("file"));
        uploadInput.sendKeys(file.getAbsolutePath());
        
        //Click button to upload
        driver.findElement(By.xpath("//button[text()='Upload!']")).click();
        
       // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result")));
        
        //Read file name
        String fileName = driver.findElement(By.id("result")).getText();
        
        System.out.println("File name is :" +fileName);
        
        driver.quit();
        

	}

}
