package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDef {
    @Then("the page should have following account types")
    public void the_page_should_have_following_account_types(List<String> accountTypes) {
        Assert.assertEquals(accountTypes, BrowserUtils.getElementsText(new AccountSummaryPage().accountTypes));

    }

    @Then("Credit Accounts table must have following columns")
    public void credit_Accounts_table_must_have_following_columns(List<String> creditTypes) {
        Assert.assertEquals(creditTypes,BrowserUtils.getElementsText(new AccountSummaryPage().creditRows));
        System.out.println(BrowserUtils.getElementsText(new AccountSummaryPage().creditRows));


    }
    @Then("page should have the title {string} activity.")
    public void page_should_have_the_title_activity(String string) {
        Assert.assertEquals(string, Driver.get().getTitle());
    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String string) {
        new AccountSummaryPage().navigateTo(string);



    }



}
