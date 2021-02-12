package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AccountActivityStepDef {
    @Then("Account dropdown should have following options")
    public void accountDropdownShouldHaveFollowingOptions(List<String> accountActivityOptions) {
        Select select = new Select(new AccountActivityPage().dropdown);
        Set<String> expected = new HashSet<>(accountActivityOptions);
        Set<String> actual = new HashSet<>(BrowserUtils.getElementsText(select.getOptions()));
        Assert.assertEquals(expected,actual);

    }

    @Then("Transactions table should have column names")
    public void transactionsTableShouldHaveColumnNames(List<String > colemnnames) {
        Assert.assertEquals(colemnnames,BrowserUtils.getElementsText(new AccountActivityPage().creditRows));
    }
}