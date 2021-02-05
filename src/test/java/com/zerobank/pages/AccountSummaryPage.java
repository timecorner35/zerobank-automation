package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage{
    @FindBy(xpath = "//tr/td/a")
    public WebElement savings;

    @FindBy(xpath = "(//tr/td/a)[3]")
    public WebElement brokarage;


}
