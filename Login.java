package StepDefinitions;
import io.cucumber.junit.Cucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver=null;
	
	@Given("user open a broswer")
	public void user_open_a_browser() {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anith\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	}

	@And("user navigate to the login page")
	public void user_navigate_to_the_login_page {
		
		driver.navigate().to("https://www.saucedemo.com/v1/");

	}

	@When("user enters the username and passowrd")
	public void user_enter_the_username_and_password {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@Then("user navigate to the Home page")
	public void user_navigate_to_the_Home_page() {
		

	}




}

