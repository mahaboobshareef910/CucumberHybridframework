package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resource\\features",
                   glue= {"stepdefinitions","hooks"},
                  plugin={"pretty","html:target\\CucumberReports\\CucumberReport.html"},
                   tags = ("@invalid"),publish=true)
public class Testrunner {
//Note : here In Testrunner--Test is main reason for run with MavenTest
}
