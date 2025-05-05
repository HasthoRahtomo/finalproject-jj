package cucumber.apiTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "cucumber.apiTest.stepDef"
        },
        features = {"src/test/resources/api-feature"},
        plugin = {"pretty","html:reports/Api-Report.html", "json:reports/Api-Report.json"}
)

public class cucumberRunApi {
}
