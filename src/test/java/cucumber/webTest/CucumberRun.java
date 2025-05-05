package cucumber.webTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "cucumber.webTest.stepDef"
        },
        features = {"src/test/resources/web-feature"},
        plugin = {"pretty","html:reports/Web-Report.html", "json:reports/Web-Report.json"}
)

public class CucumberRun {
}
