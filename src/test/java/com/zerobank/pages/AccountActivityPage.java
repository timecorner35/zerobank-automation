package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{
    @FindBy(id = "aa_accountId")
    public WebElement dropdown;
    public Select select = new Select(dropdown);




}
