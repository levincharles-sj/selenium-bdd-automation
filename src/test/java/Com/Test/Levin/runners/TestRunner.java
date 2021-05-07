package Com.Test.Levin.runners;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Com.Test.Levin.stepDefinitions"},
        tags = {"~@Ignore"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class TestRunner {
	
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Features", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        testNGCucumberRunner.finish();
    }
}