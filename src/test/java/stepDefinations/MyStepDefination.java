package stepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class MyStepDefination {

	
	    @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	        System.out.println("user_is_on_landing_page");
	    }

	    @When("^user login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	        System.out.println("user_login_into_application_with_username_and_password");
	    }

	    @Then("^Welcome page is displayed$")
	    public void welcome_page_is_displayed() throws Throwable {
	       System.out.println("welcome_page_is_displayed");
	    }

	    @And("^card details are displayed$")
	    public void card_details_are_displayed() throws Throwable {
	     System.out.println("card_details_are_displayed");
	    }
}

