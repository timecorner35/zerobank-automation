package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class FindTransactionsStepDef {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new AccountSummaryPage().accountActivity.click();
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.findTransactions.click();

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.dateFrom.clear();
        accountActivityPage.dateFrom.sendKeys(string);
        accountActivityPage.dateTo.clear();
        accountActivityPage.dateTo.sendKeys(string2);


    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) throws ParseException {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date fromDate = simpleDateFormat.parse(string);
        Date toDate = simpleDateFormat.parse(string2);
        BrowserUtils.waitFor(1);
        for (WebElement webElement : accountActivityPage.dateColomn) {
            Date date = simpleDateFormat.parse(webElement.getText());
            if (!(date.compareTo(fromDate)>=0&&date.compareTo(toDate)<=0)){
                Assert.fail();
            }else Assert.assertTrue(true);
        }
    }





    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().searchButton.click();
    }


    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() throws ParseException {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date mostRecent= simpleDateFormat.parse("2100-01-01");
        for (WebElement webElement : accountActivityPage.dateColomn) {
            if (simpleDateFormat.parse(webElement.getText()).compareTo(mostRecent)>=0){
                Assert.fail();
            }
            mostRecent=simpleDateFormat.parse(webElement.getText());


        }

        Assert.assertTrue(true);
    }


    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        accountActivityPage.description.clear();
        accountActivityPage.description.sendKeys(string);

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) throws Throwable {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        if (accountActivityPage.tablerows.size() == 0) {
            Assert.fail();

        }

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

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        for (WebElement webElement : accountActivityPage.depositColomn) {
            if (!webElement.getText().isEmpty()) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        for (WebElement webElement : accountActivityPage.withdrawColomn) {
            if (!webElement.getText().isEmpty()) {
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.fail();
    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        Select select = new Select(accountActivityPage.dropdown2);
        select.selectByValue(string.toUpperCase());
        accountActivityPage.searchButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        for (WebElement webElement : accountActivityPage.withdrawColomn) {
            System.out.println(webElement.getText());
            if (!webElement.getText().isEmpty()) {
                Assert.fail();
                return;
            }
        }
        Assert.assertTrue(true);

    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        for (WebElement webElement : accountActivityPage.depositColomn) {
            System.out.println(webElement.getText());
            if (!webElement.getText().isEmpty()) {
                Assert.fail();
                return;
            }
        }
        Assert.assertTrue(true);

    }


    @And("the results table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String string) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        AccountActivityPage accountActivityPage = new AccountActivityPage();
        for (WebElement webElement : accountActivityPage.dateColomn) {
            if (simpleDateFormat.parse(webElement.getText()).compareTo(simpleDateFormat.parse(string))==0){
                Assert.fail();
            }
            Assert.assertTrue(true);

        }
    }
}
