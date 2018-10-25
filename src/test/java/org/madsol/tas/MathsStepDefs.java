package org.madsol.tas;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MathsStepDefs {

    private int fruits = 0;

    @Given("^I have an apple$")
    public void i_have_an_apple() {
        fruits++;
    }

    @When("^John gives my (\\d+) more$")
    public void john_gives_my_more(int additionalFruits) {
        fruits += additionalFruits;
    }

    @Then("^I should have (\\d+) in total$")
    public void i_should_have_in_total(int totalAmountOfFruits) {
        Assert.assertTrue("I don't have enough fruits for a salad now :(",
                totalAmountOfFruits == fruits);
    }

}
