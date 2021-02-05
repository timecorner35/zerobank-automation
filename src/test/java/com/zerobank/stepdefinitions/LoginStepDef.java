package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in()  {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().login();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Account Summary";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    @When("the user clicks on Savings link on the Account Summary page Then the Account Activity page should be displayed")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page_Then_the_Account_Activity_page_should_be_displayed() {
        new DashboardPage().accountSummary.click();
        new AccountSummaryPage().savings.click();
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Zero - Account Activity";
        Assert.assertEquals(expectedTitle,actualTitle);





    }

    @When("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        Assert.assertEquals("Savings", new AccountActivityPage().select.getFirstSelectedOption().getText());
    }

}
