package StepDefinitions;
import io.cucumber.junit.Cucumber;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("inside step - Browser is open");
	    
	}

	@And("user is on Google search page")
	public void user_is_on_google_search_page() {
	    System.out.println("inside step - User is on Google search page");

	}

	@When("user enter text in a search box")
	public void user_enter_text_in_a_search_box() {
	    System.out.println("inside step - user enter text in search box");

	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("inside step - User hits enter");

	}

	@Then("user navigate to Search results")
	public void user_navigate_to_search_results() {
	    System.out.println("inside step - User navigate to search results");

	}




}
