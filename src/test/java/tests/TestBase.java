package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase extends AbstractTestNGCucumberTests {
    public static ChromeDriver driver;
@BeforeSuite
    public void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://app.testing.paynas.com/");
    }
}
