package com.BookIT.step_definitions;

import com.BookIT.pages.BookITLoginPage;
import com.BookIT.pages.DashboardPage;
import com.BookIT.utilities.ConfigurationReader;
import com.BookIT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BookITLogin_StepDefinitions {
    BookITLoginPage loginPage = new BookITLoginPage();
    @Given("User is on BookIT login Page")
    public void user_is_on_book_it_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("BookIT.url"));
    }
    @When("user enters {string} to email field")
    public void user_enters_to_email_field(String username) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.emailInput.sendKeys(username);
    }
    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String password) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.passwordInput.sendKeys(password);
    }
    @When("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions

        loginPage.signinBtn.click();

    }

    @Then("user mainmap is visible")
    public void userMainmapIsVisible() {
        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(dashboardPage.mapView.isDisplayed());
    }
}
