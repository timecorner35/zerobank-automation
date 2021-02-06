package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{
    @FindBy(id = "aa_accountId")
    public WebElement dropdown;
    public Select select = new Select(dropdown);

    @FindBy(xpath = "(//li/a)[15]")
    public WebElement findTransactions;

    @FindBy(id = "aa_fromDate")
    public WebElement dateFrom;

    @FindBy(id = "aa_toDate")
    public WebElement dateTo;

    @FindBy(css = ".btn.btn-primary")
    public WebElement searchButton;

    @FindBy(id = "aa_description")
    public WebElement description;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']//tbody/tr")
    public List<WebElement> tablerows;











}
