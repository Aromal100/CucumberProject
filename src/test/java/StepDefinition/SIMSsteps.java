package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SIMSsteps {
	
	WebDriver driver;
	@Given("User is on SIMS page")
	public void user_is_on_sims_page() {
		driver=new ChromeDriver();
		driver.get("https://uriel_cameron.sims.uat.ethiocheno.com/dashboard");
	    
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.id("email")).sendKeys(username);  
	    
	}

	@And("clicks on the next button")
	public void clicks_on_the_next_button() {
	    
		driver.findElement(By.id("SubmitBtn")).click();
	}

	@And("User enters password as {string}")
	public void user_enters_password_as(String password) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@And("clicks the Login button")
	public void clicks_the_login_button() {
		driver.findElement(By.id("continueBtn")).click();
	    
	}

	@Then("goes to the Location section")
	public void goes_to_the_location_section() throws InterruptedException {
	    
		Thread.sleep(2000);
		driver.get("https://uriel_cameron.sims.uat.ethiocheno.com/location");
	}

	@Then("clicks on the add location")
	public void clicks_on_the_add_location() {
	    
		driver.findElement(By.xpath("//*[@id=\"moduleContainer\"]/div/div[4]/div[1]/div/div/div/a/span[1]")).click();
	}

	@And("gives the location name")
	public void gives_the_location_name() {
		driver.findElement(By.id("location")).sendKeys("Test"); 
	    
	}

	@And("gives the location description")
	public void gives_the_location_description() {
		driver.findElement(By.id("description")).sendKeys("Testing");
	    
	}

	@Then("clicks on the add location button")
	public void clicks_on_the_add_location_button() {
	    
		driver.findElement(By.xpath("//*[@id=\"addlocationBtn\"]")).click();
	}

	@Then("closes the browser")
	public void closes_the_browser() {
	    
	    driver.quit();
	}




}
