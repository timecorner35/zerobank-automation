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
}
