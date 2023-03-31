package runner;

import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import tests.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/features/UserLogin.feature", glue = {"steps"},
      plugin = {"pretty","html:target/cucmber-html-report"})
public class TestRunner extends TestBase{

}
