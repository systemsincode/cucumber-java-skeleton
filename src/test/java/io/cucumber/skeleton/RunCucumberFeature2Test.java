package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress:target/progress2.txt","pretty:target/pretty2.txt","junit:target/cucumber-junit-report2.xml","html:target/html2.html","rerun:target/rerun2.txt"},
        tags = "not @ignore",
        features = "src\\test\\resources\\io\\cucumber\\skeleton\\TestRailTest2trunc.feature")

public class RunCucumberFeature2Test {
}
