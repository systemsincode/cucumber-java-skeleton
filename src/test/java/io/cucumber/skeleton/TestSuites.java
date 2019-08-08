//package io.cucumber.skeleton;
import io.cucumber.skeleton.RunCucumberTest;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestSuites.SubSuite1.class
})

public class TestSuites {
    // the class remains empty,
    // used only as a holder for the above annotations

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            RunCucumberTest.class
    })

    public static class SubSuite1{
        // the class remains empty,
        // used only as a holder for the above annotations
    }
}
