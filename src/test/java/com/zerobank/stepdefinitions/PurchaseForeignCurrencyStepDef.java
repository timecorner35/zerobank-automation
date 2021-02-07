package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PurchaseForeignCurrencyStepDef {
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> currencies) {
        PayBillsPage payBillsPage = new PayBillsPage();
        Select select = new Select(payBillsPage.currencyDropdpwn);
        List<String> actual = new ArrayList<>();
        for (WebElement currency : select.getOptions()) {
            actual.add(currency.getText());
        }
        Assert.assertTrue(actual.containsAll(currencies));


    }

    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        PayBillsPage payBillsPage = new PayBillsPage();
        payBillsPage.amountInput.sendKeys("1000");
        payBillsPage.calculateButton.click();
        BrowserUtils.waitFor(2);
//        Alert alert = Driver.get().switchTo().alert();
//        alert.dismiss();


    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        boolean flag=true;
        try{
            Alert alert = Driver.get().switchTo().alert();
            System.out.println("error message exists");

        }
        catch(NoAlertPresentException ex){
            flag=false;
            System.out.println("no error message");
        }
        finally {
            Assert.assertTrue(flag);

    }
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        PayBillsPage payBillsPage = new PayBillsPage();
        Select select = new Select(payBillsPage.currencyDropdpwn);
        select.selectByIndex(6);
        BrowserUtils.waitFor(2);
        payBillsPage.calculateButton.click();
        BrowserUtils.waitFor(2);

    }
}

