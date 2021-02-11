package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Queue;

public class PayBillsPage extends BasePage {
    @FindBy(xpath = "//*[.='Pay Saved Payee']")
    public WebElement paySavedPayee;

    @FindBy(xpath = "//*[.='Add New Payee']")
    public WebElement addNewPayee;

    @FindBy(xpath = "//*[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id = "np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement addButton;

    @FindBy(id = "alert_content")
    public WebElement alertContent;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdpwn;

    @FindBy(id = "pc_amount")
    public WebElement amountInput;

    @FindBy(id = "purchase_cash")
    public WebElement purchaseButton;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateButton;

    @FindBy(id = "sp_payeesp_payee")
    public WebElement choosePayee;

    @FindBy(id = "sp_account")
    public WebElement chooseAccount;

    @FindBy(id = "sp_amount")
    public WebElement chooseAmount;

    @FindBy(id = "sp_date")
    public WebElement chooseDate;

    @FindBy(id = "sp_description")
    public WebElement description;










}
