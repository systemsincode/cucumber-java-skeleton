//package io.cucumber.skeleton;
import io.cucumber.skeleton.RunCucumberTest;
import io.cucumber.skeleton.RunCucumberTestFeature2;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestSuites.SubSuite1.class,
        TestSuites.SubSuite2.class
})

public class TestSuites {
    // the class remains empty,
    // used only as a holder for the above annotations

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            RunCucumberTest.class
    })

    public static class SubSuite1 {
        // the class remains empty,
        // used only as a holder for the above annotations
    }
    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            RunCucumberTestFeature2.class
    })

    public static class SubSuite2{
        // the class remains empty,
        // used only as a holder for the above annotations
    }
}
