package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UserLoginSteps {

    WebDriver driver;
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        usernameField.sendKeys("myusername");
        passwordField.sendKeys("mypassword");
        throw new io.cucumber.java.PendingException();
    }

    @And("click on the login button")
    public void click_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be redirected to the overview page")
    public void i_should_be_redirected_to_the_overview_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://example.com/home", currentUrl);
        driver.quit();
        throw new io.cucumber.java.PendingException();
    }

}
