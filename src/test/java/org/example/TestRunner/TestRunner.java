package org.example.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"org.example.StepDefinitions"},
        plugin = {"pretty", "html:target/cucmber-html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
