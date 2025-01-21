package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	@Given("the user is on the login page")
	public void opensPage() throws Throwable {
	   driver.get("https://training-support.net/webelements/login-form");
	}

	@When("the user enters username and password")
	public void enterCredentials() throws Throwable{
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
	    
	}

	@When("clicks the submit button")
	public void clcikSubmit() throws Throwable{
	    
		driver.findElement(By.xpath("*//button[text()='Submit']")).click();
	}
	
	@When("the user enters {string} and {string}")
	public void enterCreds(String username, String password) throws Throwable{
	    
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@Then("get the confirmation message and verify it")
	public void get_the_confirmation_message_and_verify_it() throws Throwable{
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
		
		String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals("Welcome Back, Admin!", message);
	}
	
	@Then("get the confirmation text and verify message as {string}")
	public void verifyMessage(String expMessage) throws Throwable{
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
		
		String actualmessage = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals(actualmessage, expMessage);
	}


}
