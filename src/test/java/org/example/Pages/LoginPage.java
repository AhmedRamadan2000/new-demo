package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public WebElement usernameField = driver.findElement(By.id("Email"));
    public WebElement passwordField = driver.findElement(By.id("Password"));
    public WebElement loginButton = driver.findElement(By.className("button-1 login-button"));
}
