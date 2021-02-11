package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        new DashboardPage().accountSummary.click();
        new AccountSummaryPage().savings.click();

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Zero - Account Activity";
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        Assert.assertEquals("Savings", new AccountActivityPage().select.getFirstSelectedOption().getText());
    }


    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        new DashboardPage().accountSummary.click();
        new AccountSummaryPage().brokarage.click();
    }


    @When("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        Assert.assertEquals("Brokerage", new AccountActivityPage().select.getFirstSelectedOption().getText());

    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().checking.click();
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        Assert.assertEquals("Checking", new AccountActivityPage().select.getFirstSelectedOption().getText());
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().creditCard.click();
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        Assert.assertEquals("Credit Card", new AccountActivityPage().select.getFirstSelectedOption().getText());
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        new AccountSummaryPage().loan.click();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        Assert.assertEquals("Loan", new AccountActivityPage().select.getFirstSelectedOption().getText());
    }

    @Then("the page should have following account types")
    public void the_page_should_have_following_account_types(List<String> accountTypes) {
        Assert.assertEquals(accountTypes, BrowserUtils.getElementsText(new AccountSummaryPage().accountTypes));

    }

    @Then("Credit Accounts table must have following columns")
    public void credit_Accounts_table_must_have_following_columns(List<String> creditTypes) {
        Assert.assertEquals(creditTypes,BrowserUtils.getElementsText(new AccountSummaryPage().creditRows));
        System.out.println(BrowserUtils.getElementsText(new AccountSummaryPage().creditRows));


    }


}
