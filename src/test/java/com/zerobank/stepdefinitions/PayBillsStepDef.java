package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class PayBillsStepDef {
    
    @And("user choose all combination of payee and amount")
    public void userChooseAllCombinationOfPayeeAndAmount() {
        PayBillsPage payBillsPage = new PayBillsPage();

        Select payee = new Select(payBillsPage.choosePayee);
        Select account = new Select(payBillsPage.chooseAccount);
        account.selectByIndex(2);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                payee.selectByIndex(i);
                payBillsPage.chooseAmount.sendKeys("100");
                payBillsPage.chooseDate.sendKeys("2021-02-02", Keys.ENTER);
                account.selectByIndex(j);
              payBillsPage.description.sendKeys("hi",Keys.ENTER);
                Assert.assertEquals("The payment was successfully submitted.", payBillsPage.alertcontent.getText());

            }
        }

    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String arg0) {
        Assert.assertEquals(arg0,new PayBillsPage().alertcontent.getText());
    }

    @When("user uses following {string} and {string}")
    public void user_uses_following_and(String amount,String date) {

        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.chooseDate.sendKeys(date);
        payBillsPage.chooseAmount.sendKeys(amount);

    }
    @Then("{string} message should be displated")
    public void message_should_be_displated(String string) {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.description.sendKeys("hi",Keys.ENTER);
        if (payBillsPage.chooseAmount.getAttribute("value").isEmpty()) {
            Assert.assertEquals(string, payBillsPage.chooseAmount.getAttribute("validationMessage"));
        }else Assert.assertEquals(string, payBillsPage.chooseDate.getAttribute("validationMessage"));



    }



}
