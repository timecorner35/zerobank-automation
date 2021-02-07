package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PurchaseForeignCurrencyStepDef {
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> currencies) {
        PayBillsPage payBillsPage = new PayBillsPage();
        Select select = new Select(payBillsPage.currencyDropdpwn);
        List<String> actual = new ArrayList<>() ;
        for (WebElement currency : select.getOptions()) {
            actual.add(currency.getText());
        }
        Assert.assertTrue(actual.containsAll(currencies));



    }
}
