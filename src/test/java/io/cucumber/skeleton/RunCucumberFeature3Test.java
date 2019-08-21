package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress:target/progress3.txt","pretty:target/pretty3.txt","junit:target/cucumber-junit-report3.xml","html:target/html3.html","rerun:target/rerun3.txt"},
        tags = "not @ignore",
        features = "src\\test\\resources\\io\\cucumber\\skeleton\\TestRailTest3trunc.feature")

public class RunCucumberFeature3Test {
}
