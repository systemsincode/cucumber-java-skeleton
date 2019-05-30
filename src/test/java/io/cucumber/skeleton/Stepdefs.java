package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.*;


public class Stepdefs {
    Belly belly = new Belly();
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        System.out.println("Time flies when you're waiting for digestion.");
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        System.out.println("Thats what happens when you eat " + belly.cukeCount + "cukes");
    }

    @Given("Gherkin unimplemented step")
    public void unimplementedstep() {
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
}
