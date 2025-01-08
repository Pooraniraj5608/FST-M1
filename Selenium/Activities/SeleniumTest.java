package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		//initializing a driver
		WebDriver driver = new FirefoxDriver();
		
		//open a browser page
		driver.get("https://training-support.net");
		
		//interactions
		
		//print page title
		System.out.println(driver.getTitle());
		
		//close
		//closes entire browser
		//driver.quit(); 
		
		//closes currently active tab
		driver.close(); 
		
	}

}
