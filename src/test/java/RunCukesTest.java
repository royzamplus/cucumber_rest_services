import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by liudi on 5/3/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:out" }, snippets = SnippetType.CAMELCASE)
public class RunCukesTest {
}
