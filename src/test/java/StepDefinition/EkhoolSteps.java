package StepDefinition;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EkhoolSteps {
	
	WebDriver driver = Hooks.getDriver(); //hooks webdriver so we get access
	
	@Given("User enters into the browser")
	public void user_enters_into_the_browser() {
		
		
		driver.get("https://democorp.ekhool.com/");
		
	    
	}
	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	   
		   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
		   
	}
	@Then("User give valid username as {string}")
	public void user_give_valid_username_as(String username) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		
	    
	}
	@And("User clicks the next button")
	public void user_clicks_the_next_button() {
	   
		driver.findElement(By.id("SubmitBtn")).click();
		

	}
	@Then("User give the password as {string}")
	public void user_give_the_password_as(String password) throws InterruptedException {
	   
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@And("User clicks the continue button")
	public void user_clicks_the_continue_button() {
		driver.findElement(By.id("continueBtn")).click();
		
	}
	@And("User enters the home page")
	public void user_enters_the_home_page() {
	    
	   System.out.println("Enters the home page");
	   
	}
	
	@Then("User closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		Thread.sleep(5000);
		

	}
	
	@Then("User then goes to users section")
	public void user_then_goes_to_users_section() {
		driver.findElement(By.xpath("(//*[@id=\"users\"])[1]")).click();
	   
	}
	@Then("go to then goes to learners section")
	public void go_to_then_goes_to_learners_section() throws AWTException {
		
	 driver.get("https://democorp.ekhool.com/admin/learner/");
 }
	   
	@Then("create a new learner")
	public void create_a_new_learner() throws InterruptedException {
	    Thread.sleep(2000);
	   driver.findElement(By.id("add_new_learner")).click();
	   driver.findElement(By.xpath("(//*[@id=\"learner_name\"])[1]")).sendKeys("Arjun");
	   driver.findElement(By.id("learner_email")).sendKeys("arjun@gmail.com");
	   driver.findElement(By.id("learner_phone")).sendKeys("9877877667");
	   driver.findElement(By.id("register_number")).sendKeys("454");
	   driver.findElement(By.id("learner_password")).sendKeys("123456");
	   WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"learner_institute\"]"));
	   Select s= new Select(dropdown);
	   s.selectByValue("1");
	   driver.findElement(By.id("create_box_ok")).click();	   	   
	}
	
	@Then("User then goes to Manage section")
	public void userThenGoesToManageSection() {
	   
	   driver.findElement(By.id("manage")).click();
	}
	@And("go to then goes to group section")
	public void goToThenGoesToGroupSection() {
	    driver.get("https://democorp.ekhool.com/admin/groups/");
	   
	}
	@And("create a new group")
	public void createANewGroup() {
	   
	   driver.findElement(By.xpath("//button[normalize-space()='New']")).click();
	   driver.findElement(By.id("group_name")).sendKeys("Remove");
	   WebElement institutedp = driver.findElement(By.id("institute_select"));
	   Select s= new Select(institutedp);
	   s.selectByValue("1");
	   driver.findElement(By.id("group_year")).sendKeys("2030");
	   driver.findElement(By.id("create-btn")).click();
	   driver.findElement(By.xpath("//*[@id=\"attach-group-users\"]/div/div/div[2]/div[3]/div/button[2]")).click();
	 }
	@Then("go to then goes to user role section")
	public void goToThenGoesToUserRoleSection() {
	    driver.findElement(By.id("users")).click();
	    driver.get("https://democorp.account.ekhool.com/role_permissions"); 
	}
	
	
	@Then("create a new user role")
	public void createANewUserRole() {
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement addRole=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//*[@id=\"rolesDiv\"]/div[1]/div[1]/button")));
//		addRole.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement click=driver.findElement(By.xpath("//button[normalize-space()='Add role']"));
	click.click();
		driver.findElement(By.id("user_role_name")).sendKeys("Testing");
		WebElement status=driver.findElement(By.xpath("//select[@id='role_status']"));
		Select s= new Select(status);
		s.selectByValue("0");
		WebElement copy =driver.findElement(By.id("rol"));
		Select s1= new Select(copy);
		s1.selectByValue("13");
		driver.findElement(By.id("createRoleButton")).click();
		
	}
}
