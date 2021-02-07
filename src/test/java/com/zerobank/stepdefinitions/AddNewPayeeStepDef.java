package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddNewPayeeStepDef {

    @Given("the user accesses the {string} page")
    public void the_user_accesses_the_page(String string) {
        string=string.toLowerCase();
        switch (string) {
            case "pay bills":
                new DashboardPage().payBills.click();
                break;
            case "account activity":
                new DashboardPage().accountActivity.click();
                break;
            case "transfer funds":
                new DashboardPage().transferFunds.click();
                break;
            case "my money map":
                new DashboardPage().myMoneyMap.click();
                break;
            case "online statements":
                new DashboardPage().onlineStatements.click();
                break;
            case " account summary":
                new DashboardPage().accountSummary.click();
                break;


        }
        BrowserUtils.waitFor(3);

    }

    @Given("user access {string} tab")
    public void user_access_tab(String string) {
        PayBillsPage payBillsPage = new PayBillsPage();
        string = string.toLowerCase();
        switch (string) {
            case "add new payee" -> payBillsPage.addNewPayee.click();
            case "purchase foreign currency" -> payBillsPage.purchaseForeignCurrency.click();
            case "pay saved payee" -> payBillsPage.paySavedPayee.click();
        }
        BrowserUtils.waitFor(3);
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> userInfo) {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.payeeName.sendKeys(userInfo.get("Payee Name"));
        payBillsPage.payeeAddress.sendKeys(userInfo.get("Payee Address"));
        payBillsPage.payeeAccount.sendKeys(userInfo.get("Account"));
        payBillsPage.payeeDetails.sendKeys(userInfo.get("Payee Details"));
        payBillsPage.addButton.click();

        BrowserUtils.waitFor(2);

    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertEquals(string,new PayBillsPage().alertContent.getText());
        System.out.println(new PayBillsPage().alertContent.getText());

    }
}
