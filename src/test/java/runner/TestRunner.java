package runner;

import cucumber.api.CucumberOptions;
//import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Aschalew on 23/11/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue={"stepdefinition"})
public class TestRunner {
}
