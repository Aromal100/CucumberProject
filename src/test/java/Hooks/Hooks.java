package Hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks { //hooks can extend anyone but anyone can't extends hooks
	
	
	public static WebDriver driver;
	
	 public static  WebDriver getDriver() {    //can all the webdriver of hooks in the ekhoolsteps
	        return driver;
	    }
	 
	 @BeforeStep
	public void beforestep(Scenario sce)
	{
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		 byte[] screenshots = screenshot.getScreenshotAs(OutputType.BYTES);
//     // byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//      sce.attach(screenshots, "image/png", null);
		
	}
	
	@Before
	public void browsersetup(Scenario sce)
	{
		System.out.println("I am in the browser");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("ID: "  +sce.getId());
	}
	
	@AfterStep
    public void captureScreenshot(Scenario sce) {
        // Capture screenshot after each step
		 
		if(sce.isFailed())
		{
		 TakesScreenshot screenshot = (TakesScreenshot) driver;
		 byte[] screenshots = screenshot.getScreenshotAs(OutputType.BYTES);
        //byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        sce.attach(screenshots, "image/png", null);
		}
    }

     
	@After
	public void teardown(Scenario  sce)
	{
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		 byte[] screenshots = screenshot.getScreenshotAs(OutputType.BYTES);
//      // byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//       sce.attach(screenshots, "image/png", null);
		driver.quit();	
	}

}
