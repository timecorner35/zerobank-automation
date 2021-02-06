package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Date;


public class FindTransactionsStepDef {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new DashboardPage().accountActivity.click();
        new AccountActivityPage().findTransactions.click();

    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.dateFrom.sendKeys("2012-09-01");
        accountActivityPage.dateTo.sendKeys("2012-09-06");


    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();



    }


    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().searchButton.click();
    }


    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.description.clear();
        accountActivityPage.description.sendKeys(string);

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        BrowserUtils.waitFor(1);
        for (WebElement tablerow : accountActivityPage.tablerows) {
            System.out.println(tablerow.getText());
            Assert.assertTrue(tablerow.getText().contains(string));

        }

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
