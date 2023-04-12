package CommonUtils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features",glue = "Steps",publish = true , tags = "@E2E")
public class TestRunner {

}
