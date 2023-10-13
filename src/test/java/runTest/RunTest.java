package runTest;


import com.airbnb.common.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = {"./src/test/resources/features"},
        glue = {"com.airbnb.steps", "com.airbnb.configuration"},
        tags = "@login")

public class RunTest extends BaseTest {

}
