package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		String pageTitle = driver.getTitle();
		System.out.println("Title of page "+pageTitle);
		
		WebElement aboutLink = driver.findElement(By.linkText("About Us"));
		aboutLink.click();
		String pageTitleNew = driver.getTitle();
		System.out.println("Title of new page "+pageTitleNew);
		
		
		driver.quit();
		

	}

}
