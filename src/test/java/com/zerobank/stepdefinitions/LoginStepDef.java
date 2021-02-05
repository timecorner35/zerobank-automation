package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login();
        Thread.sleep(3000);
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
//        String expectedTitle = ""
//        Assert.assertEquals();

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
