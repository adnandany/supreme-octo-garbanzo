package stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountTest extends BaseClass {

	@Given("^I open chrome browser$")
	public void I_open_chrome_browser() throws IOException {
		openBrowser("chrome", "https://login.salesforce.com/");
	}

	@Given("^I am on the login page$")
	public void I_am_on_the_login_page() {
		driver.getCurrentUrl();
	}

	@Given("^I enter  username as \"([^\"]*)\"$")
	public void I_enter_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("^I enter  password as \"([^\"]*)\"$")
	public void I_enter_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("^I click the login button$")
	public void I_click_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the dashboard$")
	public void I_should_see_the_dashboard() {
		Assert.assertTrue(driver.findElement(By.linkText("Accounts")).isDisplayed());
	}

	@Then("^I click the Accounts tab$")
	public void I_click_the_Accounts_tab() {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@Then("^I click the New button$")
	public void I_click_the_New_button() {
		driver.findElement(By.name("new")).click();
	}

	@Then("^I should see Account Name field$")
	public void I_should_see_Account_Name_field() {
		Assert.assertTrue(driver.findElement(By.id("acc2")).isDisplayed());
	}

	@Then("^I should see Account Number field$")
	public void I_should_see_Account_Number_field() {
		Assert.assertTrue(driver.findElement(By.id("acc2")).isDisplayed());
	}

	@Then("^I should see Type field with different option$")
	public void I_should_see_Type_field_with_different_option() {
		Assert.assertTrue(driver.findElement(By.id("acc2")).isDisplayed());
	}

	@When("^I click the Save button$")
	public void I_click_the_Save_button() {
	}

	@Then("^I should see the record$")
	public void I_should_see_the_record() {
	}
}