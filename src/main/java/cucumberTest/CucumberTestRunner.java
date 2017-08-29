package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/cucumberFeatureWithExamples.feature",glue = {"cucumberStepDefinition"},dryRun = false/*,monochrome = false*/)

public class CucumberTestRunner {

}
