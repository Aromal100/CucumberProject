package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://aaeb-school.sims.uat.ethiocheno.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();

	}

	@When("User enters vaild username {string}")
	public void user_enters_vaild_username(String username) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@id='SubmitBtn']")).click();
	   
	}

	@When("User enters vaild password {string}")
	public void user_enters_vaild_password(String password) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);	   
	}

	@And("clicks on the Login button")
	public void clicks_on_the_login_button() {
	
		driver.findElement(By.xpath("//button[@id='continueBtn']")).click();

	}

	@Then("user enters the home page")
	public void user_enters_the_home_page() {

		 System.out.println("Enters the Home page");
	}

	@And("close the browser")
	public void close_the_browser() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();
	}
	
	@And("goes to the Adminstration section")
	public void goes_to_the_adminstration_section() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://aaeb-school.account.uat.ethiocheno.com/manage");
	  
	}

	@Then("goes to the manage section")
	public void goes_to_the_manage_section() {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement c= w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Manage']")));
		c.click();
	  
	}

	@And("select the department section")
	public void select_the_department_section() {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement d= w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Departments']")));
		d.click();
	  
	}

	@Then("create a department")
	public void create_a_department() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement de= w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moduleContainer\"]/div/section/div[1]/div/div[2]/button")));
		de.click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_role_name")).sendKeys("DepartmentTest");
		driver.findElement(By.id("user_dept_code")).sendKeys("test123");
		String filePath = "C:\\Users\\reach\\Downloads\\1710569686379 (1).pdf";
	    WebElement fileinput= w.until(ExpectedConditions.elementToBeClickable(By.name("user_dept_policy")));
	    fileinput.sendKeys(filePath);
	    driver.findElement(By.id("createRoleButton")).click();
	  
	}
	
	@And("select the user section")
	public void select_the_user_section() {
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement u=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"toggle-user\"]/li[1]/h2/a/div[1]/span[2]")));
		u.click();
		driver.findElement(By.xpath("//span[normalize-space()='All users']")).click();
		WebElement cr=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moduleContainer\"]/div/section/div[1]/div/div[2]/div[1]/div/button/span")));
		cr.click();
		WebElement tt=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"moduleContainer\"]/div/section/div[1]/div/div[2]/div[1]/ul/li[13]")));
		tt.click();
	}
	@Then("create a user in a user role")
	public void create_a_user_in_a_user_role() throws InterruptedException {
		 
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.findElement(By.name("first_name")).sendKeys("Joy");
		driver.findElement(By.name("middle_name")).sendKeys("D");
		driver.findElement(By.name("last_name")).sendKeys("Boy");
		driver.findElement(By.id("email")).sendKeys("ajo@gmail.com");
		WebElement s=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='iti__selected-dial-code']")));
		s.click();
		driver.findElement(By.xpath("//*[@id=\"iti-0__item-in\"]/span[1]")).click(); 
		driver.findElement(By.id("phone_number")).sendKeys("8795758547");
		
		//dateofbirth
		driver.findElement(By.xpath("//input[@id='date_of_birth']")).click();
		driver.findElement(By.xpath("//*[@id=\"calendar-type-switcher\"]")).click();
		WebElement n=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='activeyear']")));
		n.click();
		driver.findElement(By.xpath("//button[@id='btnmonthprev']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='1999']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='May']")).click();
		driver.findElement(By.xpath("//button[@id='06']")).click();
		
		//gender
		WebElement gender=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='gender']")));
		gender.click();
		driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
		driver.findElement(By.xpath("//button[@id='saveNextBtn']")).click();
		
		
		
		 
	   
	}







}
