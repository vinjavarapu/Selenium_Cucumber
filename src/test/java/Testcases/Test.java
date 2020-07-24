package Testcases;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

    @When("^i am on x pahe$")
    public void i_am_on_x_pahe() throws Throwable {

        System.out.println("The text 1");

    }

    @Then("^i see y element$")
    public void i_see_y_element() throws Throwable {

        System.out.println("The text on 2");

    }
}
