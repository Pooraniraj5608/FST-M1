package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps extends BaseClass {
	@Given("User is on the google homepage")
	public void userIsOnGooglePage() throws Throwable {
		// Open the browser
		driver.get("https://www.google.com");
	}

	@When("User types cheese and hits ENTER")
	public void userTypesInCheeseAndHitsENTER() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
	}

	@Then("Show how many search results were shown")
	public void showHowManySearchResultsWereShown() throws Throwable {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
		Thread.sleep(5000);
		String resultStats = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats"))).getText();
		System.out.println("Number of results found: " + resultStats);
	}
}