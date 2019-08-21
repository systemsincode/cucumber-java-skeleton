//package io.cucumber.skeleton;

import io.cucumber.skeleton.RunCucumberFeature3Test;
import io.cucumber.skeleton.RunCucumberTest;
import io.cucumber.skeleton.RunCucumberFeature2Test;

import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ROOTElement.SubSuite1.class,
        //  ROOTElement.SubSuite1.SubSubSuite1.class (moved to SubSuite1)
        ROOTElement.SubSuite2.class
})

public class ROOTElement {
    // the class remains empty,
    // used only as a holder for the above annotations

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            RunCucumberTest.class,
            ROOTElement.SubSuite1.SubSubSuite1.class
    })

    public static class SubSuite1 {
        // the class only holds the sub sub suite code
        @RunWith(Suite.class)
        @Suite.SuiteClasses({
                RunCucumberFeature3Test.class
        })
        public static class SubSubSuite1 {
            // the class remains empty,
            // used only as a holder for the above annotations
        }

    }

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            RunCucumberFeature2Test.class
    })

    public static class SubSuite2 {
        // the class remains empty,
        // used only as a holder for the above annotations
    }
}
