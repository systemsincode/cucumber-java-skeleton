package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress:target/progress.txt","pretty:target/pretty.txt","junit:target/cucumber-junit-report.xml","html:target/html.html","rerun:target/rerun.txt"}, tags = "not @ignore")
public class RunCucumberTest {
}
