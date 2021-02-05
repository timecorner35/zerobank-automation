package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{
    @FindBy(xpath = "//tr/td/a")
    public WebElement savings;

    @FindBy(xpath = "(//tr/td/a)[3]")
    public WebElement brokarage;

    @FindBy(xpath = "(//tr/td/a)[4]")
    public WebElement checking;

    @FindBy(xpath = "(//tr/td/a)[5]")
    public WebElement creditCard;

    @FindBy(xpath = "(//tr/td/a)[6]")
    public WebElement loan;


}
