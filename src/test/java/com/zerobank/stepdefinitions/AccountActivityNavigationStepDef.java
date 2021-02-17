package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigationStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        new LoginPage().login();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Account Summary";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Zero - Account Activity";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        Assert.assertEquals(string, new AccountActivityPage().select.getFirstSelectedOption().getText());
    }





}
