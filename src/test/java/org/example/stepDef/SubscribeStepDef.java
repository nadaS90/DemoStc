package org.example.stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.SubscribePlanPage;

public class SubscribeStepDef
{
    SubscribePlanPage _planObject;
    public SubscribeStepDef()
    {
        this._planObject = new SubscribePlanPage(Hooks.driver);
    }

    @Given("User navigate to the website")
    public void user_navigate_to_the_website()
    {
        System.out.println(Hooks.driver.getCurrentUrl());
    }
    @When("User Select Saudi Arabia as a country")
    public void user_select_saudi_arabia_as_a_country() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User finds plan types")
    public void user_finds_plan_types() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The plan price and currency will change to SAR")
    public void the_plan_price_and_currency_will_change_to_sar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
