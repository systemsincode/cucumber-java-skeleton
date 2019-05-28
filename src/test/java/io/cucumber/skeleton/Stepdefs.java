package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class Stepdefs {
    Belly belly = new Belly();
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Time flies when you're waiting for digestion.");
        //throw new cucumber.api.PendingException();
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Thats what happens when you eat " + belly.cukeCount + "cukes");
        //throw new cucumber.api.PendingException();
    }

}
