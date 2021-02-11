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

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']//tbody//td[3]")
    public List<WebElement> depositColomn;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']//tbody//td[4]")
    public List<WebElement> withdrawColomn;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']//tbody//td[1]")
    public List<WebElement> dateColomn;

    @FindBy(name = "type")
    public WebElement dropdown2;

    @FindBy(xpath = "//div/table/thead/tr/th")
    public List<WebElement> creditRows;



    //public Select selectTransactions = new Select(dropdown2);












}
