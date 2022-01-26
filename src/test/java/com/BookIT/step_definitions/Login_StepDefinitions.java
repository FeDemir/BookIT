package com.BookIT.step_definitions;

import com.BookIT.pages.DashboardPage;
import com.BookIT.pages.LoginPage;
import com.BookIT.utilities.ConfigurationReader;
import com.BookIT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

        WebDriver driver = Driver.getDriver();
        LoginPage loginPage = new LoginPage();
        WebDriverWait wait  =new WebDriverWait(driver,30);
        @Given("the user on the {string} login page")
        public void the_user_on_the_login_page(String env) {
            driver.get(ConfigurationReader.getProperty(env));
        }
        @When("user logs in using {string} and {string}")
        public void user_logs_in_using_and(String username, String password) {
            loginPage.signin(username,password);
        }
        @Then("the user should be able login")
        public void the_user_should_be_able_login() {

        }
        @Then("dashboard page header should be visible")
        public void dashboard_page_header_should_be_visible() {
            DashboardPage dashboardPage = new DashboardPage();
            Assert.assertTrue(dashboardPage.header.isDisplayed());
        }

        @Then("the user shouldn't be able login")
        public void the_user_shouldn_t_be_able_login() {

        }
        @Then("user should be able to see “ [objectProgressEvent] ” message")
        public void user_should_be_able_to_see_object_progress_event_message() {
            wait.until(ExpectedConditions.visibilityOf(loginPage.signinFailedMessage));
            Assert.assertTrue(loginPage.signinFailedMessage.isDisplayed());
        }

        @Then("sing in button should be disabled")
        public void sing_in_button_should_be_disabled() {
            System.out.println("loginPage = " + loginPage.signinBtn.isEnabled());
            Assert.assertFalse(loginPage.signinBtn.isEnabled());
        }
}

