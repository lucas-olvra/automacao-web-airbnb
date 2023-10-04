package runTest;


import com.airbnb.common.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:report/reports"},
        features = {"./src/test/resources/features"},
        glue = {"com.airbnb.steps", "com.airbnb.common.configuration"},
        tags = "@signup")

public class RunTest extends BaseTest {

}
