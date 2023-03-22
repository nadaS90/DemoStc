package org.example.stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.SubscribePlanPage;
import org.junit.Assert;
import testData.Constants;

import java.util.concurrent.TimeUnit;

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
    public void user_select_saudi_arabia_as_a_country()
    {
        _planObject.UserClickOnCountryBtn();
        _planObject.DoesCountrySelectDisplayed();
        _planObject.UserClickOnCountrySelectionBtn(_planObject.KSACountry);
        Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("User finds plan types")
    public void user_finds_plan_types()
    {
        Assert.assertTrue(_planObject.LitePlaneOption.contains("LITE"));
        Assert.assertTrue(_planObject.ClassicPlaneOption.contains("CLASSIC"));
        Assert.assertTrue(_planObject.PremiumPlaneOption.contains("PREMIUM"));

    }
    @Then("The plan price and currency will change to SAR")
    public void the_plan_price_and_currency_will_change_to_sar()
    {
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KSACurrency));

        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KSALitePrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KSAClassicPrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KSAPremiumPrice));
    }

    @When("User Select Kuwait as a country")
    public void user_select_kuwait_as_a_country()
    {
        _planObject.UserClickOnCountryBtn();
        _planObject.DoesCountrySelectDisplayed();
        _planObject.UserClickOnCountrySelectionBtn(_planObject.KuwaitCountry);
        Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("The plan price and currency will change to KWD")
    public void the_plan_price_and_currency_will_change_to_kwd()
    {
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KuwaitCurrency));

        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KWDLitePrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KWDClassicPrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.KWDPremiumPrice));
    }

    @When("User Select Bahrain as a country")
    public void user_select_bahrain_as_a_country() {
        _planObject.UserClickOnCountryBtn();
        _planObject.DoesCountrySelectDisplayed();
        _planObject.UserClickOnCountrySelectionBtn(_planObject.BahrainCountry);
        Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("The plan price and currency will change to BHD")
    public void the_plan_price_and_currency_will_change_to_bhd() {
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.BahrainCurrency));

        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.BHLitePrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.BHClassicPrice));
        Assert.assertTrue(_planObject.PlanPrices.contains(Constants.BHPremiumPrice));
    }



}
