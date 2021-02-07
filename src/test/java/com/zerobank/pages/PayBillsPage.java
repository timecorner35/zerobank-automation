package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {
    @FindBy(xpath = "//*[.='Pay Saved Payee']")
    public WebElement paySavedPayee;

    @FindBy(xpath = "//*[.='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//*[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;






}
