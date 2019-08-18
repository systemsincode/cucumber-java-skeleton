package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress:target/progress1.txt","pretty:target/pretty1.txt","junit:target/cucumber-junit-report1.xml","html:target/html1.html","rerun:target/rerun1.txt"},
        tags = "not @ignore",
        features = "src\\test\\resources\\io\\cucumber\\skeleton\\TestRailTest1.feature")

public class RunCucumberTest{
}
