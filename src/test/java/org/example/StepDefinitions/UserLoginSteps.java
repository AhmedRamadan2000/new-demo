package org.example.StepDefinitions;

import org.example.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserLoginSteps {

    WebDriver driver;
    LoginPage Login = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        Login.usernameField.sendKeys("test@test.com");
        Login.passwordField.sendKeys("123456789");
    }

    @And("click on the login button")
    public void click_on_the_login_button() {
        Login.loginButton.click();
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.nopcommerce.com/", currentUrl);
    }
}