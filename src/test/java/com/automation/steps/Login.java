package com.automation.steps;
import com.automation.ui.pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

public class Login{

    @Autowired
    Home home;
    @Autowired
    Login loginPage;

    @Given("the Home page")
    public void theHomePage() {
        Assertions.assertThat(home.txtMainHeading.exists()).withFailMessage("Could not find the main heading text").isTrue();
    }

    @When("user clicks on the Login button")
    public void user_clicks_on_the_login_button() {

    }
    @Then("user should see {string} is visible")
    public void user_should_see_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters incorrect credentials")
    public void user_enters_incorrect_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click login button")
    public void user_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user should see the error {string}")
    public void userShouldSeeTheError(String arg0) {
    }

}
