package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginTest {
	
	
	
	@Given("^i am on the login page$")
	public void i_am_on_the_login_page()  {
		
		System.out.println("I  am on the login page");
		Assert.assertTrue(false);
		
	    
	}

	@Given("^I entered valid username$")
	public void I_entered_valid_username()  {
		System.out.println("I entered the valid username$");
	}

	@Given("^I entered Valid password$")
	public void I_entered_Valid_password()  {
		System.out.println("I entered the Valid password$");
	    
	}

	@When("^i click the login  button$")
	public void i_click_the_login_button() {
		System.out.println("i successfully click the login  button$");
	    
	}

	@Then("^i should see  the dashboard$")
	public void i_should_see_the_dashboard()  {
		System.out.println("i  see  the dashboard$");
	   
	}
	
	@Given("^I entered the  invalid  username$")
	public void I_entered_the_invalid_username()  {
	   System.out.println("I entered  the  invalid username");
	}

	@Given("^I entered  the  invalid password$")
	public void I_entered_the_invalid_password() {
		System.out.println("I  entered the invalid password");
	    
	}

	@Then("^I should see the error message$")
	public void I_should_see_the_error_message()  {
	   System.out.println("I did see the error");
	}

}
