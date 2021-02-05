package com.zerobank.stepdefinitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));

    }


    @When("the user clicks on Savings link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
