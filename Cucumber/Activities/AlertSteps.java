package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSteps extends BaseClass{
	
	@Given("User is on the page")
	public void user_is_on_the_page() throws Throwable{
	   
	    driver.get("https://training-support.net/webelements/alerts");
	    
	}

	@When("User clicks the Simple Alert button")
	public void user_clicks_the_simple_alert_button() throws Throwable{
	   
		driver.findElement(By.id("simple")).click();
	}

	@Then("Alert opens")
	public void alert_opens() throws Throwable{
	   
		alert = driver.switchTo().alert();

	}

	@Then("Read the text from it and print it")
	public void read_the_text_from_it_and_print_it() throws Throwable{
	   
		System.out.println("Text from Alert : " + alert.getText());
		
	}

	@Then("Close the alert")
	public void close_the_alert() throws Throwable{
	    
		alert.accept();
		
	}

	@Then("Read the result text")
	public void read_the_result_text() throws Throwable{
		
		System.out.println(driver.findElement(By.id("result")).getText());
	    

	}

	@When("User clicks the Confirm Alert button")
	public void user_clicks_the_confirm_alert_button() throws Throwable{
		
		driver.findElement(By.id("confirmation")).click();
		
	}

	@Then("Close the alert with Cancel")
	public void close_the_alert_with_cancel() throws Throwable{
		
	    alert.dismiss();
	    
	}

	@When("User clicks the Prompt Alert button")
	public void user_clicks_the_prompt_alert_button() throws Throwable{
	    
		driver.findElement(By.id("prompt")).click();
		
	}

	@Then("Write a custom message in it")
	public void write_a_custom_message_in_it() throws Throwable{
	    
		alert.sendKeys("Awesome!");
		
	}

	@When("User clicks the {string} Alert button")
	public void user_clicks_the_confirmation_alert_button(String Type) throws Throwable{
		
		if(Type.equals("Simple"))
		driver.findElement(By.id("simple")).click();
		else if(Type.equals("Confirmation"))
		driver.findElement(By.id("confirmation")).click();
		else if(Type.equals("Prompt"))
		driver.findElement(By.id("prompt")).click();
	}




}
