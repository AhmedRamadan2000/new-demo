package runner;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions (features = "src/test/java/features/UserLogin.feature", glue = {"steps"},
      plugin = {"pretty","html:target/cucmber-html-report"})
public class TestRunner extends TestBase{

}
