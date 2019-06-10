package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;


public class Stepdefs {
    Belly belly = new Belly();
    private String param;

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        System.out.println("Time flies when you're waiting " + int1 + " hour/s for digestion.");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("Thats what happens when you eat " + belly.cukeCount + " cukes");
    }

    @Given("Gherkin only pending step")
    public void pending() {
        throw new cucumber.api.PendingException();
    }

    @Given("Gherkin step")
    public void step() {
        System.out.println("Gherkin step...");
    }

    @Then("Gherkin success")
    public void success() {
        Assert.assertTrue(true);
        System.out.println("I have asserted true");
    }

    @Then("Gherkin failure")
    public void failure() {
        Assert.fail();
        System.out.println("I have asserted failure");
    }

    @Given("Gherkin background step that passes")
    public void backgroundStepThatPasses() {
        Assert.assertTrue(true);
    }

    //The steps can use <> delimited parameters that reference headers in the examples table. Cucumber will replace these
// parameters with values from the table before it tries to match the step against a step definition.
    @Given("Gherkin parameterised step (.)")
    public void gherkinParameterisedStep(String a) {
        System.out.println(a);
    }

    @Given("Gherkin parameterised step that fails (.*)")
    public void gherkinParameterisedStepThatFails(String a) {
        Assert.fail();
        System.out.println("I have asserted failure");
    }

    @Given("Gherkin parameterised step that partially fails (.*)")
    public void gherkinParameterisedStepThatPartiallyFails(String a) {
        if (a.equals("a")) {
            Assert.fail();
            System.out.println("I have asserted failure");
        } else Assert.assertTrue(true);
        System.out.println("I have asserted success");
    }
}
