package cucumber.webTest.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import cucumber.webTest.BaseText;
import cucumber.webTest.page.HomePage;

public class Hooks extends BaseText {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
